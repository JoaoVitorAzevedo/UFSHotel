/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Framework;

import java.util.List;

public class TipoServicos {

    String nomeDoServico;
    List<TipoFuncionario> responsaveis;
    float precoDoServico;
    Data dataServico;
    String horario;

    public TipoServicos(String nomeDoServico, List<TipoFuncionario> responsaveis, float precoDoServico, Data dataServico, String horario) {
        this.nomeDoServico = nomeDoServico;
        this.responsaveis = responsaveis;
        this.precoDoServico = precoDoServico;
        this.dataServico = dataServico;
        this.horario = horario;
    }

    //getters
    public Data getDataServico() {
        return dataServico;
    }

    public float getPrecoDoServico() {
        return precoDoServico;
    }

    public String getNomeDoServico() {
        return nomeDoServico;
    }

    public List<TipoFuncionario> getResponsaveis() {
        return responsaveis;
    }

    public String getHorario() {
        return horario;
    }

    //setters
    public void addResponsavel(TipoFuncionario func) {
        this.responsaveis.add(func);
    }

    public void setDataServico(Data dataServico) {
        this.dataServico = dataServico;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public void setNomeDoServico(String nomeDoServico) {
        this.nomeDoServico = nomeDoServico;
    }

    public void setPrecoDoServico(float precoDoServico) {
        this.precoDoServico = precoDoServico;
    }

    public void setResponsaveis(List<TipoFuncionario> responsaveis) {
        this.responsaveis = responsaveis;
    }

}
