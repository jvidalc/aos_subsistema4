package io.swagger.api;

import io.swagger.model.InlineResponse200;
import io.swagger.model.Notificacion;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.media.Schema;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;

import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.ArrayList;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-05-18T16:15:28.764Z[GMT]")
@RestController
public class NotificacionApiController implements NotificacionApi {

    private static final Logger log = LoggerFactory.getLogger(NotificacionApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public NotificacionApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<InlineResponse200> s4NotificacionArrayGet() {
        String accept = request.getHeader("Accept");
        if (accept != null && (accept.contains("application/json") || accept.contains("*/*"))) {
            try {
                return new ResponseEntity<InlineResponse200>(objectMapper.readValue("{\n  \"notificaciones\" : [ {\n    \"notificacionId\" : 1234,\n    \"clienteId\" : 5678,\n    \"fechaNotificacion\" : \"2021-04-06\",\n    \"objetoTrabajo\" : {\n      \"Trabajo\" : {\n        \"trabajoId\" : 91011,\n        \"nombreTrabajo\" : \"Revisión\",\n        \"estadoTrabajo\" : \"creado\"\n      }\n    },\n    \"links\" : {\n      \"parent\" : {\n        \"href\" : \"/api/v1/notificacion\",\n        \"rel\" : \"lista_notificaciones crear_notificacion\"\n      },\n      \"self\" : {\n        \"href\" : \"/api/v1/notificacion/1234\",\n        \"rel\" : \"modificar_notificacion eliminar_notificacion\"\n      }\n    }\n  }, {\n    \"notificacionId\" : 1234,\n    \"clienteId\" : 5678,\n    \"fechaNotificacion\" : \"2021-04-06\",\n    \"objetoTrabajo\" : {\n      \"Trabajo\" : {\n        \"trabajoId\" : 91011,\n        \"nombreTrabajo\" : \"Revisión\",\n        \"estadoTrabajo\" : \"creado\"\n      }\n    },\n    \"links\" : {\n      \"parent\" : {\n        \"href\" : \"/api/v1/notificacion\",\n        \"rel\" : \"lista_notificaciones crear_notificacion\"\n      },\n      \"self\" : {\n        \"href\" : \"/api/v1/notificacion/1234\",\n        \"rel\" : \"modificar_notificacion eliminar_notificacion\"\n      }\n    }\n  } ]\n}", InlineResponse200.class), HttpStatus.OK);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<InlineResponse200>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<InlineResponse200>(HttpStatus.NOT_ACCEPTABLE);
    }

    public ResponseEntity<Void> s4NotificacionArrayOptions() {
        String accept = request.getHeader("Accept");
        if (accept != null && (accept.contains("application/json") || accept.contains("*/*"))) {
            HttpHeaders responseHeaders = new HttpHeaders();
            responseHeaders.add("Allow", "GET, OPTIONS, POST");
            return new ResponseEntity<Void>(responseHeaders, HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<Void>(HttpStatus.NOT_ACCEPTABLE);
    }

    public ResponseEntity<Void> s4NotificacionDelete(@Parameter(in = ParameterIn.PATH, description = "ID de una notificación", required=true, schema=@Schema()) @PathVariable("notificacionId") Integer notificacionId) {
        String accept = request.getHeader("Accept");
        if (accept != null && (accept.contains("application/json") || accept.contains("*/*"))) {
                return new ResponseEntity<Void>(HttpStatus.OK);
        }
        return new ResponseEntity<Void>(HttpStatus.NOT_ACCEPTABLE);
    }

    public ResponseEntity<Notificacion> s4NotificacionGet(@Parameter(in = ParameterIn.PATH, description = "ID de una notificación", required=true, schema=@Schema()) @PathVariable("notificacionId") Integer notificacionId) {
        String accept = request.getHeader("Accept");
        if (accept != null && (accept.contains("application/json") || accept.contains("*/*"))) {
            try {
                return new ResponseEntity<Notificacion>(objectMapper.readValue("{\n  \"notificacionId\" : 1234,\n  \"clienteId\" : 5678,\n  \"fechaNotificacion\" : \"2021-04-06\",\n  \"objetoTrabajo\" : {\n    \"Trabajo\" : {\n      \"trabajoId\" : 91011,\n      \"nombreTrabajo\" : \"Revisión\",\n      \"estadoTrabajo\" : \"creado\"\n    }\n  },\n  \"links\" : {\n    \"parent\" : {\n      \"href\" : \"/api/v1/notificacion\",\n      \"rel\" : \"lista_notificaciones crear_notificacion\"\n    },\n    \"self\" : {\n      \"href\" : \"/api/v1/notificacion/1234\",\n      \"rel\" : \"modificar_notificacion eliminar_notificacion\"\n    }\n  }\n}", Notificacion.class), HttpStatus.OK);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Notificacion>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Notificacion>(HttpStatus.NOT_ACCEPTABLE);
    }

    public ResponseEntity<Void> s4NotificacionOptions(@Parameter(in = ParameterIn.PATH, description = "ID de una notificación", required=true, schema=@Schema()) @PathVariable("notificacionId") Integer notificacionId) {
        String accept = request.getHeader("Accept");
        if (accept != null && (accept.contains("application/json") || accept.contains("*/*"))) {
            HttpHeaders responseHeaders = new HttpHeaders();
            responseHeaders.add("Allow", "GET, PUT, DELETE, OPTIONS");
            return new ResponseEntity<Void>(responseHeaders, HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<Void>(HttpStatus.NOT_ACCEPTABLE);
    }

    public ResponseEntity<Notificacion> s4NotificacionPost(@Parameter(in = ParameterIn.DEFAULT, description = "`Notificacion` data", required=true, schema=@Schema()) @Valid @RequestBody Object body) {
        String accept = request.getHeader("Accept");
        if (accept != null && (accept.contains("application/json") || accept.contains("*/*"))) {
            try {
                return new ResponseEntity<Notificacion>(objectMapper.readValue("{\n  \"notificacionId\" : 1234,\n  \"clienteId\" : 5678,\n  \"fechaNotificacion\" : \"2021-04-06\",\n  \"objetoTrabajo\" : {\n    \"Trabajo\" : {\n      \"trabajoId\" : 91011,\n      \"nombreTrabajo\" : \"Revisión\",\n      \"estadoTrabajo\" : \"creado\"\n    }\n  },\n  \"links\" : {\n    \"parent\" : {\n      \"href\" : \"/api/v1/notificacion\",\n      \"rel\" : \"lista_notificaciones crear_notificacion\"\n    },\n    \"self\" : {\n      \"href\" : \"/api/v1/notificacion/1234\",\n      \"rel\" : \"modificar_notificacion eliminar_notificacion\"\n    }\n  }\n}", Notificacion.class), HttpStatus.CREATED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Notificacion>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }
        return new ResponseEntity<Notificacion>(HttpStatus.NOT_ACCEPTABLE);
    }

    public ResponseEntity<Notificacion> s4NotificacionPut(@Parameter(in = ParameterIn.HEADER, description = "ETag del recurso que se desea modificar" ,required=true,schema=@Schema()) @RequestHeader(value="If-Match", required=true) String ifMatch,@Pattern(regexp="^\\d+$") @Parameter(in = ParameterIn.PATH, description = "ID de una notificación", required=true, schema=@Schema()) @PathVariable("notificacionId") Integer notificacionId,@Parameter(in = ParameterIn.DEFAULT, description = "`Notificacion` data", required=true, schema=@Schema()) @Valid @RequestBody Object body) {
        String accept = request.getHeader("Accept");
        if (accept != null && (accept.contains("application/json") || accept.contains("*/*"))) {
            try {
                return new ResponseEntity<Notificacion>(objectMapper.readValue("{\n  \"notificacionId\" : 1234,\n  \"clienteId\" : 5678,\n  \"fechaNotificacion\" : \"2021-04-06\",\n  \"objetoTrabajo\" : {\n    \"Trabajo\" : {\n      \"trabajoId\" : 91011,\n      \"nombreTrabajo\" : \"Revisión\",\n      \"estadoTrabajo\" : \"creado\"\n    }\n  },\n  \"links\" : {\n    \"parent\" : {\n      \"href\" : \"/api/v1/notificacion\",\n      \"rel\" : \"lista_notificaciones crear_notificacion\"\n    },\n    \"self\" : {\n      \"href\" : \"/api/v1/notificacion/1234\",\n      \"rel\" : \"modificar_notificacion eliminar_notificacion\"\n    }\n  }\n}", Notificacion.class), HttpStatus.OK);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Notificacion>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Notificacion>(HttpStatus.NOT_ACCEPTABLE);
    }

}
