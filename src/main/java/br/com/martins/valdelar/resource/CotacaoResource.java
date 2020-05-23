package br.com.martins.valdelar.resource;

import br.com.martins.valdelar.exception.ApiException;
import br.com.martins.valdelar.service.ICotacaoService;
import lombok.extern.slf4j.Slf4j;
import org.eclipse.microprofile.openapi.annotations.Operation;
import org.eclipse.microprofile.openapi.annotations.parameters.Parameter;
import org.eclipse.microprofile.openapi.annotations.responses.APIResponse;
import org.eclipse.microprofile.openapi.annotations.responses.APIResponses;
import org.eclipse.microprofile.openapi.annotations.tags.Tag;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/v1/cotacao")
@Slf4j
@Tag(name = "cotacao", description = "cotação do dólar")
public class CotacaoResource {

    @Inject
    private ICotacaoService service;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    @Path("/{data}")
    @Operation(summary = "Busca a cotação do dólar em uma determinada datas")
    @APIResponses(value = {
            @APIResponse(responseCode = "200", description = "OK"),
            @APIResponse(responseCode = "400", description = "Erro")
    })
    @Parameter(description = "A data deve ser no formato MM-dd-aaaa como por exemplo 05-23-2020", required = true)
    public Response getCotacao(@PathParam("data") String data) {
        try {
            return Response.ok(service.getCotacao(data)).build();
        } catch (ApiException e) {
            log.error(e.getMessage());
            return Response.status(Response.Status.BAD_REQUEST).entity(e.getMessage()).build();
        }
    }
}