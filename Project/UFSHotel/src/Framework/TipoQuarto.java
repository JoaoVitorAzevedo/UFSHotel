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
public abstract class TipoQuarto {
    
    int idQuarto;
    int andar;
    TipoCategoriaDeQuarto tipo;
    StatusQuarto status;
    

    public TipoQuarto(int idQuarto, int andar, TipoCategoriaDeQuarto tipo) {
        this.idQuarto = idQuarto;
        this.andar = andar;
        this.tipo = tipo;
        this.status.limpeza = true;
        this.status.disponibilidade = true;
    }

    public TipoQuarto(int idQuarto) {
        this.idQuarto = idQuarto;
       
    }

    public int getAndar() {
        return andar;
    }

    public int getIdQuarto() {
        return idQuarto;
    }

    public TipoCategoriaDeQuarto getTipo() {
        return tipo;
    }

    public void setTipo(TipoCategoriaDeQuarto tipo) {
        this.tipo = tipo;
    }

    public void setIdQuarto(int idQuarto) {
        this.idQuarto = idQuarto;
    }

    public void setAndar(int andar) {
        this.andar = andar;
    }
    
    
    
    
    
}
