package br.com.martins.valdelar.dto;

import br.com.martins.valdelar.model.Cotacao;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.math.BigDecimal;
import java.math.MathContext;
import java.time.LocalDateTime;

@Getter
@Setter
@ToString
public class CotacaoDto {
    private Double cotacaoCompra;
    private Double cotacaoVenda;
    private String dataHoraCotacao;


    public static Cotacao dtoToEntity(CotacaoDto dto) {
        Cotacao cotacao = new Cotacao();
        cotacao.setCotacaoCompra(convertDoubleToBigDecimal(dto.getCotacaoCompra()));
        cotacao.setCotacaoVenda(convertDoubleToBigDecimal(dto.getCotacaoVenda()));
        cotacao.setDataHoraCotacao(LocalDateTime.parse(dto.getDataHoraCotacao().replace(' ', 'T')));

        return cotacao;
    }

    private static BigDecimal convertDoubleToBigDecimal(Double number) {
        return new BigDecimal(number, MathContext.DECIMAL64);
    }
}
