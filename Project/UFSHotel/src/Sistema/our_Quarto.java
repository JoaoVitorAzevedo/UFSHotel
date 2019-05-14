/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sistema;

import Framework.TipoQuarto;

/**
 *
 * @author MartManHunter
 */
public class our_Quarto extends TipoQuarto {

    public our_Quarto(int idQuarto, int andar, our_CategoriaDeQuarto tipo) {
        super(idQuarto, andar, tipo);

    }

    void printData() {
        System.out.println("ID: " + this.getIdQuarto());
        System.out.println("Andar: " + this.getIdQuarto());
        System.out.println("------CategoriaDoQuarto----- ");
        this.getTipo().printData();
    }

}
