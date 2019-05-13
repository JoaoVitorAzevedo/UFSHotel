/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Framework;

import java.util.Date;
import java.util.concurrent.atomic.AtomicInteger;

/**
 *
 * @author 743554
 */
public class TipoReserva {
    
	AtomicInteger idGen;
    Data dataIn;
    Data dataOut;
    int idReserva;
    TipoHospede cliQueReservou;
    TipoRecepcionista recepQueReservou;
    TipoQuarto quarto;
    TipoPagamento pag;

    public TipoReserva(Data dataIn, Data dataOut, TipoHospede cli, TipoRecepcionista recep, TipoQuarto quarto, TipoPagamento pag) {
        this.dataIn = dataIn;
        this.dataOut = dataOut;
        this.idReserva = idGen.incrementAndGet();
        this.cliQueReservou = cli;
        this.recepQueReservou = recep;
        this.quarto = quarto;
        this.pag = pag;
        
    }

    //getters
    public Data getDataIn() {
        return dataIn;
    }
    public TipoHospede getCliQueReservou() {
        return cliQueReservou;
    }
    public TipoQuarto getQuarto() {
        return quarto;
    }
    public int getIdReserva() {
        return idReserva;
    }
    public TipoRecepcionista getRecepQueReservou() {
        return recepQueReservou;
    }
    public Data getDataOut() {
        return dataOut;
    }
    //setters
    public void setCliQueReservou(TipoHospede cliQueReservou) {
        this.cliQueReservou = cliQueReservou;
    }
    public void setDataOut(Data dataOut) {
        this.dataOut = dataOut;
    }
    public void setQuarto(TipoQuarto quarto) {
        this.quarto = quarto;
    }
    public void setIdReserva(int idReserva) {
        this.idReserva = idReserva;
    }
    public void setDataIn(Data dataIn) {
        this.dataIn = dataIn;
    }
    public void setRecepQueReservou(TipoRecepcionista recepQueReservou) {
        this.recepQueReservou = recepQueReservou;
    }
    
    
     
    
    
        
    
}
