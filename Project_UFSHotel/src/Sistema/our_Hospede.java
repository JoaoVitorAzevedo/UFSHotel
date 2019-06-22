/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sistema;

/**
 * @author João Vitor Azevedo 743554
 * @author Sabrina Miranda 743595
 * @author Vitor Sugaya 743605
 */
import Framework.TipoEndereco;
import Framework.TipoTelefone;
import Framework.TipoHospede;
import java.util.List;

public class our_Hospede extends TipoHospede {
    String pais_de_origem;
    
    public our_Hospede(String cpf, String nome, String email, TipoEndereco end, TipoTelefone tel) {
        super(cpf, nome, email, end, tel);
    }
    
    public our_Hospede(String nome, String pais_de_origem){
        super(nome);
        this.pais_de_origem = pais_de_origem;
    }
    
    public static void listarOurHospede(List<our_Hospede> listaHospede){
        listaHospede.forEach((h) -> {
            if (h instanceof our_Hospede) {
                System.out.println(h.getNome() + " " + h.getID() + " " + ((our_Hospede) h).pais_de_origem );
            }
        });

    
    }
}
