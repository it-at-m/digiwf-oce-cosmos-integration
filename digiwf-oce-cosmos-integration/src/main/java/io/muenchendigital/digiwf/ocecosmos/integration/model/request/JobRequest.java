package io.muenchendigital.digiwf.ocecosmos.integration.model.request;

import lombok.Builder;
import lombok.Data;

import java.nio.file.Path;
import java.time.LocalDateTime;

@Data
@Builder
public class JobRequest {

    String clientId;

    String jobType;

    String templateName;

    DeliveryTypes deliveryType;

    DataTypes dataType;

    String applicationName;

    LocalDateTime createDateTime;

    String debtor;

    String email;

    String pickupLocation;

    boolean printJob;

    boolean mailJob;

    boolean archiveJob;

    String fileName;

    Path file;

    String userId;

    String hostName;
}
