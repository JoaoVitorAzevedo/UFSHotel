/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Framework;

/**
 *
 * @author MartManHunter
 */
public class StatusQuarto {
    
    boolean limpeza;
    boolean disponibilidade;
    
    
    public boolean isLimpavel(){
        return this.limpeza;
    }
    
    public boolean isVago(){
        return this.disponibilidade;
    }

    public StatusQuarto(boolean limpeza, boolean disponibilidade) {
        this.limpeza = limpeza;
        this.disponibilidade = disponibilidade;
    }

    public void setDisponibilidade(boolean disponibilidade) {
        this.disponibilidade = disponibilidade;
    }
    public void setLimpeza(boolean limpeza) {
        this.limpeza = limpeza;
    }
    
    
    
    
    
    
}
