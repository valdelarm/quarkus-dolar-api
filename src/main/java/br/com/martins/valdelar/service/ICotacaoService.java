package br.com.martins.valdelar.service;

import br.com.martins.valdelar.dto.CotacaoDto;
import br.com.martins.valdelar.exception.ApiException;

public interface ICotacaoService {
    CotacaoDto getCotacao(String data) throws ApiException;
}
