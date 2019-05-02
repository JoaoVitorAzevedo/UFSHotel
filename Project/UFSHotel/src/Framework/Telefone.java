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
public class Telefone {
    
    String ddd;
    String numero;

    public Telefone(String ddd, String numero) {
        this.ddd = ddd;
        this.numero = numero;
    }
    public String getNumero() {
        return numero;
    }
    public String getDdd() {
        return ddd;
    }
    
    public String getNumComplete(){
    return ddd + numero;
    
    }
    
    public void setNumero(String numero) {
        this.numero = numero;
    }
    public void setDdd(String ddd) {
        this.ddd = ddd;
    }
    
    
    
}
