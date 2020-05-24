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
       return Cotacao.builder().
               cotacaoCompra(convertDoubleToBigDecimal(dto.getCotacaoCompra()))
               .cotacaoVenda(convertDoubleToBigDecimal(dto.getCotacaoVenda()))
               .dataHoraCotacao(LocalDateTime.parse(dto.getDataHoraCotacao().replace(' ', 'T')))
               .build();
    }

    private static BigDecimal convertDoubleToBigDecimal(Double number) {
        return new BigDecimal(number, MathContext.DECIMAL64);
    }
}
