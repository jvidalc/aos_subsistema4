package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Trabajo asociado a una notificación.
 */
@Schema(description = "Trabajo asociado a una notificación.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-05-18T16:15:28.764Z[GMT]")


public class Trabajo   {
  @JsonProperty("trabajoId")
  private Integer trabajoId = null;

  @JsonProperty("nombreTrabajo")
  private String nombreTrabajo = null;

  /**
   * Estado de un trabajo
   */
  public enum EstadoTrabajoEnum {
    CREADO("creado"),
    
    PLANIFICADO("planificado"),
    
    INICIADO("iniciado"),
    
    TERMINADO("terminado");

    private String value;

    EstadoTrabajoEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static EstadoTrabajoEnum fromValue(String text) {
      for (EstadoTrabajoEnum b : EstadoTrabajoEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }
  @JsonProperty("estadoTrabajo")
  private EstadoTrabajoEnum estadoTrabajo = null;

  public Trabajo trabajoId(Integer trabajoId) {
    this.trabajoId = trabajoId;
    return this;
  }

  /**
   * Id Trabajo
   * @return trabajoId
   **/
  @Schema(accessMode = Schema.AccessMode.READ_ONLY, description = "Id Trabajo")
  
    public Integer getTrabajoId() {
    return trabajoId;
  }

  public void setTrabajoId(Integer trabajoId) {
    this.trabajoId = trabajoId;
  }

  public Trabajo nombreTrabajo(String nombreTrabajo) {
    this.nombreTrabajo = nombreTrabajo;
    return this;
  }

  /**
   * Nombre del trabajo
   * @return nombreTrabajo
   **/
  @Schema(accessMode = Schema.AccessMode.READ_ONLY, description = "Nombre del trabajo")
  
    public String getNombreTrabajo() {
    return nombreTrabajo;
  }

  public void setNombreTrabajo(String nombreTrabajo) {
    this.nombreTrabajo = nombreTrabajo;
  }

  public Trabajo estadoTrabajo(EstadoTrabajoEnum estadoTrabajo) {
    this.estadoTrabajo = estadoTrabajo;
    return this;
  }

  /**
   * Estado de un trabajo
   * @return estadoTrabajo
   **/
  @Schema(description = "Estado de un trabajo")
  
    public EstadoTrabajoEnum getEstadoTrabajo() {
    return estadoTrabajo;
  }

  public void setEstadoTrabajo(EstadoTrabajoEnum estadoTrabajo) {
    this.estadoTrabajo = estadoTrabajo;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Trabajo trabajo = (Trabajo) o;
    return Objects.equals(this.trabajoId, trabajo.trabajoId) &&
        Objects.equals(this.nombreTrabajo, trabajo.nombreTrabajo) &&
        Objects.equals(this.estadoTrabajo, trabajo.estadoTrabajo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(trabajoId, nombreTrabajo, estadoTrabajo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Trabajo {\n");
    
    sb.append("    trabajoId: ").append(toIndentedString(trabajoId)).append("\n");
    sb.append("    nombreTrabajo: ").append(toIndentedString(nombreTrabajo)).append("\n");
    sb.append("    estadoTrabajo: ").append(toIndentedString(estadoTrabajo)).append("\n");
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
