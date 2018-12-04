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
import com.mx.model.Pagination;
import com.mx.model.TransactionAttributes;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Transactions
 */
@javax.annotation.Generated(value = "com.mx", date = "2018-12-04T10:29:21.360-07:00")

public class Transactions {
  @SerializedName("transactions")
  private List<TransactionAttributes> transactions = null;

  @SerializedName("pagination")
  private Pagination pagination = null;

  public Transactions transactions(List<TransactionAttributes> transactions) {
    this.transactions = transactions;
    return this;
  }

  public Transactions addTransactionsItem(TransactionAttributes transactionsItem) {
    if (this.transactions == null) {
      this.transactions = new ArrayList<TransactionAttributes>();
    }
    this.transactions.add(transactionsItem);
    return this;
  }

   /**
   * Get transactions
   * @return transactions
  **/
  @ApiModelProperty(value = "")
  public List<TransactionAttributes> getTransactions() {
    return transactions;
  }

  public void setTransactions(List<TransactionAttributes> transactions) {
    this.transactions = transactions;
  }

  public Transactions pagination(Pagination pagination) {
    this.pagination = pagination;
    return this;
  }

   /**
   * Get pagination
   * @return pagination
  **/
  @ApiModelProperty(value = "")
  public Pagination getPagination() {
    return pagination;
  }

  public void setPagination(Pagination pagination) {
    this.pagination = pagination;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Transactions transactions = (Transactions) o;
    return Objects.equals(this.transactions, transactions.transactions) &&
        Objects.equals(this.pagination, transactions.pagination);
  }

  @Override
  public int hashCode() {
    return Objects.hash(transactions, pagination);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Transactions {\n");
    
    sb.append("    transactions: ").append(toIndentedString(transactions)).append("\n");
    sb.append("    pagination: ").append(toIndentedString(pagination)).append("\n");
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

