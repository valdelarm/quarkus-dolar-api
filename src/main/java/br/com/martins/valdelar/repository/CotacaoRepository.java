package br.com.martins.valdelar.repository;

import br.com.martins.valdelar.model.Cotacao;
import lombok.extern.slf4j.Slf4j;

import javax.enterprise.context.ApplicationScoped;
import java.time.LocalDate;


@ApplicationScoped
@Slf4j
public class CotacaoRepository {

    public Cotacao save(Cotacao cotacao) {
        log.info("Saving the quote " + cotacao);

        cotacao.setDataCotacao(cotacao.getDataHoraCotacao().toLocalDate());
        cotacao.persist();

        log.info("Quote saved successfully " + cotacao);

        return cotacao;
    }

    public Cotacao findByDate(LocalDate date) {
        Cotacao cotacao = new Cotacao();
        cotacao = cotacao.find("dataCotacao", date).firstResult();
        return cotacao;
    }
}
