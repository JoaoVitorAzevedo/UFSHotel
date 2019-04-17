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
public abstract class Quarto {
    
    int idQuarto;
    int andar;
    TipoQuarto tipo;
    

    public Quarto(int idQuarto, int andar, TipoQuarto tipo) {
        this.idQuarto = idQuarto;
        this.andar = andar;
        this.tipo = tipo;
    }

    public int getAndar() {
        return andar;
    }

    public int getIdQuarto() {
        return idQuarto;
    }

    public TipoQuarto getTipo() {
        return tipo;
    }

    public void setTipo(TipoQuarto tipo) {
        this.tipo = tipo;
    }

    public void setIdQuarto(int idQuarto) {
        this.idQuarto = idQuarto;
    }

    public void setAndar(int andar) {
        this.andar = andar;
    }
    
    
    
    
    
}
