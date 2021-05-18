package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import java.math.BigDecimal;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Problem Details for HTTP APIs
 */
@Schema(description = "Problem Details for HTTP APIs")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-05-18T16:15:28.764Z[GMT]")


public class HTTPProblem   {
  @JsonProperty("type")
  private String type = null;

  @JsonProperty("title")
  private String title = null;

  @JsonProperty("status")
  private BigDecimal status = null;

  @JsonProperty("detail")
  private String detail = null;

  @JsonProperty("instance")
  private String instance = null;

  public HTTPProblem type(String type) {
    this.type = type;
    return this;
  }

  /**
   * A URI reference [RFC3986] that identifies the problem type
   * @return type
   **/
  @Schema(description = "A URI reference [RFC3986] that identifies the problem type")
  
    public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public HTTPProblem title(String title) {
    this.title = title;
    return this;
  }

  /**
   * short human-readable summary of the problem type
   * @return title
   **/
  @Schema(description = "short human-readable summary of the problem type")
  
    public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public HTTPProblem status(BigDecimal status) {
    this.status = status;
    return this;
  }

  /**
   * HTTP status code
   * @return status
   **/
  @Schema(description = "HTTP status code")
  
    @Valid
    public BigDecimal getStatus() {
    return status;
  }

  public void setStatus(BigDecimal status) {
    this.status = status;
  }

  public HTTPProblem detail(String detail) {
    this.detail = detail;
    return this;
  }

  /**
   * human-readable explanation specific to this occurrence of the problem
   * @return detail
   **/
  @Schema(description = "human-readable explanation specific to this occurrence of the problem")
  
    public String getDetail() {
    return detail;
  }

  public void setDetail(String detail) {
    this.detail = detail;
  }

  public HTTPProblem instance(String instance) {
    this.instance = instance;
    return this;
  }

  /**
   * A URI reference that identifies the specific occurrence of the problem.  It may or may not yield further information if dereferenced
   * @return instance
   **/
  @Schema(description = "A URI reference that identifies the specific occurrence of the problem.  It may or may not yield further information if dereferenced")
  
    public String getInstance() {
    return instance;
  }

  public void setInstance(String instance) {
    this.instance = instance;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HTTPProblem htTPProblem = (HTTPProblem) o;
    return Objects.equals(this.type, htTPProblem.type) &&
        Objects.equals(this.title, htTPProblem.title) &&
        Objects.equals(this.status, htTPProblem.status) &&
        Objects.equals(this.detail, htTPProblem.detail) &&
        Objects.equals(this.instance, htTPProblem.instance);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, title, status, detail, instance);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HTTPProblem {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    detail: ").append(toIndentedString(detail)).append("\n");
    sb.append("    instance: ").append(toIndentedString(instance)).append("\n");
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
