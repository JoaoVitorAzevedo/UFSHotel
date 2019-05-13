/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sistema;

import Framework.Data;
import Framework.TipoHospede;
import Framework.TipoPagamento;
import Framework.TipoQuarto;
import Framework.TipoRecepcionista;
import Framework.TipoReserva;

/**
 *
 * @author MartManHunter
 */
public class our_Reserva extends TipoReserva {

    public our_Reserva(Data dataIn, Data dataOut, int idReserva, TipoHospede cli, TipoRecepcionista recep, TipoQuarto quarto, TipoPagamento pag) {

        super(dataIn, dataOut, idReserva, cli, recep, quarto, pag);

    }

}
