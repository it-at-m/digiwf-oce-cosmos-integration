package io.muenchendigital.digiwf.ocecosmos.integration.api.mapper;

import io.muenchendigital.digiwf.ocecosmos.integration.api.configuration.MapstructConfiguration;
import io.muenchendigital.digiwf.ocecosmos.integration.api.dto.request.JobRequestDto;
import io.muenchendigital.digiwf.ocecosmos.integration.model.request.DataTypes;
import io.muenchendigital.digiwf.ocecosmos.integration.model.request.JobRequest;
import lombok.Data;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.springframework.beans.factory.annotation.Value;

@Mapper(config = MapstructConfiguration.class)
@Data
public abstract class OceCosmosMapper {

    @Value("${io.muenchendigital.digiwf.ocecosmos.defaults.applicationName:}")
    private String applicationNameDefault;
    @Value("${io.muenchendigital.digiwf.ocecosmos.defaults.jobType:}")
    private String jobTypeDefault;
    @Value("${io.muenchendigital.digiwf.ocecosmos.defaults.debtor:}")
    private String debtorDefault;
    @Value("${io.muenchendigital.digiwf.ocecosmos.defaults.printJob:true}")
    private boolean printJobDefault;
    @Value("${io.muenchendigital.digiwf.ocecosmos.defaults.mailJob:false}")
    private boolean mailJobDefault;
    @Value("${io.muenchendigital.digiwf.ocecosmos.defaults.archiveJob:false}")
    private boolean archiveJobDefault;
    @Value("${io.muenchendigital.digiwf.ocecosmos.defaults.hostName:}")
    private String hostNameDefault;
    @Value("${io.muenchendigital.digiwf.ocecosmos.defaults.userId:}")
    private String userIdDefault;
    @Value("${io.muenchendigital.digiwf.ocecosmos.defaults.dataType:}")
    private DataTypes dataTypeDefault;
    @Value("${io.muenchendigital.digiwf.ocecosmos.oauth-client.clientId}")
    private String clientId;

    @Mapping(target = "jobType", source = "jobType", defaultExpression = "java(getJobTypeDefault())")
    @Mapping(target = "applicationName", source = "applicationName", defaultExpression = "java(getApplicationNameDefault())")
    @Mapping(target = "debtor", source = "debtor", defaultExpression = "java(getDebtorDefault())")
    @Mapping(target = "printJob", source = "printJob", defaultExpression = "java(getPrintJobDefault())")
    @Mapping(target = "mailJob", source = "mailJob", defaultExpression = "java(getMailJobDefault())")
    @Mapping(target = "archiveJob", source = "archiveJob", defaultExpression = "java(getArchiveJobDefault())")
    @Mapping(target = "hostName", source = "hostName", defaultExpression = "java(getHostNameDefault())")
    @Mapping(target = "userId", source = "userId", defaultExpression = "java(getUserIdDefault())")
    @Mapping(target = "dataType", source = "dataType", defaultExpression = "java(getDataTypeDefault())")
    @Mapping(target = "clientId", expression = "java(getClientId())")
    @Mapping(target = "file", ignore = true)
    public abstract JobRequest dto2Model(final JobRequestDto jobRequestDto);


}
