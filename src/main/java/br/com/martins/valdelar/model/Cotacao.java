package br.com.martins.valdelar.model;

import io.quarkus.mongodb.panache.MongoEntity;
import io.quarkus.mongodb.panache.PanacheMongoEntity;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Getter
@Setter
@ToString
@EqualsAndHashCode
@MongoEntity(collection = "cotacao")
public class Cotacao extends PanacheMongoEntity {

    private LocalDateTime tempoRequisicao;

    private LocalDate dataCotacao;

    private BigDecimal cotacaoCompra;

    private BigDecimal cotacaoVenda;

    private LocalDateTime dataHoraCotacao;
}
