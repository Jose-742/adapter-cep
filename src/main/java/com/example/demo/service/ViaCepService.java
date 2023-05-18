package com.example.demo.service;

import com.example.demo.model.Endereco;
import org.springframework.web.reactive.function.client.WebClient;
//@Service
public class ViaCepService implements CepService {
    public static final String URL = "http://viacep.com.br";
    public static final String ENDPOINT = "/ws/%s/json/";
    private final WebClient client ;

    public ViaCepService() {
        client = WebClient.builder().baseUrl(URL).build();
    }

    @Override
    public Endereco buscaEndereco(String cep) {
        return client.get()
                .uri(ENDPOINT.formatted(cep))
                .retrieve()
                .bodyToMono(Endereco.class)
                .block();
    }
}
