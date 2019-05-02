/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sistema;

import Framework.Data;
import Framework.TipoHospede;
import Framework.TipoQuarto;
import Framework.TipoRecepcionista;
import Framework.TipoReserva;

/**
 *
 * @author MartManHunter
 */
public class our_Reserva extends TipoReserva {

    public our_Reserva() {
        super(null, null, 0, null, null, null);
    }
    
    public our_Reserva(Data dataIn, Data dataOut, int idReserva, TipoHospede cli, TipoRecepcionista recep, TipoQuarto quarto){
        super( dataIn,  dataOut, idReserva,  cli,  recep,  quarto);
        
    }
    
    

    
    

    
    
    
    
}
