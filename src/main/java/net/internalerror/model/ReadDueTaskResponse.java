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
import java.util.ArrayList;
import java.util.List;
import net.internalerror.model.TaskInfo;

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
 * ReadDueTaskResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-14T11:06:45.595851660Z[Etc/UTC]")
public class ReadDueTaskResponse {
  public static final String SERIALIZED_NAME_LIST = "list";
  @SerializedName(SERIALIZED_NAME_LIST)
  private List<TaskInfo> _list;

  public ReadDueTaskResponse() {
  }

  public ReadDueTaskResponse _list(List<TaskInfo> _list) {
    
    this._list = _list;
    return this;
  }

  public ReadDueTaskResponse addListItem(TaskInfo _listItem) {
    if (this._list == null) {
      this._list = new ArrayList<>();
    }
    this._list.add(_listItem);
    return this;
  }

   /**
   * Get _list
   * @return _list
  **/
  @javax.annotation.Nullable
  public List<TaskInfo> getList() {
    return _list;
  }


  public void setList(List<TaskInfo> _list) {
    this._list = _list;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReadDueTaskResponse readDueTaskResponse = (ReadDueTaskResponse) o;
    return Objects.equals(this._list, readDueTaskResponse._list);
  }

  @Override
  public int hashCode() {
    return Objects.hash(_list);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReadDueTaskResponse {\n");
    sb.append("    _list: ").append(toIndentedString(_list)).append("\n");
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
    openapiFields.add("list");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ReadDueTaskResponse
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ReadDueTaskResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ReadDueTaskResponse is not found in the empty JSON string", ReadDueTaskResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ReadDueTaskResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ReadDueTaskResponse` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("list") != null && !jsonObj.get("list").isJsonNull()) {
        JsonArray jsonArray_list = jsonObj.getAsJsonArray("list");
        if (jsonArray_list != null) {
          // ensure the json data is an array
          if (!jsonObj.get("list").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `list` to be an array in the JSON string but got `%s`", jsonObj.get("list").toString()));
          }

          // validate the optional field `list` (array)
          for (int i = 0; i < jsonArray_list.size(); i++) {
            TaskInfo.validateJsonObject(jsonArray_list.get(i).getAsJsonObject());
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ReadDueTaskResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ReadDueTaskResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ReadDueTaskResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ReadDueTaskResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<ReadDueTaskResponse>() {
           @Override
           public void write(JsonWriter out, ReadDueTaskResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ReadDueTaskResponse read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ReadDueTaskResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ReadDueTaskResponse
  * @throws IOException if the JSON string is invalid with respect to ReadDueTaskResponse
  */
  public static ReadDueTaskResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ReadDueTaskResponse.class);
  }

 /**
  * Convert an instance of ReadDueTaskResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

