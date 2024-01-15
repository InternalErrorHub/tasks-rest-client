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
import net.internalerror.model.DueInfoUnitDuration;

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
 * DueInfoUnit
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-15T07:35:14.638428325Z[Etc/UTC]")
public class DueInfoUnit {
  public static final String SERIALIZED_NAME_DURATION_ESTIMATED = "durationEstimated";
  @SerializedName(SERIALIZED_NAME_DURATION_ESTIMATED)
  private Boolean durationEstimated;

  public static final String SERIALIZED_NAME_DURATION = "duration";
  @SerializedName(SERIALIZED_NAME_DURATION)
  private DueInfoUnitDuration duration;

  public static final String SERIALIZED_NAME_TIME_BASED = "timeBased";
  @SerializedName(SERIALIZED_NAME_TIME_BASED)
  private Boolean timeBased;

  public static final String SERIALIZED_NAME_DATE_BASED = "dateBased";
  @SerializedName(SERIALIZED_NAME_DATE_BASED)
  private Boolean dateBased;

  public DueInfoUnit() {
  }

  public DueInfoUnit durationEstimated(Boolean durationEstimated) {
    
    this.durationEstimated = durationEstimated;
    return this;
  }

   /**
   * Get durationEstimated
   * @return durationEstimated
  **/
  @javax.annotation.Nullable
  public Boolean isDurationEstimated() {
    return durationEstimated;
  }


  public void setDurationEstimated(Boolean durationEstimated) {
    this.durationEstimated = durationEstimated;
  }


  public DueInfoUnit duration(DueInfoUnitDuration duration) {
    
    this.duration = duration;
    return this;
  }

   /**
   * Get duration
   * @return duration
  **/
  @javax.annotation.Nullable
  public DueInfoUnitDuration getDuration() {
    return duration;
  }


  public void setDuration(DueInfoUnitDuration duration) {
    this.duration = duration;
  }


  public DueInfoUnit timeBased(Boolean timeBased) {
    
    this.timeBased = timeBased;
    return this;
  }

   /**
   * Get timeBased
   * @return timeBased
  **/
  @javax.annotation.Nullable
  public Boolean isTimeBased() {
    return timeBased;
  }


  public void setTimeBased(Boolean timeBased) {
    this.timeBased = timeBased;
  }


  public DueInfoUnit dateBased(Boolean dateBased) {
    
    this.dateBased = dateBased;
    return this;
  }

   /**
   * Get dateBased
   * @return dateBased
  **/
  @javax.annotation.Nullable
  public Boolean isDateBased() {
    return dateBased;
  }


  public void setDateBased(Boolean dateBased) {
    this.dateBased = dateBased;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DueInfoUnit dueInfoUnit = (DueInfoUnit) o;
    return Objects.equals(this.durationEstimated, dueInfoUnit.durationEstimated) &&
        Objects.equals(this.duration, dueInfoUnit.duration) &&
        Objects.equals(this.timeBased, dueInfoUnit.timeBased) &&
        Objects.equals(this.dateBased, dueInfoUnit.dateBased);
  }

  @Override
  public int hashCode() {
    return Objects.hash(durationEstimated, duration, timeBased, dateBased);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DueInfoUnit {\n");
    sb.append("    durationEstimated: ").append(toIndentedString(durationEstimated)).append("\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    timeBased: ").append(toIndentedString(timeBased)).append("\n");
    sb.append("    dateBased: ").append(toIndentedString(dateBased)).append("\n");
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
    openapiFields.add("durationEstimated");
    openapiFields.add("duration");
    openapiFields.add("timeBased");
    openapiFields.add("dateBased");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to DueInfoUnit
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!DueInfoUnit.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in DueInfoUnit is not found in the empty JSON string", DueInfoUnit.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!DueInfoUnit.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `DueInfoUnit` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // validate the optional field `duration`
      if (jsonObj.get("duration") != null && !jsonObj.get("duration").isJsonNull()) {
        DueInfoUnitDuration.validateJsonObject(jsonObj.getAsJsonObject("duration"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DueInfoUnit.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DueInfoUnit' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DueInfoUnit> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DueInfoUnit.class));

       return (TypeAdapter<T>) new TypeAdapter<DueInfoUnit>() {
           @Override
           public void write(JsonWriter out, DueInfoUnit value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DueInfoUnit read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of DueInfoUnit given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of DueInfoUnit
  * @throws IOException if the JSON string is invalid with respect to DueInfoUnit
  */
  public static DueInfoUnit fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DueInfoUnit.class);
  }

 /**
  * Convert an instance of DueInfoUnit to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

