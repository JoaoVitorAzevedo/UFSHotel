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
class StatusQuarto {

    boolean limpeza = true;
    boolean disponibilidade = true;

    public StatusQuarto(boolean limpeza, boolean disponibilidade) {
        this.limpeza = limpeza;
        this.disponibilidade = disponibilidade;
    }

    public boolean isLimpavel() {
        return this.limpeza;
    }

    public boolean isVago() {
        return this.disponibilidade;
    }

    public void setDisponibilidade(boolean disponibilidade) {
        this.disponibilidade = disponibilidade;
    }

    public void setLimpeza(boolean limpeza) {
        this.limpeza = limpeza;
    }

}