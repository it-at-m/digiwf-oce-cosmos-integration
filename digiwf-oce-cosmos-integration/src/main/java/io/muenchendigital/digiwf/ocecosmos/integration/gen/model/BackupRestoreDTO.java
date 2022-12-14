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
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * The model for backup and restore information
 */
@Schema(description = "The model for backup and restore information")

public class BackupRestoreDTO {
  @JsonProperty("BACKUPDESCRIPTION")
  private String BACKUPDESCRIPTION = null;

  @JsonProperty("BACKUPNAME")
  private String BACKUPNAME = null;

  /**
   * Gets or Sets BACKUPTYPES
   */
  public enum BACKUPTYPESEnum {
    CONFIG("CONFIG"),
    CONFIGNOPACKAGE("CONFIGNOPACKAGE"),
    CONFIGRAW("CONFIGRAW"),
    JOB("JOB"),
    JOBLOG("JOBLOG"),
    JOBSELECTION("JOBSELECTION"),
    MISC("MISC"),
    SYSLOG("SYSLOG"),
    USER("USER"),
    USERLOG("USERLOG"),
    USERTRANSPORT("USERTRANSPORT");

    private String value;

    BACKUPTYPESEnum(String value) {
      this.value = value;
    }
    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    @JsonCreator
    public static BACKUPTYPESEnum fromValue(String input) {
      for (BACKUPTYPESEnum b : BACKUPTYPESEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }

  }  @JsonProperty("BACKUPTYPES")
  private List<BACKUPTYPESEnum> BACKUPTYPES = new ArrayList<>();

  public BackupRestoreDTO BACKUPDESCRIPTION(String BACKUPDESCRIPTION) {
    this.BACKUPDESCRIPTION = BACKUPDESCRIPTION;
    return this;
  }

   /**
   * The description of the backup (command &#x3D; backup)
   * @return BACKUPDESCRIPTION
  **/
  @Schema(example = "Initial Backup for COSMOS 2021", description = "The description of the backup (command = backup)")
  public String getBACKUPDESCRIPTION() {
    return BACKUPDESCRIPTION;
  }

  public void setBACKUPDESCRIPTION(String BACKUPDESCRIPTION) {
    this.BACKUPDESCRIPTION = BACKUPDESCRIPTION;
  }

  public BackupRestoreDTO BACKUPNAME(String BACKUPNAME) {
    this.BACKUPNAME = BACKUPNAME;
    return this;
  }

   /**
   * The name of the backup (command &#x3D; backup)
   * @return BACKUPNAME
  **/
  @Schema(example = "Initial Backup", description = "The name of the backup (command = backup)")
  public String getBACKUPNAME() {
    return BACKUPNAME;
  }

  public void setBACKUPNAME(String BACKUPNAME) {
    this.BACKUPNAME = BACKUPNAME;
  }

  public BackupRestoreDTO BACKUPTYPES(List<BACKUPTYPESEnum> BACKUPTYPES) {
    this.BACKUPTYPES = BACKUPTYPES;
    return this;
  }

  public BackupRestoreDTO addBACKUPTYPESItem(BACKUPTYPESEnum BACKUPTYPESItem) {
    this.BACKUPTYPES.add(BACKUPTYPESItem);
    return this;
  }

   /**
   * List with backuptypes to restore or which are in a backup folder
   * @return BACKUPTYPES
  **/
  @NotNull
  @Schema(example = "{[\"USER\", \"CONFIG\"]}", required = true, description = "List with backuptypes to restore or which are in a backup folder")
  public List<BACKUPTYPESEnum> getBACKUPTYPES() {
    return BACKUPTYPES;
  }

  public void setBACKUPTYPES(List<BACKUPTYPESEnum> BACKUPTYPES) {
    this.BACKUPTYPES = BACKUPTYPES;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BackupRestoreDTO backupRestoreDTO = (BackupRestoreDTO) o;
    return Objects.equals(this.BACKUPDESCRIPTION, backupRestoreDTO.BACKUPDESCRIPTION) &&
        Objects.equals(this.BACKUPNAME, backupRestoreDTO.BACKUPNAME) &&
        Objects.equals(this.BACKUPTYPES, backupRestoreDTO.BACKUPTYPES);
  }

  @Override
  public int hashCode() {
    return Objects.hash(BACKUPDESCRIPTION, BACKUPNAME, BACKUPTYPES);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BackupRestoreDTO {\n");
    
    sb.append("    BACKUPDESCRIPTION: ").append(toIndentedString(BACKUPDESCRIPTION)).append("\n");
    sb.append("    BACKUPNAME: ").append(toIndentedString(BACKUPNAME)).append("\n");
    sb.append("    BACKUPTYPES: ").append(toIndentedString(BACKUPTYPES)).append("\n");
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
