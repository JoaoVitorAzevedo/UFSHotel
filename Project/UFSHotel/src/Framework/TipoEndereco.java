/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Framework;

/**
 *
 * @author 743554
 */
public class TipoEndereco {
    
    
    String cep;
    String numero;
    String logradouro;
    String complemento;
    String bairro;
    String cidade;
    String estado;

    
    
    
    public TipoEndereco(String cep, String numero, String logradouro, String complemento, String bairro, String cidade, String estado) {
        this.cep = cep;
        this.numero = numero;
        this.logradouro = logradouro;
        this.complemento = complemento;
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
    }
    
    //Getters
    public String getBairro() {
        return bairro;
    }
    public String getComplemento() {
        return complemento;
    }
    public String getLogradouro() {
        return logradouro;
    }
    public String getNumero() {
        return numero;
    }
    public String getCidade() {
        return cidade;
    }
    public String getEstado() {
        return estado;
    }
    public String getCep() {
        return cep;
    }

    //Setters
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
    public void setEstado(String estado) {
        this.estado = estado;
    }
    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }
    public void setBairro(String bairro) {
        this.bairro = bairro;
    }
    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }
    public void setCep(String cep) {
        this.cep = cep;
    }
    public void setNumero(String numero) {
        this.numero = numero;
    }
    
    
    
    
    
    

  

    
}
