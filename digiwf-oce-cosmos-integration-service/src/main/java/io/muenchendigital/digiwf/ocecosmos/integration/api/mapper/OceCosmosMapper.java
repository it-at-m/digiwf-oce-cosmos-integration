package io.muenchendigital.digiwf.ocecosmos.integration.api.mapper;

import io.muenchendigital.digiwf.ocecosmos.integration.api.configuration.MapstructConfiguration;
import io.muenchendigital.digiwf.ocecosmos.integration.api.dto.request.JobRequestDto;
import io.muenchendigital.digiwf.ocecosmos.integration.model.request.JobRequest;
import lombok.Data;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.springframework.beans.factory.annotation.Value;

@Mapper(config = MapstructConfiguration.class)
@Data
public abstract class OceCosmosMapper {

    @Value("io.muenchendigital.digiwf.ocecosmos.defaults.applicationName:")
    private String applicationNameDefault;
    @Value("io.muenchendigital.digiwf.ocecosmos.defaults.debtor:")
    private String debtorDefault;
    @Value("io.muenchendigital.digiwf.ocecosmos.defaults.printJob:")
    private String printJobDefault;
    @Value("io.muenchendigital.digiwf.ocecosmos.defaults.mailJob:")
    private String mailJobDefault;
    @Value("io.muenchendigital.digiwf.ocecosmos.defaults.archiveJob:")
    private String archiveJobDefault;
    @Value("io.muenchendigital.digiwf.ocecosmos.defaults.hostName:")
    private String hostNameDefault;
    @Value("io.muenchendigital.digiwf.ocecosmos.defaults.userId:")
    private String userIdDefault;
    @Value("io.muenchendigital.digiwf.ocecosmos.oauth-client.clientId")
    private String clientId;

    @Mapping(target = "applicationName", source = "applicationName", defaultExpression = "java(applicationNameDefault())")
    @Mapping(target = "debtor", source = "debtor", defaultExpression = "java(debtorDefault())")
    @Mapping(target = "printJob", source = "printJob", defaultExpression = "java(printJobDefault())")
    @Mapping(target = "mailJob", source = "mailJob", defaultExpression = "java(mailJobDefault())")
    @Mapping(target = "archiveJob", source = "archiveJob", defaultExpression = "java(archiveJobDefault())")
    @Mapping(target = "hostName", source = "hostName", defaultExpression = "java(hostNameDefault())")
    @Mapping(target = "userId", source = "userId", defaultExpression = "java(userIdDefault())")
    @Mapping(target = "clientId", expression = "java(getClientId())")
    @Mapping(target = "file", ignore = true)
    abstract JobRequest dto2Model(final JobRequestDto jobRequestDto);


}
