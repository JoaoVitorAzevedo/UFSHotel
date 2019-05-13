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

public class our_Recepcionista extends TipoRecepcionista {

    public our_Recepcionista(int ramal, String setor, int idFuncionario, String turno, String cpf, String nome, String email, TipoEndereco end, TipoTelefone tel) {
        super(ramal, setor, idFuncionario, turno, cpf, nome, email, end, tel);
    }

    @Override
    public boolean cadastrarReserva(int id, TipoHospede hospede, Data dataIn, Data dataOut) {
        //our_Reserva reserv = new our_Reserva();
        System.out.println("deu certo");
        return true;

    }

}
