package br.com.lancha.curriculo.dto;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class ExperienciaProfissionalDto {
    private String nomeEmpresa;
    private LocalDate dataInicio;
    private LocalDate dataFim;
    private String descricao;
}
