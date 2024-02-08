/*
 * OpenAPI definition
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: v0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package net.internalerror.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import net.internalerror.model.DueInfo;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import net.internalerror.invoker.JSON;

/**
 * ReadDueTaskRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-02-08T18:05:56.158889581Z[Etc/UTC]")
public class ReadDueTaskRequest {
  public static final String SERIALIZED_NAME_TOKEN = "token";
  @SerializedName(SERIALIZED_NAME_TOKEN)
  private String token;

  public static final String SERIALIZED_NAME_DUE_INFO = "dueInfo";
  @SerializedName(SERIALIZED_NAME_DUE_INFO)
  private DueInfo dueInfo;

  public ReadDueTaskRequest() {
  }

  public ReadDueTaskRequest token(String token) {
    
    this.token = token;
    return this;
  }

   /**
   * Get token
   * @return token
  **/
  @javax.annotation.Nonnull
  public String getToken() {
    return token;
  }


  public void setToken(String token) {
    this.token = token;
  }


  public ReadDueTaskRequest dueInfo(DueInfo dueInfo) {
    
    this.dueInfo = dueInfo;
    return this;
  }

   /**
   * Get dueInfo
   * @return dueInfo
  **/
  @javax.annotation.Nonnull
  public DueInfo getDueInfo() {
    return dueInfo;
  }


  public void setDueInfo(DueInfo dueInfo) {
    this.dueInfo = dueInfo;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReadDueTaskRequest readDueTaskRequest = (ReadDueTaskRequest) o;
    return Objects.equals(this.token, readDueTaskRequest.token) &&
        Objects.equals(this.dueInfo, readDueTaskRequest.dueInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(token, dueInfo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReadDueTaskRequest {\n");
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
    sb.append("    dueInfo: ").append(toIndentedString(dueInfo)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("token");
    openapiFields.add("dueInfo");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("token");
    openapiRequiredFields.add("dueInfo");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ReadDueTaskRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ReadDueTaskRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ReadDueTaskRequest is not found in the empty JSON string", ReadDueTaskRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ReadDueTaskRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ReadDueTaskRequest` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ReadDueTaskRequest.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("token").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `token` to be a primitive type in the JSON string but got `%s`", jsonObj.get("token").toString()));
      }
      // validate the required field `dueInfo`
      DueInfo.validateJsonObject(jsonObj.getAsJsonObject("dueInfo"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ReadDueTaskRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ReadDueTaskRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ReadDueTaskRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ReadDueTaskRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<ReadDueTaskRequest>() {
           @Override
           public void write(JsonWriter out, ReadDueTaskRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ReadDueTaskRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ReadDueTaskRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ReadDueTaskRequest
  * @throws IOException if the JSON string is invalid with respect to ReadDueTaskRequest
  */
  public static ReadDueTaskRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ReadDueTaskRequest.class);
  }

 /**
  * Convert an instance of ReadDueTaskRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

