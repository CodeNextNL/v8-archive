/*
 * directus.io
 * API for directus.io
 *
 * OpenAPI spec version: 1.1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.directus.client.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * GetGroupsDataMeta
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-10-03T21:48:16.590Z")
public class GetGroupsDataMeta {
  @SerializedName("type")
  private String type = null;

  @SerializedName("table")
  private String table = null;

  @SerializedName("total")
  private Integer total = null;

  @SerializedName("total_entries")
  private Integer totalEntries = null;

  public GetGroupsDataMeta type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(value = "")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public GetGroupsDataMeta table(String table) {
    this.table = table;
    return this;
  }

   /**
   * Get table
   * @return table
  **/
  @ApiModelProperty(value = "")
  public String getTable() {
    return table;
  }

  public void setTable(String table) {
    this.table = table;
  }

  public GetGroupsDataMeta total(Integer total) {
    this.total = total;
    return this;
  }

   /**
   * Get total
   * @return total
  **/
  @ApiModelProperty(value = "")
  public Integer getTotal() {
    return total;
  }

  public void setTotal(Integer total) {
    this.total = total;
  }

  public GetGroupsDataMeta totalEntries(Integer totalEntries) {
    this.totalEntries = totalEntries;
    return this;
  }

   /**
   * Get totalEntries
   * @return totalEntries
  **/
  @ApiModelProperty(value = "")
  public Integer getTotalEntries() {
    return totalEntries;
  }

  public void setTotalEntries(Integer totalEntries) {
    this.totalEntries = totalEntries;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetGroupsDataMeta getGroupsDataMeta = (GetGroupsDataMeta) o;
    return Objects.equals(this.type, getGroupsDataMeta.type) &&
        Objects.equals(this.table, getGroupsDataMeta.table) &&
        Objects.equals(this.total, getGroupsDataMeta.total) &&
        Objects.equals(this.totalEntries, getGroupsDataMeta.totalEntries);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, table, total, totalEntries);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetGroupsDataMeta {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    table: ").append(toIndentedString(table)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
    sb.append("    totalEntries: ").append(toIndentedString(totalEntries)).append("\n");
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

