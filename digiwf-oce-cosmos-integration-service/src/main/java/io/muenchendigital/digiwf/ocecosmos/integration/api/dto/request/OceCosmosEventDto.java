package io.muenchendigital.digiwf.ocecosmos.integration.api.dto.request;

import lombok.Data;

@Data
public class OceCosmosEventDto {

    /**
     * The payload to request oce-cosmos service.
     */
    private AbstractRequestDto request;

}
