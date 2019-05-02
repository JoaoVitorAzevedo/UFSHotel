/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Framework;

import java.util.Date;

/**
 *
 * @author 743554
 */
public class TipoReserva {
    
    TipoData dataIn;
    TipoData dataOut;
    int idReserva;
    TipoHospede cliQueReservou;
    TipoRecepcionista recepQueReservou;
    TipoQuarto quarto;

    public TipoReserva(TipoData dataIn, TipoData dataOut, int idReserva, TipoHospede cli, TipoRecepcionista recep, TipoQuarto quarto) {
        this.dataIn = dataIn;
        this.dataOut = dataOut;
        this.idReserva = idReserva; // muadar aqui, isso precisa ser gerado automaticamente de algum jeito
        this.cliQueReservou = cli;
        this.recepQueReservou = recep;
        this.quarto = quarto;
    }
    
    
        
    
}
