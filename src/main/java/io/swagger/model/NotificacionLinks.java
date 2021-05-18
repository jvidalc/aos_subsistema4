package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.Link;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Enlaces de relación
 */
@Schema(description = "Enlaces de relación")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-05-18T16:15:28.764Z[GMT]")


public class NotificacionLinks   {
  @JsonProperty("parent")
  private Link parent = null;

  @JsonProperty("self")
  private Link self = null;

  public NotificacionLinks parent(Link parent) {
    this.parent = parent;
    return this;
  }

  /**
   * Get parent
   * @return parent
   **/
  @Schema(description = "")
  
    @Valid
    public Link getParent() {
    return parent;
  }

  public void setParent(Link parent) {
    this.parent = parent;
  }

  public NotificacionLinks self(Link self) {
    this.self = self;
    return this;
  }

  /**
   * Get self
   * @return self
   **/
  @Schema(description = "")
  
    @Valid
    public Link getSelf() {
    return self;
  }

  public void setSelf(Link self) {
    this.self = self;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NotificacionLinks notificacionLinks = (NotificacionLinks) o;
    return Objects.equals(this.parent, notificacionLinks.parent) &&
        Objects.equals(this.self, notificacionLinks.self);
  }

  @Override
  public int hashCode() {
    return Objects.hash(parent, self);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NotificacionLinks {\n");
    
    sb.append("    parent: ").append(toIndentedString(parent)).append("\n");
    sb.append("    self: ").append(toIndentedString(self)).append("\n");
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
