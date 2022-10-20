package io.muenchendigital.digiwf.ocecosmos.integration.api.mapper;

import io.muenchendigital.digiwf.ocecosmos.integration.api.configuration.MapstructConfiguration;
import io.muenchendigital.digiwf.ocecosmos.integration.api.dto.request.BaseJobRequestDto;
import io.muenchendigital.digiwf.ocecosmos.integration.api.dto.request.FileJobRequestDto;
import io.muenchendigital.digiwf.ocecosmos.integration.api.dto.request.TemplateJobRequestDto;
import io.muenchendigital.digiwf.ocecosmos.integration.model.request.DataTypes;
import io.muenchendigital.digiwf.ocecosmos.integration.model.request.JobRequest;
import lombok.Data;
import org.mapstruct.InheritConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;
import org.mapstruct.SubclassMapping;
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
    private Boolean printJobDefault;
    @Value("${io.muenchendigital.digiwf.ocecosmos.defaults.mailJob:false}")
    private Boolean mailJobDefault;
    @Value("${io.muenchendigital.digiwf.ocecosmos.defaults.archiveJob:false}")
    private Boolean archiveJobDefault;
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
    @Mapping(target = "printJob", source = "printJob", defaultExpression = "java(getPrintJobDefault())", qualifiedByName = "BooleanMapper")
    @Mapping(target = "mailJob", source = "mailJob", defaultExpression = "java(getMailJobDefault())", qualifiedByName = "BooleanMapper")
    @Mapping(target = "archiveJob", source = "archiveJob", defaultExpression = "java(getArchiveJobDefault())", qualifiedByName = "BooleanMapper")
    @Mapping(target = "hostName", source = "hostName", defaultExpression = "java(getHostNameDefault())")
    @Mapping(target = "userId", source = "userId", defaultExpression = "java(getUserIdDefault())")
    @Mapping(target = "dataType", source = "dataType", defaultExpression = "java(getDataTypeDefault())")
    @Mapping(target = "clientId", expression = "java(getClientId())")
    @Mapping(target = "file", ignore = true)
    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "templateName", ignore = true)
    @SubclassMapping(target = JobRequest.class, source = TemplateJobRequestDto.class)
    @SubclassMapping(target = JobRequest.class, source = FileJobRequestDto.class)
    public abstract JobRequest baseDto2Model(final BaseJobRequestDto baseJobRequestDto);

    @InheritConfiguration(name = "baseDto2Model")
    @Mapping(target = "fileName", source = "fileName")
    @Mapping(target = "templateName", source = "templateName")
    public abstract JobRequest dto2Model(final TemplateJobRequestDto templateJobRequestDto);

    @InheritConfiguration(name = "baseDto2Model")
    @Mapping(target = "fileName", source = "fileName")
    public abstract JobRequest dto2Model(final FileJobRequestDto fileJobRequestDto);

    @Named("BooleanMapper")
    public boolean mapBoolean(Boolean bool) {
        return bool;
    }

}
