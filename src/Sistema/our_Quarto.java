/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sistema;

import Framework.TipoQuarto;

/**
 * @author João Vitor Azevedo 743554
 * @author Sabrina Miranda 743595
 * @author Vitor Sugaya 743605
 */
public class our_Quarto extends TipoQuarto {

    public our_Quarto(int idQuarto, int andar, our_CategoriaDeQuarto tipo) {
        super(idQuarto, andar, tipo);

    }

    void printData() {
        System.out.println("Imprimindo dados de " + this.toString());
        System.out.println("ID: " + this.getIdQuarto());
        System.out.println("Andar: " + this.getAndar());
        System.out.println("------CategoriaDoQuarto----- ");
        this.getTipo().printData();
        System.out.println("");
    }

}
