package com.example.demo.service;

import com.example.demo.model.Endereco;
public interface CepService {
    Endereco buscaEndereco(String cep);
}
