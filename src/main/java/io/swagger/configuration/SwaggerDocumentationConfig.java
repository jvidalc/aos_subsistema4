package io.swagger.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.service.ApiInfo;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-05-18T16:15:28.764Z[GMT]")
@Configuration
public class SwaggerDocumentationConfig {

    @Bean
    public Docket customImplementation(){
        return new Docket(DocumentationType.OAS_30)
                .select()
                    .apis(RequestHandlerSelectors.basePackage("io.swagger.api"))
                    .build()
                .directModelSubstitute(org.threeten.bp.LocalDate.class, java.sql.Date.class)
                .directModelSubstitute(org.threeten.bp.OffsetDateTime.class, java.util.Date.class)
                .apiInfo(apiInfo());
    }

    ApiInfo apiInfo() {
        return new ApiInfoBuilder()
            .title("🔴 ️Notificaciones del taller")
            .description("<b>[UPM] AOS</b></br> API para la gestión de notificaciones relacionadas con el funcionamiento del taller.</br> Este subsistema es el encargado de notificar a los clientes el estado de los diferentes trabajos.")
            .license("MIT")
            .licenseUrl("https://opensource.org/licenses/MIT")
            .termsOfServiceUrl("https://moodle.upm.es/titulaciones/oficiales/course/view.php?id&#x3D;9463")
            .version("1.0.0")
            .contact(new Contact("","", ""))
            .build();
    }

    @Bean
    public OpenAPI openApi() {
        return new OpenAPI()
            .info(new Info()
                .title("🔴 ️Notificaciones del taller")
                .description("<b>[UPM] AOS</b></br> API para la gestión de notificaciones relacionadas con el funcionamiento del taller.</br> Este subsistema es el encargado de notificar a los clientes el estado de los diferentes trabajos.")
                .termsOfService("https://moodle.upm.es/titulaciones/oficiales/course/view.php?id&#x3D;9463")
                .version("1.0.0")
                .license(new License()
                    .name("MIT")
                    .url("https://opensource.org/licenses/MIT"))
                .contact(new io.swagger.v3.oas.models.info.Contact()
                    .email("")));
    }

}
