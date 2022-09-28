package io.muenchendigital.digiwf.ocecosmos.integration.api.streaming;

import io.muenchendigital.digiwf.ocecosmos.integration.api.dto.request.JobRequestDto;
import io.muenchendigital.digiwf.ocecosmos.integration.api.dto.request.OceCosmosEventDto;
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
     * The Consumer expects an {@link OceCosmosEventDto} which represents an {@link JobRequestDto}.
     * <p>
     * After successfully requesting the printing job a JSON representing a {@link JobResponse} is returned.
     * <p>
     * In case of an error the error message is returned as a JSON representing {@link OceCosmosErrorDto}.
     */
    @Bean
    public Consumer<Message<OceCosmosEventDto>> requestPrint() {
        return message -> {
            log.debug(message.toString());

            final var printRequest = (JobRequestDto) message.getPayload().getRequest();

            Object printJobResult;
            try {
                final JobRequest model = this.oceCosmosMapper.dto2Model(printRequest);
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


}
