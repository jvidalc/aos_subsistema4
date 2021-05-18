package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.NotificacionLinks;
import io.swagger.model.NotificacionObjetoTrabajo;
import io.swagger.v3.oas.annotations.media.Schema;
import org.threeten.bp.LocalDate;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Notificacion asociada al estado del trabajo de un cliente en concreto.
 */
@Schema(description = "Notificacion asociada al estado del trabajo de un cliente en concreto.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-05-18T16:15:28.764Z[GMT]")


public class Notificacion   {
  @JsonProperty("notificacionId")
  private Integer notificacionId = null;

  @JsonProperty("clienteId")
  private Integer clienteId = null;

  @JsonProperty("fechaNotificacion")
  private LocalDate fechaNotificacion = null;

  @JsonProperty("objetoTrabajo")
  private NotificacionObjetoTrabajo objetoTrabajo = null;

  @JsonProperty("links")
  private NotificacionLinks links = null;

  public Notificacion notificacionId(Integer notificacionId) {
    this.notificacionId = notificacionId;
    return this;
  }

  /**
   * Id Notificacion
   * @return notificacionId
   **/
  @Schema(accessMode = Schema.AccessMode.READ_ONLY, description = "Id Notificacion")
  
    public Integer getNotificacionId() {
    return notificacionId;
  }

  public void setNotificacionId(Integer notificacionId) {
    this.notificacionId = notificacionId;
  }

  public Notificacion clienteId(Integer clienteId) {
    this.clienteId = clienteId;
    return this;
  }

  /**
   * Id Cliente
   * @return clienteId
   **/
  @Schema(accessMode = Schema.AccessMode.READ_ONLY, description = "Id Cliente")
  
    public Integer getClienteId() {
    return clienteId;
  }

  public void setClienteId(Integer clienteId) {
    this.clienteId = clienteId;
  }

  public Notificacion fechaNotificacion(LocalDate fechaNotificacion) {
    this.fechaNotificacion = fechaNotificacion;
    return this;
  }

  /**
   * Hora de envío de la notificacion
   * @return fechaNotificacion
   **/
  @Schema(description = "Hora de envío de la notificacion")
  
    @Valid
    public LocalDate getFechaNotificacion() {
    return fechaNotificacion;
  }

  public void setFechaNotificacion(LocalDate fechaNotificacion) {
    this.fechaNotificacion = fechaNotificacion;
  }

  public Notificacion objetoTrabajo(NotificacionObjetoTrabajo objetoTrabajo) {
    this.objetoTrabajo = objetoTrabajo;
    return this;
  }

  /**
   * Get objetoTrabajo
   * @return objetoTrabajo
   **/
  @Schema(description = "")
  
    @Valid
    public NotificacionObjetoTrabajo getObjetoTrabajo() {
    return objetoTrabajo;
  }

  public void setObjetoTrabajo(NotificacionObjetoTrabajo objetoTrabajo) {
    this.objetoTrabajo = objetoTrabajo;
  }

  public Notificacion links(NotificacionLinks links) {
    this.links = links;
    return this;
  }

  /**
   * Get links
   * @return links
   **/
  @Schema(description = "")
  
    @Valid
    public NotificacionLinks getLinks() {
    return links;
  }

  public void setLinks(NotificacionLinks links) {
    this.links = links;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Notificacion notificacion = (Notificacion) o;
    return Objects.equals(this.notificacionId, notificacion.notificacionId) &&
        Objects.equals(this.clienteId, notificacion.clienteId) &&
        Objects.equals(this.fechaNotificacion, notificacion.fechaNotificacion) &&
        Objects.equals(this.objetoTrabajo, notificacion.objetoTrabajo) &&
        Objects.equals(this.links, notificacion.links);
  }

  @Override
  public int hashCode() {
    return Objects.hash(notificacionId, clienteId, fechaNotificacion, objetoTrabajo, links);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Notificacion {\n");
    
    sb.append("    notificacionId: ").append(toIndentedString(notificacionId)).append("\n");
    sb.append("    clienteId: ").append(toIndentedString(clienteId)).append("\n");
    sb.append("    fechaNotificacion: ").append(toIndentedString(fechaNotificacion)).append("\n");
    sb.append("    objetoTrabajo: ").append(toIndentedString(objetoTrabajo)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
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
