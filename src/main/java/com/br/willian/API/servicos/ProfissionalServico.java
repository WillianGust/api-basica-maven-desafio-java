package com.br.willian.API.servicos;

import java.util.ArrayList;
import java.util.List;

import com.br.willian.API.models.Profissional;

public class ProfissionalServico {

  private ProfissionalServico(){ }
  private List<Profissional> profissionais;
  private static ProfissionalServico profissionalServico;
  
  public static ProfissionalServico getInstancia(){
    if(profissionalServico == null)
      profissionalServico = new ProfissionalServico();
    return profissionalServico;
  }

  public List<Profissional> getProfissionais(){
    if(this.profissionais == null)
      this.profissionais = new ArrayList<Profissional>();
    return this.profissionais;
  }

  public void adicionar(Profissional profissional){
    this.profissionais.add(profissional);
  }
}
