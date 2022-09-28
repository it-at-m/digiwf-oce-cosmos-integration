package io.muenchendigital.digiwf.ocecosmos.integration.api.mapper;

import io.muenchendigital.digiwf.ocecosmos.integration.api.configuration.MapstructConfiguration;
import io.muenchendigital.digiwf.ocecosmos.integration.api.dto.request.JobRequestDto;
import io.muenchendigital.digiwf.ocecosmos.integration.model.request.JobRequest;
import org.mapstruct.Mapper;

@Mapper(config = MapstructConfiguration.class)
public interface OceCosmosMapper {

    JobRequest dto2Model(final JobRequestDto jobRequestDto);


}
