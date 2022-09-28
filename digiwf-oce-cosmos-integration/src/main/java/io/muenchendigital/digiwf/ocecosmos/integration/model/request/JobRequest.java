package io.muenchendigital.digiwf.ocecosmos.integration.model.request;

import lombok.Data;

import java.io.File;
import java.time.LocalDateTime;

@Data
public class JobRequest {

    String clientId;

    String jobType;

    String layoutName;

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

    File file;

    String userId;

    String hostName;
}
