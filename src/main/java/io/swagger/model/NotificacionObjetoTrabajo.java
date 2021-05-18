package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.Trabajo;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Objeto Trabajo asociado a una notificacion.
 */
@Schema(description = "Objeto Trabajo asociado a una notificacion.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-05-18T16:15:28.764Z[GMT]")


public class NotificacionObjetoTrabajo   {
  @JsonProperty("Trabajo")
  private Trabajo trabajo = null;

  public NotificacionObjetoTrabajo trabajo(Trabajo trabajo) {
    this.trabajo = trabajo;
    return this;
  }

  /**
   * Get trabajo
   * @return trabajo
   **/
  @Schema(description = "")
  
    @Valid
    public Trabajo getTrabajo() {
    return trabajo;
  }

  public void setTrabajo(Trabajo trabajo) {
    this.trabajo = trabajo;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NotificacionObjetoTrabajo notificacionObjetoTrabajo = (NotificacionObjetoTrabajo) o;
    return Objects.equals(this.trabajo, notificacionObjetoTrabajo.trabajo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(trabajo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NotificacionObjetoTrabajo {\n");
    
    sb.append("    trabajo: ").append(toIndentedString(trabajo)).append("\n");
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
