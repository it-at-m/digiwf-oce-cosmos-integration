package io.muenchendigital.digiwf.ocecosmos.integration.model.mapper;

import io.muenchendigital.digiwf.ocecosmos.integration.gen.model.Filestatus;
import io.muenchendigital.digiwf.ocecosmos.integration.gen.model.JobAttribute;
import io.muenchendigital.digiwf.ocecosmos.integration.gen.model.Jobs;
import io.muenchendigital.digiwf.ocecosmos.integration.model.request.JobRequest;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

@Mapper(componentModel = "spring")
public abstract class JobRequestMapper {

    private final DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd.HHmmss");

    @Mapping(target = "client", source = "clientId")
    @Mapping(target = "title",
            expression = "java(jobRequest.getApplicationName() + \".\" + jobRequest.getLayoutName() + \".\" + jobRequest.getJobType())")
    @Mapping(target = "textStatus",
            expression = "java(\"Empfange Datensätze aus \" + jobRequest.getApplicationName())")
    @Mapping(target = "customField", source = "jobType")
    @Mapping(target = "customField1", source = "layoutName")
    @Mapping(target = "customField2", source = "deliveryType")
    public abstract Jobs mapToJobs(JobRequest jobRequest);

    @Mapping(target = "textStatus",
            expression = "java(\"Hochgeladen von \" + jobRequest.getApplicationName())")
    @Mapping(target = "application", source = "applicationName")
    @Mapping(target = "fileType", constant = "INPUT")
    @Mapping(target = "host", source = "hostName")
    @Mapping(target = "customField", source = "userId")
    public abstract Filestatus mapToFileStatus(JobRequest jobRequest);

    public List<JobAttribute> mapToJobAttributes(JobRequest jobRequest, Long jobId) {
        List<JobAttribute> result = new ArrayList<>();

        result.add(new JobAttribute().jobId(jobId).attributeName("FORM_NAME").attributeValue(jobRequest.getTemplateName()));
        result.add(new JobAttribute().jobId(jobId).attributeName("DEBITOR").attributeValue(jobRequest.getDebtor()));
        result.add(new JobAttribute().jobId(jobId).attributeName("USER").attributeValue(jobRequest.getUserId()));
        result.add(new JobAttribute().jobId(jobId).attributeName("ERST_DATUM").attributeValue(LocalDateTime.now().format(dateTimeFormatter)));
        result.add(new JobAttribute().jobId(jobId).attributeName("EMAIL").attributeValue(jobRequest.getEmail()));
        result.add(new JobAttribute().jobId(jobId).attributeName("ABHOL").attributeValue(jobRequest.getPickupLocation()));
        result.add(new JobAttribute().jobId(jobId).attributeName("DRUCKEN").attributeValue(jobRequest.isPrintJob() ? "1": "0"));
        result.add(new JobAttribute().jobId(jobId).attributeName("MAILEN").attributeValue(jobRequest.isMailJob() ? "1": "0"));
        result.add(new JobAttribute().jobId(jobId).attributeName("ARCHIVIEREN").attributeValue(jobRequest.isArchiveJob() ? "1": "0"));

        return result;
    }

}
