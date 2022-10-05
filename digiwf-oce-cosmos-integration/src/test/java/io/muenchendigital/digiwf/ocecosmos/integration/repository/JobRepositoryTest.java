package io.muenchendigital.digiwf.ocecosmos.integration.repository;

import io.muenchendigital.digiwf.ocecosmos.integration.exception.OceCosmosIntegrationClientErrorException;
import io.muenchendigital.digiwf.ocecosmos.integration.exception.OceCosmosIntegrationException;
import io.muenchendigital.digiwf.ocecosmos.integration.exception.OceCosmosIntegrationServerErrorException;
import io.muenchendigital.digiwf.ocecosmos.integration.gen.api.FileStatusOperationsApi;
import io.muenchendigital.digiwf.ocecosmos.integration.gen.api.JobAttributeOperationsApi;
import io.muenchendigital.digiwf.ocecosmos.integration.gen.api.JobOperationsApi;
import io.muenchendigital.digiwf.ocecosmos.integration.gen.model.Jobs;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;
import org.springframework.http.HttpStatus;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.HttpServerErrorException;

import java.util.Collections;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.empty;
import static org.hamcrest.Matchers.is;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.ArgumentMatchers.any;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
class JobRepositoryTest {

    @Mock
    private JobOperationsApi jobOperationsApi;
    @Mock
    private JobAttributeOperationsApi jobAttributeOperationsApi;
    @Mock
    private FileStatusOperationsApi fileStatusOperationsApi;

    private JobRepository jobRepository;

    @BeforeEach
    public void beforeEach() {
        this.jobRepository = new JobRepository(this.jobOperationsApi, this.jobAttributeOperationsApi, this.fileStatusOperationsApi);
        Mockito.reset(this.jobOperationsApi, this.jobAttributeOperationsApi, this.fileStatusOperationsApi);
    }

    @Test
    void createJob() throws OceCosmosIntegrationException, OceCosmosIntegrationServerErrorException, OceCosmosIntegrationClientErrorException {
        final var jobRequest = getPrefilledJob();
        final var jobReturn = getPrefilledJob().parentId(123L);

        Mockito.when(this.jobOperationsApi.postUsingPOST5(jobRequest)).thenReturn(jobReturn);

        final var result = this.jobRepository.createJob(jobRequest);

        assertThat(result.getParentId(), is(123L));

        Mockito.verify(this.jobOperationsApi, Mockito.times(1)).postUsingPOST5(jobRequest);
    }

    @Test
    void createJobClientException() {
        final var jobRequest = getPrefilledJob();

        Mockito.when(this.jobOperationsApi.postUsingPOST5(jobRequest)).thenThrow(new HttpClientErrorException(HttpStatus.BAD_REQUEST));

        Exception exception = assertThrows(OceCosmosIntegrationClientErrorException.class,
                () -> this.jobRepository.createJob(jobRequest));

        assertThat(exception.getMessage(), is("The request to create a job failed with 400 BAD_REQUEST."));

        Mockito.verify(this.jobOperationsApi, Mockito.times(1)).postUsingPOST5(jobRequest);
    }

    @Test
    void createJobServerException() {
        final var jobRequest = getPrefilledJob();

        Mockito.when(this.jobOperationsApi.postUsingPOST5(jobRequest)).thenThrow(new HttpServerErrorException(HttpStatus.INTERNAL_SERVER_ERROR));

        Exception exception = assertThrows(OceCosmosIntegrationServerErrorException.class,
                () -> this.jobRepository.createJob(jobRequest));

        assertThat(exception.getMessage(), is("The request to create a job failed with 500 INTERNAL_SERVER_ERROR."));

        Mockito.verify(this.jobOperationsApi, Mockito.times(1)).postUsingPOST5(jobRequest);
    }

    @Test
    void createJobUnknownException() {
        final var jobRequest = getPrefilledJob();

        Mockito.when(this.jobOperationsApi.postUsingPOST5(jobRequest)).thenThrow(new RuntimeException("Look at me, I'm an exception"));

        Exception exception = assertThrows(OceCosmosIntegrationException.class,
                () -> this.jobRepository.createJob(jobRequest));

        assertThat(exception.getMessage(), is("The request to create a job failed."));

        Mockito.verify(this.jobOperationsApi, Mockito.times(1)).postUsingPOST5(jobRequest);
    }

    @Test
    void queryEmptyJob() throws OceCosmosIntegrationException, OceCosmosIntegrationServerErrorException, OceCosmosIntegrationClientErrorException {
        final var jobRequest = getPrefilledJob();
        final var jobsReturn = Collections.<Jobs>emptyList();

        String search = String.format("status==0 and customField==SAMMELJOB and customField1==%s and customField2==%s",
                jobRequest.getCustomField1(), jobRequest.getCustomField2());
        Mockito.when(this.jobOperationsApi.getUsingGET7(null, null, null, search)).thenReturn(jobsReturn);

        final var result = this.jobRepository.queryJobs(jobRequest);

        assertThat(result, empty());

        Mockito.verify(this.jobOperationsApi, Mockito.times(1)).getUsingGET7(null, null, null, search);
    }

    @Test
    void queryJobClientException() {
        final var jobRequest = getPrefilledJob();

        Mockito.when(this.jobOperationsApi.getUsingGET7(any(), any(), any(), any())).thenThrow(new HttpClientErrorException(HttpStatus.BAD_REQUEST));

        Exception exception = assertThrows(OceCosmosIntegrationClientErrorException.class,
                () -> this.jobRepository.queryJobs(jobRequest));

        assertThat(exception.getMessage(), is("The request to query for jobs failed with 400 BAD_REQUEST."));

        Mockito.verify(this.jobOperationsApi, Mockito.times(1)).getUsingGET7(any(), any(), any(), any());
    }

    @Test
    void queryJobServerException() {
        final var jobRequest = getPrefilledJob();

        Mockito.when(this.jobOperationsApi.getUsingGET7(any(), any(), any(), any())).thenThrow(new HttpServerErrorException(HttpStatus.INTERNAL_SERVER_ERROR));

        Exception exception = assertThrows(OceCosmosIntegrationServerErrorException.class,
                () -> this.jobRepository.queryJobs(jobRequest));

        assertThat(exception.getMessage(), is("The request to query for jobs failed with 500 INTERNAL_SERVER_ERROR."));

        Mockito.verify(this.jobOperationsApi, Mockito.times(1)).getUsingGET7(any(), any(), any(), any());
    }

    @Test
    void queryJobUnknownException() {
        final var jobRequest = getPrefilledJob();

        Mockito.when(this.jobOperationsApi.getUsingGET7(any(), any(), any(), any())).thenThrow(new RuntimeException("Look at me, I'm an exception"));

        Exception exception = assertThrows(OceCosmosIntegrationException.class,
                () -> this.jobRepository.queryJobs(jobRequest));

        assertThat(exception.getMessage(), is("The request to query for jobs failed."));

        Mockito.verify(this.jobOperationsApi, Mockito.times(1)).getUsingGET7(any(), any(), any(), any());
    }

    private Jobs getPrefilledJob() {
        return new Jobs()
                .client("Test")
                .title("PAPI.Test.SAMMELJOB")
                .categoryName("Jobs")
                .dataType("JSON")
                .inputChannel("RESTAPI")
                .customField("SAMMELJOB")
                .customField1("Test");
    }

}
