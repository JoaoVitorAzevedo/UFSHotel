/**
 * @author João Vitor Azevedo 743554
 * @author Sabrina Miranda 743595
 * @author Vitor Sugaya 743605
 */
package Framework;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class TipoReserva {

    AtomicInteger idGen;
    Date dataIn;
    Date dataOut;
    int idReserva;
    TipoHospede cliQueReservou;
    TipoRecepcionista recepQueReservou;
    TipoQuarto quarto;
    TipoPagamento pag;
    Map<String, Double> Consumido;

    public TipoReserva(Date dataIn, Date dataOut, TipoHospede cli, TipoRecepcionista recep, TipoQuarto quarto, TipoPagamento pag) {
        this.Consumido = new HashMap<>();
        this.dataIn = dataIn;
        this.dataOut = dataOut;
        this.idReserva = this.idGen.incrementAndGet();
        this.cliQueReservou = cli;
        this.recepQueReservou = recep;
        this.quarto = quarto;
        this.pag = pag;

    }
    
public TipoReserva(Date dataIn, Date dataOut, TipoHospede cli, TipoRecepcionista recep, TipoQuarto quarto) {
        this.Consumido = new HashMap<>();
        this.dataIn = dataIn;
        this.dataOut = dataOut;
       // this.idReserva = this.idGen.incrementAndGet();
        this.cliQueReservou = cli;
        this.recepQueReservou = recep;
        this.quarto = quarto;
        

    }

    @Override
    public String toString() {
        return "DataIn: "+dataIn+"\nDataOut: "+dataOut+"\nCliente "+cliQueReservou+"\nRecepcionista "+recepQueReservou+"\nQuarto "+quarto; //To change body of generated methods, choose Tools | Templates.
    }


    //getters
    public Map getConsumido() {
        return Consumido;
    }

    public TipoPagamento getPag() {
        return pag;
    }

    public Date getDataIn() {
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

    public Date getDataOut() {
        return dataOut;
    }

    //setters
    public void addConsumido(Double valor, String produto) {
        Consumido.put(produto, valor);
    }

    public void setCliQueReservou(TipoHospede cliQueReservou) {
        this.cliQueReservou = cliQueReservou;
    }

    public void setDataOut(Date dataOut) {
        this.dataOut = dataOut;
    }

    public void setQuarto(TipoQuarto quarto) {
        this.quarto = quarto;
    }

    public void setIdReserva(int idReserva) {
        this.idReserva = idReserva;
    }

    public void setDataIn(Date dataIn) {
        this.dataIn = dataIn;
    }

    public void setRecepQueReservou(TipoRecepcionista recepQueReservou) {
        this.recepQueReservou = recepQueReservou;
    }

}
