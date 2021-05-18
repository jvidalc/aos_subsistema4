package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.Notificacion;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * InlineResponse200
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-05-18T16:15:28.764Z[GMT]")


public class InlineResponse200   {
  @JsonProperty("notificaciones")
  @Valid
  private List<Notificacion> notificaciones = null;

  public InlineResponse200 notificaciones(List<Notificacion> notificaciones) {
    this.notificaciones = notificaciones;
    return this;
  }

  public InlineResponse200 addNotificacionesItem(Notificacion notificacionesItem) {
    if (this.notificaciones == null) {
      this.notificaciones = new ArrayList<Notificacion>();
    }
    this.notificaciones.add(notificacionesItem);
    return this;
  }

  /**
   * array de notificaciones
   * @return notificaciones
   **/
  @Schema(description = "array de notificaciones")
      @Valid
    public List<Notificacion> getNotificaciones() {
    return notificaciones;
  }

  public void setNotificaciones(List<Notificacion> notificaciones) {
    this.notificaciones = notificaciones;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse200 inlineResponse200 = (InlineResponse200) o;
    return Objects.equals(this.notificaciones, inlineResponse200.notificaciones);
  }

  @Override
  public int hashCode() {
    return Objects.hash(notificaciones);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse200 {\n");
    
    sb.append("    notificaciones: ").append(toIndentedString(notificaciones)).append("\n");
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
