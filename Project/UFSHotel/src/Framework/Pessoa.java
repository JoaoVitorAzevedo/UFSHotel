/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Framework;

import java.util.List;



/**
 *
 * @author 743554
 */
public abstract class Pessoa {
    
    String cpf;
    String nome;
    String email;
    
    Endereco end;
    List<Telefone> listaTel;

    
    public Pessoa(String cpf, String nome, String email, Endereco end, Telefone tel) {
        this.cpf = cpf;
        this.nome = nome;
        this.email = email;
        //this.end = end;
        this.listaTel.add(tel);
        
    }
    
    
    
    public String getEmail() {
        return email;
    }

    public String getCpf() {
        return cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
 

    
    
    
    
}
