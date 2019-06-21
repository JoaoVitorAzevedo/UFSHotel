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
public abstract class TipoStatusQuarto {

    boolean limpeza = true;
    boolean disponibilidade = true;
    List<TipoServicos> consumidos;

    public TipoStatusQuarto(boolean limp, boolean disp) {
        this.limpeza = limp;
        this.disponibilidade = disp;
        consumidos = new ArrayList<>();

    }

    public void marcarConsumo(TipoServicos serv) {
        consumidos.add(serv);
    }

    public Float getValorConsumoTotal() {
        float Total = 0;
        for (TipoServicos i : consumidos) {
            Total += i.getPrecoDoServico();
        }
        return Total;
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

    @Override
    public String toString() {
        return "--Status do Quarto--\n "
                + "Limpeza: " + this.limpeza
                + "\nDisponível: " + this.disponibilidade;
    }

}
