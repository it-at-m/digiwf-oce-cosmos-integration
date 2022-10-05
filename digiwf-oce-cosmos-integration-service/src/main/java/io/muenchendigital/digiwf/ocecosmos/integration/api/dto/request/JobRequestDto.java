package io.muenchendigital.digiwf.ocecosmos.integration.api.dto.request;

import io.muenchendigital.digiwf.ocecosmos.integration.model.request.DataTypes;
import io.muenchendigital.digiwf.ocecosmos.integration.model.request.DeliveryTypes;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.time.LocalDateTime;

@Data
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class JobRequestDto extends AbstractRequestDto {

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

    byte[] file;

    String userId;

    String hostName;
}
