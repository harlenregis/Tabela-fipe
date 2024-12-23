package br.com.alura.TabelaFipe.model;

import br.com.alura.TabelaFipe.model.Dados;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public record Modelos(List<Dados> modelos) {
}