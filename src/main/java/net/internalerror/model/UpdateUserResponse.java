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
 * UpdateUserResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-02-08T18:10:28.989269854Z[Etc/UTC]")
public class UpdateUserResponse {
  public static final String SERIALIZED_NAME_FIRSTNAME = "firstname";
  @SerializedName(SERIALIZED_NAME_FIRSTNAME)
  private String firstname;

  public static final String SERIALIZED_NAME_LASTNAME = "lastname";
  @SerializedName(SERIALIZED_NAME_LASTNAME)
  private String lastname;

  public UpdateUserResponse() {
  }

  public UpdateUserResponse firstname(String firstname) {
    
    this.firstname = firstname;
    return this;
  }

   /**
   * Get firstname
   * @return firstname
  **/
  @javax.annotation.Nullable
  public String getFirstname() {
    return firstname;
  }


  public void setFirstname(String firstname) {
    this.firstname = firstname;
  }


  public UpdateUserResponse lastname(String lastname) {
    
    this.lastname = lastname;
    return this;
  }

   /**
   * Get lastname
   * @return lastname
  **/
  @javax.annotation.Nullable
  public String getLastname() {
    return lastname;
  }


  public void setLastname(String lastname) {
    this.lastname = lastname;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateUserResponse updateUserResponse = (UpdateUserResponse) o;
    return Objects.equals(this.firstname, updateUserResponse.firstname) &&
        Objects.equals(this.lastname, updateUserResponse.lastname);
  }

  @Override
  public int hashCode() {
    return Objects.hash(firstname, lastname);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateUserResponse {\n");
    sb.append("    firstname: ").append(toIndentedString(firstname)).append("\n");
    sb.append("    lastname: ").append(toIndentedString(lastname)).append("\n");
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
    openapiFields.add("firstname");
    openapiFields.add("lastname");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to UpdateUserResponse
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!UpdateUserResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in UpdateUserResponse is not found in the empty JSON string", UpdateUserResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!UpdateUserResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `UpdateUserResponse` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("firstname") != null && !jsonObj.get("firstname").isJsonNull()) && !jsonObj.get("firstname").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `firstname` to be a primitive type in the JSON string but got `%s`", jsonObj.get("firstname").toString()));
      }
      if ((jsonObj.get("lastname") != null && !jsonObj.get("lastname").isJsonNull()) && !jsonObj.get("lastname").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `lastname` to be a primitive type in the JSON string but got `%s`", jsonObj.get("lastname").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!UpdateUserResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UpdateUserResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UpdateUserResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UpdateUserResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<UpdateUserResponse>() {
           @Override
           public void write(JsonWriter out, UpdateUserResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public UpdateUserResponse read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of UpdateUserResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of UpdateUserResponse
  * @throws IOException if the JSON string is invalid with respect to UpdateUserResponse
  */
  public static UpdateUserResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UpdateUserResponse.class);
  }

 /**
  * Convert an instance of UpdateUserResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

