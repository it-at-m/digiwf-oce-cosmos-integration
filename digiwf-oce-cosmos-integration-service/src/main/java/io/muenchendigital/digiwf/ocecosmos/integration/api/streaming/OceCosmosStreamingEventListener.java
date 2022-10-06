package io.muenchendigital.digiwf.ocecosmos.integration.api.streaming;

import com.google.common.jimfs.Jimfs;
import io.muenchendigital.digiwf.ocecosmos.integration.api.dto.request.JobRequestDto;
import io.muenchendigital.digiwf.ocecosmos.integration.api.dto.response.OceCosmosErrorDto;
import io.muenchendigital.digiwf.ocecosmos.integration.api.mapper.OceCosmosMapper;
import io.muenchendigital.digiwf.ocecosmos.integration.model.request.JobRequest;
import io.muenchendigital.digiwf.ocecosmos.integration.model.response.JobResponse;
import io.muenchendigital.digiwf.ocecosmos.integration.service.JobService;
import io.muenchendigital.digiwf.spring.cloudstream.utils.api.streaming.service.CorrelateMessageService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.Message;

import java.io.IOException;
import java.nio.file.FileSystem;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Map;
import java.util.function.Consumer;

@Configuration
@RequiredArgsConstructor
@Slf4j
public class OceCosmosStreamingEventListener {

    private static final String RESPONSE = "response";

    private final OceCosmosMapper oceCosmosMapper;

    private final CorrelateMessageService correlateMessageService;

    private final JobService jobService;


    /**
     * The Consumer expects an {@link JobRequestDto}.
     * <p>
     * After successfully requesting the printing job a JSON representing a {@link JobResponse} is returned.
     * <p>
     * In case of an error the error message is returned as a JSON representing {@link OceCosmosErrorDto}.
     */
    @Bean
    public Consumer<Message<JobRequestDto>> requestPrint() {
        return message -> {
            log.debug(message.toString());

            final var printRequest = message.getPayload();

            Object printJobResult;

            try(FileSystem fileSystem = Jimfs.newFileSystem()) {
                final JobRequest model = this.oceCosmosMapper.dto2Model(printRequest);
                model.setFile(convertByteArrayToFile(printRequest, fileSystem));

                printJobResult = this.jobService.submitJob(model);
            } catch (final Exception exception) {
                printJobResult = new OceCosmosErrorDto(exception.getMessage());
            }

            this.correlateMessageService.sendCorrelateMessage(
                    message.getHeaders(),
                    Map.of(RESPONSE, printJobResult)
            );
        };
    }

    private Path convertByteArrayToFile(JobRequestDto printRequest, FileSystem fileSystem) throws IOException {
        //Convert Byte-Array from request to in-mem file
        Path tmpPath = fileSystem.getPath("tmp");
        Files.createDirectory(tmpPath);
        Path filePath = tmpPath.resolve(printRequest.getFileName());
        Files.write(filePath, printRequest.getFile());
        return filePath;
    }


}
