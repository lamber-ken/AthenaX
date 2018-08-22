/*
 * AthenaX REST API
 * AthenaX REST API
 *
 * OpenAPI spec version: 0.1
 * Contact: haohui@uber.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.uber.athenax.backend.api;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.*;

/**
 * InstanceState
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2018-08-21T21:38:44.857+08:00")
public class InstanceState   {
  /**
   * State of the application
   */
  public enum StateEnum {
    NEW("NEW"),
    
    NEW_SAVING("NEW_SAVING"),
    
    SUBMITTED("SUBMITTED"),
    
    ACCEPTED("ACCEPTED"),
    
    RUNNING("RUNNING"),
    
    FINISHED("FINISHED"),
    
    FAILED("FAILED"),
    
    KILLED("KILLED");

    private String value;

    StateEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static StateEnum fromValue(String text) {
      for (StateEnum b : StateEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("state")
  private StateEnum state = null;

  public InstanceState state(StateEnum state) {
    this.state = state;
    return this;
  }

  /**
   * State of the application
   * @return state
   **/
  @JsonProperty("state")
  @ApiModelProperty(value = "State of the application")
  public StateEnum getState() {
    return state;
  }

  public void setState(StateEnum state) {
    this.state = state;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InstanceState instanceState = (InstanceState) o;
    return Objects.equals(this.state, instanceState.state);
  }

  @Override
  public int hashCode() {
    return Objects.hash(state);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InstanceState {\n");
    
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
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

