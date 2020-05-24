package br.com.martins.valdelar.service;

import br.com.martins.valdelar.dto.CotacaoDto;
import br.com.martins.valdelar.dto.RespostaApiDto;
import br.com.martins.valdelar.exception.ApiException;
import br.com.martins.valdelar.helper.DataHelper;
import br.com.martins.valdelar.model.Cotacao;
import br.com.martins.valdelar.repository.CotacaoRepository;
import br.com.martins.valdelar.service.client.IConsultaCotacaoAPI;
import lombok.extern.slf4j.Slf4j;
import org.eclipse.microprofile.rest.client.inject.RestClient;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import java.time.LocalDate;

@ApplicationScoped
@Slf4j
public class CotacaoService implements ICotacaoService {

    public static final String JSON_FORMAT = "json";

    @Inject
    CotacaoRepository repository;

    @Inject
    @RestClient
    IConsultaCotacaoAPI consultaCotacaoAPI;

    @Override
    public CotacaoDto getCotacao(String data) throws ApiException {
        RespostaApiDto resposta;
        data = DataHelper.getDiaUtil(DataHelper.parseData(data));
        try {
            log.info("Consulta cotacao do dolar do dia  " + data);
            resposta = consultaCotacaoAPI.getCotacao("\'"+ data +"\'", JSON_FORMAT);
        } catch (Exception e) {
            throw new ApiException("Erro ao consultar a API " + e.getMessage());
        }

        if (resposta == null || resposta.getValue() == null || resposta.getValue().isEmpty()) {
            throw new ApiException("Cotação não encontrada para a data: " + data);
        }
        CotacaoDto cotacaoDto = resposta.getValue().get(0);

        repository.save(CotacaoDto.dtoToEntity(cotacaoDto));

        return cotacaoDto;
    }
}
