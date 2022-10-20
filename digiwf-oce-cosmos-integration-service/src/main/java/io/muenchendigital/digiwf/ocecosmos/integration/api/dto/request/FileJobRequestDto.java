package io.muenchendigital.digiwf.ocecosmos.integration.api.dto.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.util.List;

@Data
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class FileJobRequestDto extends BaseJobRequestDto {

    String fileName;

    List<S3File> s3Files;
}
