package io.muenchendigital.digiwf.ocecosmos.integration.api.dto.request;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import lombok.Data;

@Data
@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        include = JsonTypeInfo.As.PROPERTY,
        property = "eventType",
        visible = true
)
@JsonSubTypes({
        @JsonSubTypes.Type(value = JobRequestDto.class, name = "requestPrint"),
})
public abstract class AbstractRequestDto {

    private String eventType;

}
