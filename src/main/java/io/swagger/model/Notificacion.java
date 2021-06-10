package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import org.threeten.bp.LocalDate;
import org.springframework.validation.annotation.Validated;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.Valid;

/**
 * Notificacion asociada al estado del trabajo de un cliente en concreto.
 */
@Schema(description = "Notificacion asociada al estado del trabajo de un cliente en concreto.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-05-18T16:15:28.764Z[GMT]")

@Entity
@Table(name="notificaciones")
public class Notificacion   {
  @JsonProperty("notificacionId")
  @Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
  private Integer notificacionId = null;
  @Column(name="idCliente")
  @JsonProperty("clienteId")
  private Integer clienteId = null;
  @Column(name="fecha")
  @JsonProperty("fechaNotificacion")
  private LocalDate fechaNotificacion = null;
  @OneToOne()
	@JoinColumn(name="fk_trabajo")
  @JsonProperty("trabajo")
  private Trabajo trabajo = null;

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

  public Notificacion trabajo(Trabajo trabajo) {
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
        Objects.equals(this.trabajo, notificacion.trabajo) &&
        Objects.equals(this.links, notificacion.links);
  }

  @Override
  public int hashCode() {
    return Objects.hash(notificacionId, clienteId, fechaNotificacion, trabajo, links);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Notificacion {\n");
    
    sb.append("    notificacionId: ").append(toIndentedString(notificacionId)).append("\n");
    sb.append("    clienteId: ").append(toIndentedString(clienteId)).append("\n");
    sb.append("    fechaNotificacion: ").append(toIndentedString(fechaNotificacion)).append("\n");
    sb.append("    trabajo: ").append(toIndentedString(trabajo)).append("\n");
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
