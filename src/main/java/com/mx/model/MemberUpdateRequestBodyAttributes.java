/*
 * MX API
 * The MX Atrium API supports over 48,000 data connections to thousands of financial institutions. It provides secure access to your users' accounts and transactions with industry-leading cleansing, categorization, and classification.  Atrium is designed according to resource-oriented REST architecture and responds with JSON bodies and HTTP response codes.  Use Atrium's development environment, vestibule.mx.com, to quickly get up and running. The development environment limits are 100 users, 25 members per user, and access to the top 15 institutions. Contact MX to purchase production access. 
 *
 * OpenAPI spec version: 0.1
 * 
 */


package com.mx.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * MemberUpdateRequestBodyAttributes
 */
@javax.annotation.Generated(value = "com.mx", date = "2018-11-29T15:45:20.941-07:00")

public class MemberUpdateRequestBodyAttributes {
  @SerializedName("credentials")
  private List<Object> credentials = null;

  @SerializedName("identifier")
  private String identifier = null;

  @SerializedName("metadata")
  private String metadata = null;

  public MemberUpdateRequestBodyAttributes credentials(List<Object> credentials) {
    this.credentials = credentials;
    return this;
  }

  public MemberUpdateRequestBodyAttributes addCredentialsItem(Object credentialsItem) {
    if (this.credentials == null) {
      this.credentials = new ArrayList<Object>();
    }
    this.credentials.add(credentialsItem);
    return this;
  }

   /**
   * Get credentials
   * @return credentials
  **/
  @ApiModelProperty(value = "")
  public List<Object> getCredentials() {
    return credentials;
  }

  public void setCredentials(List<Object> credentials) {
    this.credentials = credentials;
  }

  public MemberUpdateRequestBodyAttributes identifier(String identifier) {
    this.identifier = identifier;
    return this;
  }

   /**
   * Get identifier
   * @return identifier
  **/
  @ApiModelProperty(example = "unique_id", value = "")
  public String getIdentifier() {
    return identifier;
  }

  public void setIdentifier(String identifier) {
    this.identifier = identifier;
  }

  public MemberUpdateRequestBodyAttributes metadata(String metadata) {
    this.metadata = metadata;
    return this;
  }

   /**
   * Get metadata
   * @return metadata
  **/
  @ApiModelProperty(example = "{\"credentials_last_refreshed_at\": \"2015-10-15\"}", value = "")
  public String getMetadata() {
    return metadata;
  }

  public void setMetadata(String metadata) {
    this.metadata = metadata;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MemberUpdateRequestBodyAttributes memberUpdateRequestBodyAttributes = (MemberUpdateRequestBodyAttributes) o;
    return Objects.equals(this.credentials, memberUpdateRequestBodyAttributes.credentials) &&
        Objects.equals(this.identifier, memberUpdateRequestBodyAttributes.identifier) &&
        Objects.equals(this.metadata, memberUpdateRequestBodyAttributes.metadata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(credentials, identifier, metadata);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MemberUpdateRequestBodyAttributes {\n");
    
    sb.append("    credentials: ").append(toIndentedString(credentials)).append("\n");
    sb.append("    identifier: ").append(toIndentedString(identifier)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
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
