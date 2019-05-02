/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sistema;

import Framework.Endereco;
import Framework.Telefone;
import Framework.TipoRecepcionista;

/**
 *
 * @author MartManHunter
 */
public class our_Recepcionista extends TipoRecepcionista {

    public our_Recepcionista(int ramal, String setor, int idFuncionario, String turno, String cpf, String nome, String email, Endereco end, Telefone tel) {
        super(ramal, setor, idFuncionario, turno, cpf, nome, email, end, tel);
    }
    
            
            
            
            
public void CriarReserva(our_Hospede hospede, our_Data dataIn, our_Data dataOut){
            our_Reserva reserv = new our_Reserva();
        //    reserv.quarto.StatusQuarto.setDisponibilidade(false);
        //    reserv.quarto.StatusQuarto.setLimpeza(false);
        // arrumar aqui
        
            
            
            
            
        
    }
    
}
