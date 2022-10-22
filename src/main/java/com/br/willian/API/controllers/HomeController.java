package com.br.willian.API.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RestController;

import com.br.willian.API.DTO.Home;
import com.br.willian.API.models.Profissional;
import com.br.willian.API.servicos.ProfissionalServico;

@RestController
public class HomeController {

    @GetMapping("/")
    public Home index(){
      return new Home();
    }

    @GetMapping("/profissionais")
    public List<Profissional> profissionais(){
      return ProfissionalServico.profissionais();
    }
}
