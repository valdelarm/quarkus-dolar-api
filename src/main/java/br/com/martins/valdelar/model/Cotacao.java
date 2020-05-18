package br.com.martins.valdelar.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Getter
@Setter
@ToString
@EqualsAndHashCode
public class Cotacao {

    private String id;

    private LocalDateTime tempoRequisicao;

    private LocalDate dataCotacao;

    private BigDecimal cotacaoCompra;

    private BigDecimal cotacaoVenda;

    private LocalDateTime dataHoraCotacao;
}
