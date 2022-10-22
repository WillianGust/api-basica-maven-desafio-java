package com.br.willian.API.servicos;

import java.util.ArrayList;
import java.util.List;

import com.br.willian.API.models.Profissional;

public class ProfissionalServico {
  public static List<Profissional> profissionais(){
    var lista = new ArrayList<Profissional>();
    lista.add(new Profissional(1, "Willian"));
    lista.add(new Profissional(2, "Helena"));
    lista.add(new Profissional(3, "Giovani"));
    return lista;
  }
}
