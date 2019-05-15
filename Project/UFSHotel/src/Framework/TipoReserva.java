/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Framework;

/**
 * @author João Vitor Azevedo 743554
 * @author Sabrina Miranda 743595
 * @author Vitor Sugaya 743605
 */
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class TipoReserva {

    Data dataIn;
    Data dataOut;
    int idReserva;
    TipoHospede cliQueReservou;
    TipoRecepcionista recepQueReservou;
    TipoQuarto quarto;
    TipoPagamento pag;
    Map<String, Double> Consumido;

    public TipoReserva(Data dataIn, Data dataOut, int idReserva, TipoHospede cli, TipoRecepcionista recep, TipoQuarto quarto, TipoPagamento pag) {
        this.Consumido = new HashMap<>();
        this.dataIn = dataIn;
        this.dataOut = dataOut;
        this.idReserva = idReserva; // muadar aqui, isso precisa ser gerado automaticamente de algum jeito
        this.cliQueReservou = cli;
        this.recepQueReservou = recep;
        this.quarto = quarto;
        this.pag = pag;

    }

    //getters
    public Map getConsumido() {
        return Consumido;
    }
    
    public TipoPagamento getPag(){
        return pag;
    }

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
    public void addConsumido(Double valor, String produto) {
        Consumido.put(produto, valor);
    }

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
