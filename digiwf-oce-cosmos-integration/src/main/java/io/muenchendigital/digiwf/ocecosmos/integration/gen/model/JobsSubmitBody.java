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
import java.io.File;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * JobsSubmitBody
 */


public class JobsSubmitBody {
  @JsonProperty("job")
  private Object job = null;

  @JsonProperty("sourceFile")
  private java.nio.file.Path sourceFile = null;

  @JsonProperty("ticketFile")
  private java.nio.file.Path ticketFile = null;

  public JobsSubmitBody job(Object job) {
    this.job = job;
    return this;
  }

   /**
   * An optional job representation of the created job. The job representation MUST be formatted as json in a multipart/form-data part of name \&quot;job\&quot;. If not set, all job parameters will be set to their default values.
   * @return job
  **/
  @Schema(description = "An optional job representation of the created job. The job representation MUST be formatted as json in a multipart/form-data part of name \"job\". If not set, all job parameters will be set to their default values.")
  public Object getJob() {
    return job;
  }

  public void setJob(Object job) {
    this.job = job;
  }

  public JobsSubmitBody sourceFile(java.nio.file.Path sourceFile) {
    this.sourceFile = sourceFile;
    return this;
  }

   /**
   * An optional source/data file to upload to the server and link with the created job. The source file MUST be included as an octet-stream in a multipart/form-data part of name \&quot;sourceFile\&quot; with the required filename parameter.
   * @return sourceFile
  **/
  @Valid
  @Schema(description = "An optional source/data file to upload to the server and link with the created job. The source file MUST be included as an octet-stream in a multipart/form-data part of name \"sourceFile\" with the required filename parameter.")
  public java.nio.file.Path getSourceFile() {
    return sourceFile;
  }

  public void setSourceFile(java.nio.file.Path sourceFile) {
    this.sourceFile = sourceFile;
  }

  public JobsSubmitBody ticketFile(java.nio.file.Path ticketFile) {
    this.ticketFile = ticketFile;
    return this;
  }

   /**
   * An optional ticket file to upload to the server and link with the created job. The ticket file MUST be included as octet-stream in a multipart/form-data part of name \&quot;ticketFile\&quot; with the required filename parameter.
   * @return ticketFile
  **/
  @Valid
  @Schema(description = "An optional ticket file to upload to the server and link with the created job. The ticket file MUST be included as octet-stream in a multipart/form-data part of name \"ticketFile\" with the required filename parameter.")
  public java.nio.file.Path getTicketFile() {
    return ticketFile;
  }

  public void setTicketFile(java.nio.file.Path ticketFile) {
    this.ticketFile = ticketFile;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JobsSubmitBody jobsSubmitBody = (JobsSubmitBody) o;
    return Objects.equals(this.job, jobsSubmitBody.job) &&
        Objects.equals(this.sourceFile, jobsSubmitBody.sourceFile) &&
        Objects.equals(this.ticketFile, jobsSubmitBody.ticketFile);
  }

  @Override
  public int hashCode() {
    return Objects.hash(job, Objects.hashCode(sourceFile), Objects.hashCode(ticketFile));
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JobsSubmitBody {\n");
    
    sb.append("    job: ").append(toIndentedString(job)).append("\n");
    sb.append("    sourceFile: ").append(toIndentedString(sourceFile)).append("\n");
    sb.append("    ticketFile: ").append(toIndentedString(ticketFile)).append("\n");
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
