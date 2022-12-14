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
 * Data object wrapping a COSMOS file status.
 */
@Schema(description = "Data object wrapping a COSMOS file status.")

public class Filestatus {
  @JsonProperty("application")
  private String application = null;

  @JsonProperty("customField")
  private String customField = null;

  @JsonProperty("customField1")
  private String customField1 = null;

  @JsonProperty("customField2")
  private String customField2 = null;

  @JsonProperty("customField3")
  private String customField3 = null;

  @JsonProperty("customField4")
  private String customField4 = null;

  @JsonProperty("dataType")
  private String dataType = null;

  @JsonProperty("documents")
  private Integer documents = null;

  @JsonProperty("fileName")
  private String fileName = null;

  @JsonProperty("fileType")
  private String fileType = null;

  @JsonProperty("host")
  private String host = null;

  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("jobId")
  private Long jobId = null;

  @JsonProperty("jobid")
  private Long jobid = null;

  @JsonProperty("modifiedBy")
  private String modifiedBy = null;

  @JsonProperty("modifiedTime")
  private String modifiedTime = null;

  @JsonProperty("packageId")
  private Long packageId = null;

  @JsonProperty("pages")
  private Integer pages = null;

  @JsonProperty("prPages")
  private Integer prPages = null;

  @JsonProperty("sourceJobId")
  private Long sourceJobId = null;

  @JsonProperty("status")
  private Integer status = null;

  @JsonProperty("textStatus")
  private String textStatus = null;

  @JsonProperty("xid")
  private String xid = null;

  public Filestatus application(String application) {
    this.application = application;
    return this;
  }

   /**
   * Name of the application for that the file is tracked
   * @return application
  **/
  @Schema(example = "OCECosmos", description = "Name of the application for that the file is tracked")
  public String getApplication() {
    return application;
  }

  public void setApplication(String application) {
    this.application = application;
  }

  public Filestatus customField(String customField) {
    this.customField = customField;
    return this;
  }

   /**
   * Any custom field
   * @return customField
  **/
  @Schema(example = "custom", description = "Any custom field")
  public String getCustomField() {
    return customField;
  }

  public void setCustomField(String customField) {
    this.customField = customField;
  }

  public Filestatus customField1(String customField1) {
    this.customField1 = customField1;
    return this;
  }

   /**
   * Any custom field
   * @return customField1
  **/
  @Schema(example = "custom1", description = "Any custom field")
  public String getCustomField1() {
    return customField1;
  }

  public void setCustomField1(String customField1) {
    this.customField1 = customField1;
  }

  public Filestatus customField2(String customField2) {
    this.customField2 = customField2;
    return this;
  }

   /**
   * Any custom field
   * @return customField2
  **/
  @Schema(example = "custom2", description = "Any custom field")
  public String getCustomField2() {
    return customField2;
  }

  public void setCustomField2(String customField2) {
    this.customField2 = customField2;
  }

  public Filestatus customField3(String customField3) {
    this.customField3 = customField3;
    return this;
  }

   /**
   * Any custom field
   * @return customField3
  **/
  @Schema(example = "custom3", description = "Any custom field")
  public String getCustomField3() {
    return customField3;
  }

  public void setCustomField3(String customField3) {
    this.customField3 = customField3;
  }

  public Filestatus customField4(String customField4) {
    this.customField4 = customField4;
    return this;
  }

   /**
   * Any custom field
   * @return customField4
  **/
  @Schema(example = "custom4", description = "Any custom field")
  public String getCustomField4() {
    return customField4;
  }

  public void setCustomField4(String customField4) {
    this.customField4 = customField4;
  }

  public Filestatus dataType(String dataType) {
    this.dataType = dataType;
    return this;
  }

   /**
   * Data type of the file, e.g. PDF AFPDS, ...
   * @return dataType
  **/
  @Schema(example = "TXT", description = "Data type of the file, e.g. PDF AFPDS, ...")
  public String getDataType() {
    return dataType;
  }

  public void setDataType(String dataType) {
    this.dataType = dataType;
  }

  public Filestatus documents(Integer documents) {
    this.documents = documents;
    return this;
  }

   /**
   * Number of documents in the file
   * @return documents
  **/
  @Schema(example = "2", description = "Number of documents in the file")
  public Integer getDocuments() {
    return documents;
  }

  public void setDocuments(Integer documents) {
    this.documents = documents;
  }

  public Filestatus fileName(String fileName) {
    this.fileName = fileName;
    return this;
  }

   /**
   * The name of the file to be tracked
   * @return fileName
  **/
  @Schema(example = "PDFprint.dat", description = "The name of the file to be tracked")
  public String getFileName() {
    return fileName;
  }

  public void setFileName(String fileName) {
    this.fileName = fileName;
  }

  public Filestatus fileType(String fileType) {
    this.fileType = fileType;
    return this;
  }

   /**
   * File type of the tracked file, e.g PRINT, LOG, ...
   * @return fileType
  **/
  @Schema(example = "PRINT", description = "File type of the tracked file, e.g PRINT, LOG, ...")
  public String getFileType() {
    return fileType;
  }

  public void setFileType(String fileType) {
    this.fileType = fileType;
  }

  public Filestatus host(String host) {
    this.host = host;
    return this;
  }

   /**
   * Name of the remote server where the file is used
   * @return host
  **/
  @Schema(example = "enCOSMOS", description = "Name of the remote server where the file is used")
  public String getHost() {
    return host;
  }

  public void setHost(String host) {
    this.host = host;
  }

   /**
   * The unique ID of a file status object
   * @return id
  **/
  @Schema(example = "1123", description = "The unique ID of a file status object")
  public Long getId() {
    return id;
  }

  public Filestatus jobId(Long jobId) {
    this.jobId = jobId;
    return this;
  }

   /**
   * The unique ID of the job to which this file status object is assigned
   * @return jobId
  **/
  @NotNull
  @Schema(example = "124", required = true, description = "The unique ID of the job to which this file status object is assigned")
  public Long getJobId() {
    return jobId;
  }

  public void setJobId(Long jobId) {
    this.jobId = jobId;
  }

  public Filestatus jobid(Long jobid) {
    this.jobid = jobid;
    return this;
  }

   /**
   * Get jobid
   * @return jobid
  **/
  @Schema(description = "")
  public Long getJobid() {
    return jobid;
  }

  public void setJobid(Long jobid) {
    this.jobid = jobid;
  }

  public Filestatus modifiedBy(String modifiedBy) {
    this.modifiedBy = modifiedBy;
    return this;
  }

   /**
   * Modified By
   * @return modifiedBy
  **/
  @Schema(example = "admin", description = "Modified By")
  public String getModifiedBy() {
    return modifiedBy;
  }

  public void setModifiedBy(String modifiedBy) {
    this.modifiedBy = modifiedBy;
  }

  public Filestatus modifiedTime(String modifiedTime) {
    this.modifiedTime = modifiedTime;
    return this;
  }

   /**
   * Modified Time
   * @return modifiedTime
  **/
  @Schema(example = "2020-09-22'T'12:00:00.000", description = "Modified Time")
  public String getModifiedTime() {
    return modifiedTime;
  }

  public void setModifiedTime(String modifiedTime) {
    this.modifiedTime = modifiedTime;
  }

  public Filestatus packageId(Long packageId) {
    this.packageId = packageId;
    return this;
  }

   /**
   * ID, for grouping several file entries
   * @return packageId
  **/
  @Schema(example = "34", description = "ID, for grouping several file entries")
  public Long getPackageId() {
    return packageId;
  }

  public void setPackageId(Long packageId) {
    this.packageId = packageId;
  }

  public Filestatus pages(Integer pages) {
    this.pages = pages;
    return this;
  }

   /**
   * Number of pages in the file
   * @return pages
  **/
  @Schema(example = "125", description = "Number of pages in the file")
  public Integer getPages() {
    return pages;
  }

  public void setPages(Integer pages) {
    this.pages = pages;
  }

  public Filestatus prPages(Integer prPages) {
    this.prPages = prPages;
    return this;
  }

   /**
   * Number of processed pages of the file
   * @return prPages
  **/
  @Schema(example = "12", description = "Number of processed pages of the file")
  public Integer getPrPages() {
    return prPages;
  }

  public void setPrPages(Integer prPages) {
    this.prPages = prPages;
  }

  public Filestatus sourceJobId(Long sourceJobId) {
    this.sourceJobId = sourceJobId;
    return this;
  }

   /**
   * The ID of the original job from which the file was copied
   * @return sourceJobId
  **/
  @Schema(example = "1122", description = "The ID of the original job from which the file was copied")
  public Long getSourceJobId() {
    return sourceJobId;
  }

  public void setSourceJobId(Long sourceJobId) {
    this.sourceJobId = sourceJobId;
  }

  public Filestatus status(Integer status) {
    this.status = status;
    return this;
  }

   /**
   * Status of the file. One of WAIT(&#x3D;&#x27;0&#x27;), PROCESSING(&#x3D;&#x27;1&#x27;), FINISHED(&#x3D;&#x27;2&#x27;), INTERRUPTED (&#x3D;&#x27;3&#x27;), CANCELED(&#x3D;&#x27;4&#x27;) or ERROR(&#x3D;&#x27;5&#x27;)
   * @return status
  **/
  @Schema(example = "0", description = "Status of the file. One of WAIT(='0'), PROCESSING(='1'), FINISHED(='2'), INTERRUPTED (='3'), CANCELED(='4') or ERROR(='5')")
  public Integer getStatus() {
    return status;
  }

  public void setStatus(Integer status) {
    this.status = status;
  }

  public Filestatus textStatus(String textStatus) {
    this.textStatus = textStatus;
    return this;
  }

   /**
   * Any description of the text status
   * @return textStatus
  **/
  @Schema(example = "created", description = "Any description of the text status")
  public String getTextStatus() {
    return textStatus;
  }

  public void setTextStatus(String textStatus) {
    this.textStatus = textStatus;
  }

  public Filestatus xid(String xid) {
    this.xid = xid;
    return this;
  }

   /**
   * External ID of the file
   * @return xid
  **/
  @Schema(example = "655-23", description = "External ID of the file")
  public String getXid() {
    return xid;
  }

  public void setXid(String xid) {
    this.xid = xid;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Filestatus filestatus = (Filestatus) o;
    return Objects.equals(this.application, filestatus.application) &&
        Objects.equals(this.customField, filestatus.customField) &&
        Objects.equals(this.customField1, filestatus.customField1) &&
        Objects.equals(this.customField2, filestatus.customField2) &&
        Objects.equals(this.customField3, filestatus.customField3) &&
        Objects.equals(this.customField4, filestatus.customField4) &&
        Objects.equals(this.dataType, filestatus.dataType) &&
        Objects.equals(this.documents, filestatus.documents) &&
        Objects.equals(this.fileName, filestatus.fileName) &&
        Objects.equals(this.fileType, filestatus.fileType) &&
        Objects.equals(this.host, filestatus.host) &&
        Objects.equals(this.id, filestatus.id) &&
        Objects.equals(this.jobId, filestatus.jobId) &&
        Objects.equals(this.jobid, filestatus.jobid) &&
        Objects.equals(this.modifiedBy, filestatus.modifiedBy) &&
        Objects.equals(this.modifiedTime, filestatus.modifiedTime) &&
        Objects.equals(this.packageId, filestatus.packageId) &&
        Objects.equals(this.pages, filestatus.pages) &&
        Objects.equals(this.prPages, filestatus.prPages) &&
        Objects.equals(this.sourceJobId, filestatus.sourceJobId) &&
        Objects.equals(this.status, filestatus.status) &&
        Objects.equals(this.textStatus, filestatus.textStatus) &&
        Objects.equals(this.xid, filestatus.xid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(application, customField, customField1, customField2, customField3, customField4, dataType, documents, fileName, fileType, host, id, jobId, jobid, modifiedBy, modifiedTime, packageId, pages, prPages, sourceJobId, status, textStatus, xid);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Filestatus {\n");
    
    sb.append("    application: ").append(toIndentedString(application)).append("\n");
    sb.append("    customField: ").append(toIndentedString(customField)).append("\n");
    sb.append("    customField1: ").append(toIndentedString(customField1)).append("\n");
    sb.append("    customField2: ").append(toIndentedString(customField2)).append("\n");
    sb.append("    customField3: ").append(toIndentedString(customField3)).append("\n");
    sb.append("    customField4: ").append(toIndentedString(customField4)).append("\n");
    sb.append("    dataType: ").append(toIndentedString(dataType)).append("\n");
    sb.append("    documents: ").append(toIndentedString(documents)).append("\n");
    sb.append("    fileName: ").append(toIndentedString(fileName)).append("\n");
    sb.append("    fileType: ").append(toIndentedString(fileType)).append("\n");
    sb.append("    host: ").append(toIndentedString(host)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    jobId: ").append(toIndentedString(jobId)).append("\n");
    sb.append("    jobid: ").append(toIndentedString(jobid)).append("\n");
    sb.append("    modifiedBy: ").append(toIndentedString(modifiedBy)).append("\n");
    sb.append("    modifiedTime: ").append(toIndentedString(modifiedTime)).append("\n");
    sb.append("    packageId: ").append(toIndentedString(packageId)).append("\n");
    sb.append("    pages: ").append(toIndentedString(pages)).append("\n");
    sb.append("    prPages: ").append(toIndentedString(prPages)).append("\n");
    sb.append("    sourceJobId: ").append(toIndentedString(sourceJobId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    textStatus: ").append(toIndentedString(textStatus)).append("\n");
    sb.append("    xid: ").append(toIndentedString(xid)).append("\n");
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
