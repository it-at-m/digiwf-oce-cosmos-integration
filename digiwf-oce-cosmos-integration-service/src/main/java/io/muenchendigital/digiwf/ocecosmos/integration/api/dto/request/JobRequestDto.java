package io.muenchendigital.digiwf.ocecosmos.integration.api.dto.request;

import io.muenchendigital.digiwf.ocecosmos.integration.model.request.DataTypes;
import io.muenchendigital.digiwf.ocecosmos.integration.model.request.DeliveryTypes;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.io.File;
import java.time.LocalDateTime;

@Data
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class JobRequestDto extends AbstractRequestDto {

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

    File file; //TODO

    String userId;

    String hostName;
}
