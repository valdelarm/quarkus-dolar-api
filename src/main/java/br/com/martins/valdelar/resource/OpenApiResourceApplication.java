package br.com.martins.valdelar.resource;

import org.eclipse.microprofile.openapi.annotations.OpenAPIDefinition;
import org.eclipse.microprofile.openapi.annotations.info.Contact;
import org.eclipse.microprofile.openapi.annotations.info.Info;

import javax.ws.rs.core.Application;

@OpenAPIDefinition(info = @Info(
        title = "API de cotação do dólar",
        version = "1.0",
        contact = @Contact(
                name = "Valdelar Martins",
                email = "valdelar.martins@gmail.com"
        )
))
public class OpenApiResourceApplication extends Application {
}
