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

        cotacao.setDataCotacao(LocalDate.now());
        cotacao.persist();

        log.info("Quote save successfully " + cotacao);

        return cotacao;
    }

    public Cotacao findByDate() {
        return null;
    }
}
