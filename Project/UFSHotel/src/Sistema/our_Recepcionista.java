/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sistema;

import Framework.Data;
import Framework.TipoEndereco;
import Framework.TipoTelefone;
import Framework.TipoHospede;
import Framework.TipoRecepcionista;

/**
 * @author João Vitor Azevedo 743554
 * @author Sabrina Miranda 743595
 * @author Vitor Sugaya 743605
 */

public class our_Recepcionista extends TipoRecepcionista {

    public our_Recepcionista(int ramal, String setor, int idFuncionario, String turno, String cpf, String nome, String email, TipoEndereco end, TipoTelefone tel) {
        super(ramal, setor, idFuncionario, turno, cpf, nome, email, end, tel);
    }
    
    public our_Recepcionista(int id, String nome) {
        super(0,null, id, null, null,  nome, null, null, null);
    }

    @Override
    public boolean cadastrarReserva(int id, TipoHospede hospede, Data dataIn, Data dataOut) {
        //our_Reserva reserv = new our_Reserva();
        if (true) {
            System.out.println("Hospede " + hospede.getNome() + " cadastrado com sucesso!");
            return true;
        } else { // algo deu errado
            System.out.println("Algo deu mto errado moçx :/");
            return false;
        }
    }

}
