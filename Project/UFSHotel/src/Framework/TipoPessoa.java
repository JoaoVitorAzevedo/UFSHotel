/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Framework;

import java.util.ArrayList;
import java.util.List;

/**
 * @author João Vitor Azevedo 743554
 * @author Sabrina Miranda 743595
 * @author Vitor Sugaya 743605
 */
public abstract class TipoPessoa {

    protected String cpf;
    String nome;
    String email;
    List<TipoEndereco> enderecos = new ArrayList<TipoEndereco>();
    List<TipoTelefone> listaTel = new ArrayList<TipoTelefone>();

    public TipoPessoa(String cpf, String nome, String email, TipoEndereco end, TipoTelefone tel) {
        this.cpf = cpf;
        this.nome = nome;
        this.email = email;
        //this.end = end;
        this.enderecos.add(end);
        this.listaTel.add(tel);

    }

    public void addTelefone(TipoTelefone tel) {
        this.listaTel.add(tel);
    }

    public void addEndereco(TipoEndereco end) {
        this.enderecos.add(end);
    }

    //getters
    public String getEmail() {
        return email;
    }

    public String getCpf() {
        return cpf;
    }

    public String getNome() {
        return nome;
    }

    //setters
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public abstract int getID();
    // padrao pra erro em herança

}
