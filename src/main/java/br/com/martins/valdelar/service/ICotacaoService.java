package br.com.martins.valdelar.service;

import br.com.martins.valdelar.dto.CotacaoDto;

public interface ICotacaoService {
    CotacaoDto getCotacao(String data);
}
