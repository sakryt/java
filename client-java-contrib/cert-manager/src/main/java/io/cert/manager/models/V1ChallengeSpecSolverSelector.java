/*
 * Kubernetes
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: v1.21.1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package io.cert.manager.models;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

import io.kubernetes.client.openapi.JSON;

/**
 * Selector selects a set of DNSNames on the Certificate resource that should be solved using this challenge solver. If not specified, the solver will be treated as the &#39;default&#39; solver with the lowest priority, i.e. if any other solver has a more specific match, it will be used instead.
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-01T07:00:20.132973Z[Etc/UTC]")
public class V1ChallengeSpecSolverSelector {
  public static final String SERIALIZED_NAME_DNS_NAMES = "dnsNames";
  @SerializedName(SERIALIZED_NAME_DNS_NAMES)
  private List<String> dnsNames;

  public static final String SERIALIZED_NAME_DNS_ZONES = "dnsZones";
  @SerializedName(SERIALIZED_NAME_DNS_ZONES)
  private List<String> dnsZones;

  public static final String SERIALIZED_NAME_MATCH_LABELS = "matchLabels";
  @SerializedName(SERIALIZED_NAME_MATCH_LABELS)
  private Map<String, String> matchLabels = new HashMap<>();

  public V1ChallengeSpecSolverSelector() {
  }

  public V1ChallengeSpecSolverSelector dnsNames(List<String> dnsNames) {
    
    this.dnsNames = dnsNames;
    return this;
  }

  public V1ChallengeSpecSolverSelector addDnsNamesItem(String dnsNamesItem) {
    if (this.dnsNames == null) {
      this.dnsNames = new ArrayList<>();
    }
    this.dnsNames.add(dnsNamesItem);
    return this;
  }

   /**
   * List of DNSNames that this solver will be used to solve. If specified and a match is found, a dnsNames selector will take precedence over a dnsZones selector. If multiple solvers match with the same dnsNames value, the solver with the most matching labels in matchLabels will be selected. If neither has more matches, the solver defined earlier in the list will be selected.
   * @return dnsNames
  **/
  @jakarta.annotation.Nullable
  public List<String> getDnsNames() {
    return dnsNames;
  }


  public void setDnsNames(List<String> dnsNames) {
    this.dnsNames = dnsNames;
  }


  public V1ChallengeSpecSolverSelector dnsZones(List<String> dnsZones) {
    
    this.dnsZones = dnsZones;
    return this;
  }

  public V1ChallengeSpecSolverSelector addDnsZonesItem(String dnsZonesItem) {
    if (this.dnsZones == null) {
      this.dnsZones = new ArrayList<>();
    }
    this.dnsZones.add(dnsZonesItem);
    return this;
  }

   /**
   * List of DNSZones that this solver will be used to solve. The most specific DNS zone match specified here will take precedence over other DNS zone matches, so a solver specifying sys.example.com will be selected over one specifying example.com for the domain www.sys.example.com. If multiple solvers match with the same dnsZones value, the solver with the most matching labels in matchLabels will be selected. If neither has more matches, the solver defined earlier in the list will be selected.
   * @return dnsZones
  **/
  @jakarta.annotation.Nullable
  public List<String> getDnsZones() {
    return dnsZones;
  }


  public void setDnsZones(List<String> dnsZones) {
    this.dnsZones = dnsZones;
  }


  public V1ChallengeSpecSolverSelector matchLabels(Map<String, String> matchLabels) {
    
    this.matchLabels = matchLabels;
    return this;
  }

  public V1ChallengeSpecSolverSelector putMatchLabelsItem(String key, String matchLabelsItem) {
    if (this.matchLabels == null) {
      this.matchLabels = new HashMap<>();
    }
    this.matchLabels.put(key, matchLabelsItem);
    return this;
  }

   /**
   * A label selector that is used to refine the set of certificate&#39;s that this challenge solver will apply to.
   * @return matchLabels
  **/
  @jakarta.annotation.Nullable
  public Map<String, String> getMatchLabels() {
    return matchLabels;
  }


  public void setMatchLabels(Map<String, String> matchLabels) {
    this.matchLabels = matchLabels;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1ChallengeSpecSolverSelector v1ChallengeSpecSolverSelector = (V1ChallengeSpecSolverSelector) o;
    return Objects.equals(this.dnsNames, v1ChallengeSpecSolverSelector.dnsNames) &&
        Objects.equals(this.dnsZones, v1ChallengeSpecSolverSelector.dnsZones) &&
        Objects.equals(this.matchLabels, v1ChallengeSpecSolverSelector.matchLabels);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dnsNames, dnsZones, matchLabels);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1ChallengeSpecSolverSelector {\n");
    sb.append("    dnsNames: ").append(toIndentedString(dnsNames)).append("\n");
    sb.append("    dnsZones: ").append(toIndentedString(dnsZones)).append("\n");
    sb.append("    matchLabels: ").append(toIndentedString(matchLabels)).append("\n");
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
    openapiFields.add("dnsNames");
    openapiFields.add("dnsZones");
    openapiFields.add("matchLabels");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to V1ChallengeSpecSolverSelector
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!V1ChallengeSpecSolverSelector.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1ChallengeSpecSolverSelector is not found in the empty JSON string", V1ChallengeSpecSolverSelector.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!V1ChallengeSpecSolverSelector.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1ChallengeSpecSolverSelector` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("dnsNames") != null && !jsonObj.get("dnsNames").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `dnsNames` to be an array in the JSON string but got `%s`", jsonObj.get("dnsNames").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("dnsZones") != null && !jsonObj.get("dnsZones").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `dnsZones` to be an array in the JSON string but got `%s`", jsonObj.get("dnsZones").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1ChallengeSpecSolverSelector.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1ChallengeSpecSolverSelector' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1ChallengeSpecSolverSelector> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1ChallengeSpecSolverSelector.class));

       return (TypeAdapter<T>) new TypeAdapter<V1ChallengeSpecSolverSelector>() {
           @Override
           public void write(JsonWriter out, V1ChallengeSpecSolverSelector value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1ChallengeSpecSolverSelector read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of V1ChallengeSpecSolverSelector given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of V1ChallengeSpecSolverSelector
  * @throws IOException if the JSON string is invalid with respect to V1ChallengeSpecSolverSelector
  */
  public static V1ChallengeSpecSolverSelector fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V1ChallengeSpecSolverSelector.class);
  }

 /**
  * Convert an instance of V1ChallengeSpecSolverSelector to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

