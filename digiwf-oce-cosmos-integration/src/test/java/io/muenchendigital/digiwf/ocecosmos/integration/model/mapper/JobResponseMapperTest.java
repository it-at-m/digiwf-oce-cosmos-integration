package io.muenchendigital.digiwf.ocecosmos.integration.model.mapper;

import io.muenchendigital.digiwf.ocecosmos.integration.gen.model.Jobs;
import io.muenchendigital.digiwf.ocecosmos.integration.model.response.JobResponse;
import org.junit.jupiter.api.Test;
import org.mapstruct.factory.Mappers;
import org.springframework.test.util.ReflectionTestUtils;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class JobResponseMapperTest {

    private JobResponseMapper jobResponseMapper = Mappers.getMapper(JobResponseMapper.class);

    @Test
    public void mappertest() {
        var jobs = new Jobs();
        ReflectionTestUtils.setField(jobs, "id", 123L);

        JobResponse response = jobResponseMapper.map(jobs);

        assertThat(response.getJobId(), is(jobs.getId()));
    }

}
