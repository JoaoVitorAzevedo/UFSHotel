/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sistema;

import Framework.Data;
import Framework.TipoEndereco;
import Framework.Telefone;
import Framework.TipoHospede;
import Framework.TipoRecepcionista;

/**
 *
 * @author MartManHunter
 */
public class our_Recepcionista extends TipoRecepcionista {

    public our_Recepcionista(int ramal, String setor, int idFuncionario, String turno, String cpf, String nome, String email, TipoEndereco end, Telefone tel) {
        super(ramal, setor, idFuncionario, turno, cpf, nome, email, end, tel);
    }
    
            
            
            
   @Override     
     public  void EfetuarReserva(int id, TipoHospede hospede, Data dataIn, Data dataOut){
         our_Reserva reserv = new our_Reserva();
         
     }

 

        
            
            
        
    }




