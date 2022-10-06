package io.muenchendigital.digiwf.ocecosmos.integration.api.dto.request;

import io.muenchendigital.digiwf.ocecosmos.integration.model.request.DataTypes;
import io.muenchendigital.digiwf.ocecosmos.integration.model.request.DeliveryTypes;
import lombok.Data;

@Data
public class JobRequestDto {

    String jobType;

    String templateName;

    DeliveryTypes deliveryType;

    DataTypes dataType;

    String applicationName;

    String debtor;

    String email;

    String pickupLocation;

    boolean printJob;

    boolean mailJob;

    boolean archiveJob;

    String fileName;

    byte[] file;

    String userId;

    String hostName;
}
