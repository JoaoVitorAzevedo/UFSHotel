/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sistema;

import Framework.Endereco;
import Framework.Telefone;
import Framework.TipoHospede;

/**
 *
 * @author MartManHunter
 */
public class our_Hospede  extends TipoHospede{
    
    public our_Hospede(int idHospede, String cpf, String nome, String email, Endereco end, Telefone tel) {
        super(idHospede, cpf, nome, email, end, tel);
        // nossas coisas especificas aqui
    }
    
    
}
