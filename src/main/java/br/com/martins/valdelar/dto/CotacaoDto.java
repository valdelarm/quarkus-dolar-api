package br.com.martins.valdelar.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CotacaoDto {
    private Double cotacaoCompra;
    private Double cotacaoVenda;
    private String dataHoraCotacao;
}
