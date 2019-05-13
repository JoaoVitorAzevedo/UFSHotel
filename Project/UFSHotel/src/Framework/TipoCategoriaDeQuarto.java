/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Framework;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author 743554
 */
public class TipoCategoriaDeQuarto {

    String classificacao;
    int capacidade;
    List<TipoServicos> servicos = new ArrayList<TipoServicos>(); // lista de serviços que esse quarto oferece
    

    public TipoCategoriaDeQuarto(String classificacao, int capacidade) {
        this.classificacao = classificacao;
        this.capacidade = capacidade;
    }
    
    public void addServico(TipoServicos service){
        this.servicos.add(service);
    }
    
    //getters

    public int getCapacidade() {
        return capacidade;
    }

    public List<TipoServicos> getServicos() {
        return servicos;
    }
    
    public void printServicos(){
        for(TipoServicos serv : servicos){
            System.out.println(serv.getNomeDoServico());
        }
    }
  public String getClassificacao() {
        return classificacao;
    }
    
    //setters

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public void setClassificacao(String classificacao) {
        this.classificacao = classificacao;
    }
    
  
  

}
