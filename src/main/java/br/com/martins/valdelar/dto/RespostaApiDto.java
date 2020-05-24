package br.com.martins.valdelar.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
@Getter
@Setter
public class RespostaApiDto {

    @JsonProperty(value = "value")
    private List<CotacaoDto> value;
}
