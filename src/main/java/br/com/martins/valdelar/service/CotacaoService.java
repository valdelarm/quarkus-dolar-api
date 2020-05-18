package br.com.martins.valdelar.service;

import br.com.martins.valdelar.dto.CotacaoDto;
import br.com.martins.valdelar.dto.RespostaApiDto;
import br.com.martins.valdelar.service.client.IConsultaCotacaoAPI;
import org.eclipse.microprofile.rest.client.inject.RestClient;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

@ApplicationScoped
public class CotacaoService implements ICotacaoService {

    public static final String JSON_FORMAT = "json";

    @Inject
    @RestClient
    IConsultaCotacaoAPI consultaCotacaoAPI;

    @Override
    public CotacaoDto getCotacao(final String data) {
        RespostaApiDto resposta = consultaCotacaoAPI.getCotacao(data, JSON_FORMAT);

        return resposta.value.get(0);
    }
}
