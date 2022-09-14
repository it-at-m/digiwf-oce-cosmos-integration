package io.muenchendigital.digiwf.ocecosmos.integration.properties;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.NotBlank;

@Getter
@Setter
@Validated
@ConfigurationProperties(prefix = "io.muenchendigital.digiwf.ocecosmos")
public class OceCosmosIntegrationProperties {

    @NotBlank
    private String url;

}
