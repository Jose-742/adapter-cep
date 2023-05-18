package com.example.demo.controller;

import com.example.demo.model.Endereco;
import com.example.demo.service.CepService;
import com.example.demo.service.PostmonCepService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/postmon")
public class PostmonCepController {

    private final PostmonCepService postmonCepservice;

    public PostmonCepController(PostmonCepService postmonCepservice) {
        this.postmonCepservice = postmonCepservice;
    }

    @GetMapping("/{cep}")
    public Endereco buscaEndereco(@PathVariable String cep){
        return postmonCepservice.buscaEndereco(cep);
    }
}
