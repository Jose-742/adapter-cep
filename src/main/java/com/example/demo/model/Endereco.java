package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)//se tiver um atributo que nao tem aqui ele ignora
public class Endereco {
    private String logradouro;
    private String complemento;
    private String bairro;

    @JsonAlias("cidade")
    private String localidade;

    @JsonAlias("estado")
    private String uf;
    private String cep;

    @JsonAlias({"codigo_ibge", "ibge"})
    private String codigoIbge;
}