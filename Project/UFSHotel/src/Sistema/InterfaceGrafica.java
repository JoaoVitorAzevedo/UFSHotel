/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sistema;

import Framework.ITipoGerenteTipoPessoa;
import Framework.ModuloTipoGerente;
/**
 * @author João Vitor Azevedo 743554
 * @author Sabrina Miranda 743595
 * @author Vitor Sugaya 743605
 */
import Framework.TipoTelefone;

public class InterfaceGrafica {

    public static void main(String[] args) {
        

        //Controller.cadastrarQuarto(31, 7, catRoom1);

        

       

        our_Recepcionista recep = new our_Recepcionista(1, "Marco Antonio");
        // Controller.cadastrarRecepcaoAtendimento(recep);

        ITipoGerenteTipoPessoa modGerente = new ModuloTipoGerente();
        modGerente.realizaCadastro(recep);

        our_Recepcionista or = (our_Recepcionista) modGerente.retornaCadastro(0);
        System.out.println(or.getNome());
        
        our_CategoriaDeQuarto j = new our_CategoriaDeQuarto("lixo",3,4.0f);
        

    }

}
