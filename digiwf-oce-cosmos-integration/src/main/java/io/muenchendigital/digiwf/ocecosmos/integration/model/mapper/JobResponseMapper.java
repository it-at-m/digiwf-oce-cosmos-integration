package io.muenchendigital.digiwf.ocecosmos.integration.model.mapper;

import io.muenchendigital.digiwf.ocecosmos.integration.gen.model.Jobs;
import io.muenchendigital.digiwf.ocecosmos.integration.model.response.JobResponse;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface JobResponseMapper {

    @Mapping(target = "jobId", source = "id")
    JobResponse map(Jobs jobs);

}
