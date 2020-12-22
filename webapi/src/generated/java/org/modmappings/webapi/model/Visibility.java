/*
 * ModMappings API
 * This is the api for ModMappings. It is currently in development and in an alpha stage.
 *
 * The version of the OpenAPI document: 0.0.0-Dev
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.modmappings.webapi.model;

import java.util.Objects;
import java.util.Arrays;
import io.swagger.annotations.ApiModel;
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * Indicates which visibility a given versioned mappable has (if applicable).
 */
@JsonAdapter(Visibility.Adapter.class)
public enum Visibility {
  
  PUBLIC("PUBLIC"),
  
  PACKAGE("PACKAGE"),
  
  PROTECTED("PROTECTED"),
  
  PRIVATE("PRIVATE"),
  
  NOT_APPLICABLE("NOT_APPLICABLE"),
  
  UNKNOWN("UNKNOWN");

  private String value;

  Visibility(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static Visibility fromValue(String value) {
    for (Visibility b : Visibility.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<Visibility> {
    @Override
    public void write(final JsonWriter jsonWriter, final Visibility enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public Visibility read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return Visibility.fromValue(value);
    }
  }
}
