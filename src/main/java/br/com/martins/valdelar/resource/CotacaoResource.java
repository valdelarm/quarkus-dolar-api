package br.com.martins.valdelar.resource;

import br.com.martins.valdelar.dto.CotacaoDto;
import br.com.martins.valdelar.service.ICotacaoService;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("/v1/cotacao")
public class CotacaoResource {

    @Inject
    ICotacaoService service;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    @Path("/{data}")
    public CotacaoDto getCotacao(@PathParam("data") final String data) {
        return service.getCotacao("\'" + data + "\'");
    }
}