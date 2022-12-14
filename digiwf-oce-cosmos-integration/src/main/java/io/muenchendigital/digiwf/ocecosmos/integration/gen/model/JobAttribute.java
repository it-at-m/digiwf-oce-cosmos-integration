/*
 * sysHUB REST-API
 * The sysHUB REST API / SDK v3 is a RESTful API that provides third party teams access to sysHUB features through a standard way. This page documents all operations intended for third-party integration.
 *
 * OpenAPI spec version: v3
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.muenchendigital.digiwf.ocecosmos.integration.gen.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * A COSMOS job attribute
 */
@Schema(description = "A COSMOS job attribute")

public class JobAttribute {
  @JsonProperty("attributeName")
  private String attributeName = null;

  @JsonProperty("attributeValue")
  private String attributeValue = null;

  @JsonProperty("jobId")
  private Long jobId = null;

  public JobAttribute attributeName(String attributeName) {
    this.attributeName = attributeName;
    return this;
  }

   /**
   * identifying name
   * @return attributeName
  **/
  @NotNull
 @Size(max=128)  @Schema(example = "QUEUE", required = true, description = "identifying name")
  public String getAttributeName() {
    return attributeName;
  }

  public void setAttributeName(String attributeName) {
    this.attributeName = attributeName;
  }

  public JobAttribute attributeValue(String attributeValue) {
    this.attributeValue = attributeValue;
    return this;
  }

   /**
   * value
   * @return attributeValue
  **/
  @NotNull
 @Size(max=2048)  @Schema(example = "HOT FOLDER 1", required = true, description = "value")
  public String getAttributeValue() {
    return attributeValue;
  }

  public void setAttributeValue(String attributeValue) {
    this.attributeValue = attributeValue;
  }

  public JobAttribute jobId(Long jobId) {
    this.jobId = jobId;
    return this;
  }

   /**
   * parent job id
   * minimum: 1
   * @return jobId
  **/
  @NotNull
 @Min(1)  @Schema(example = "1", required = true, description = "parent job id")
  public Long getJobId() {
    return jobId;
  }

  public void setJobId(Long jobId) {
    this.jobId = jobId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JobAttribute jobAttribute = (JobAttribute) o;
    return Objects.equals(this.attributeName, jobAttribute.attributeName) &&
        Objects.equals(this.attributeValue, jobAttribute.attributeValue) &&
        Objects.equals(this.jobId, jobAttribute.jobId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attributeName, attributeValue, jobId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JobAttribute {\n");
    
    sb.append("    attributeName: ").append(toIndentedString(attributeName)).append("\n");
    sb.append("    attributeValue: ").append(toIndentedString(attributeValue)).append("\n");
    sb.append("    jobId: ").append(toIndentedString(jobId)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
