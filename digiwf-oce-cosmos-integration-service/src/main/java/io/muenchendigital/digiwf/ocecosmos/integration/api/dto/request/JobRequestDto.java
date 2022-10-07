package io.muenchendigital.digiwf.ocecosmos.integration.api.dto.request;

import io.muenchendigital.digiwf.ocecosmos.integration.model.request.DataTypes;
import io.muenchendigital.digiwf.ocecosmos.integration.model.request.DeliveryTypes;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class JobRequestDto {

    String jobType;

    String templateName;

    DeliveryTypes deliveryType;

    DataTypes dataType;

    String applicationName;

    String debtor;

    String email;

    String pickupLocation;

    Boolean printJob;

    Boolean mailJob;

    Boolean archiveJob;

    String fileName;

    byte[] file;

    String userId;

    String hostName;
}
