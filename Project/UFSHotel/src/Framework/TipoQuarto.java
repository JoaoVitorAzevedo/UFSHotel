/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Framework;

/**
 * @author João Vitor Azevedo 743554
 * @author Sabrina Miranda 743595
 * @author Vitor Sugaya 743605
 */
public abstract class TipoQuarto {

    int idQuarto;
    int andar;
    TipoCategoriaDeQuarto tipo;
    StatusQuarto status = new StatusQuarto(true, true);

//Construtores
    public TipoQuarto(int idQuarto, int andar, TipoCategoriaDeQuarto tipo) {
        this.idQuarto = idQuarto;
        this.andar = andar;
        this.tipo = tipo;
        this.status.setLimpeza(true);
        this.status.setDisponibilidade(true);

    }

    public TipoQuarto(int idQuarto) {
        this.idQuarto = idQuarto;

    }

    //getters
    public int getAndar() {
        return andar;
    }

    public int getIdQuarto() {
        return idQuarto;
    }

    public boolean getStatusLimpeza() {
        return status.limpeza;
    }

    public boolean getStatusDisponibilidade() {
        return status.disponibilidade;
    }

    public TipoCategoriaDeQuarto getTipo() {
        return tipo;
    }

    //setters
    public void setTipo(TipoCategoriaDeQuarto tipo) {
        this.tipo = tipo;
    }

    public void setIdQuarto(int idQuarto) {
        this.idQuarto = idQuarto;
    }

    public void setAndar(int andar) {
        this.andar = andar;
    }

    public void setStatuslimpeza(boolean bol) {
        this.status.limpeza = bol;
    }

    public void setStatusDisponibilidade(boolean bol) {
        this.status.disponibilidade = bol;
    }

}
