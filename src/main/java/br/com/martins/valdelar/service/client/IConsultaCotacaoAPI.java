package br.com.martins.valdelar.service.client;

import br.com.martins.valdelar.dto.CotacaoDto;
import br.com.martins.valdelar.dto.RespostaApiDto;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

@Path("odata")
@RegisterRestClient
public interface IConsultaCotacaoAPI {

    @GET
    @Path("CotacaoDolarDia(dataCotacao=@dataCotacao)")
    @Produces("application/json;charset=UTF-8;odata.metadata=minimal")
    RespostaApiDto getCotacao(@QueryParam("@dataCotacao") String dataCotacao, @QueryParam("format") String format);

}
