/**
 * @author João Vitor Azevedo 743554
 * @author Sabrina Miranda 743595
 * @author Vitor Sugaya 743605
 */
package Framework;

import Banco.SimulaBD;
import Banco.iBancoReserva;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public abstract class TipoReserva {

    static AtomicInteger idGen = new AtomicInteger();
    Date dataIn;
    Date dataOut;
    int idReserva;
    TipoHospede cliQueReservou;
    TipoQuarto quarto;
    TipoPagamento pag;
    Map<String, Double> Consumido;
    ArrayList<TipoServicos> servicos = new ArrayList<>(); // lista de serviços pertencentes a reserva

    public TipoReserva(Date dataIn, Date dataOut, TipoHospede cli, TipoQuarto quarto, TipoPagamento pag) {
        this.Consumido = new HashMap<>();
        this.dataIn = dataIn;
        this.dataOut = dataOut;
        this.idReserva = TipoReserva.idGen.incrementAndGet();
        this.cliQueReservou = cli;
        this.quarto = quarto;
        this.pag = pag;

    }   

    public TipoReserva(Date dataIn, int dias, TipoHospede cli, TipoQuarto quarto, TipoPagamento pag) {
        this.Consumido = new HashMap<>();
        this.dataIn = dataIn;
        this.dataOut = incrementDays(dataIn, dias);
        this.idReserva = idGen.incrementAndGet();
        this.cliQueReservou = cli;
        this.quarto = quarto;
        this.pag = pag;

    }

    public TipoReserva(Date dataIn, Date dataOut, TipoHospede cli, TipoQuarto quarto) {
        this.Consumido = new HashMap<>();
        this.dataIn = dataIn;
        this.dataOut = dataOut;
        this.idReserva = TipoReserva.idGen.incrementAndGet();
        this.cliQueReservou = cli;
        this.quarto = quarto;
        

    }
    
    private Date incrementDays(Date dataIn, int dias){
        int a_day = 86400000;
        Date new_dt = new Date(dataIn.getTime() + dias * a_day);
        return new_dt;
    }
    
    public void addServico(TipoServicos serv) {
        this.servicos.add(serv);
    }
    
    public void rmServico(TipoServicos servToRemove) {
        this.servicos.remove(servToRemove);
    }
    
    public ArrayList<TipoServicos> getServicos() {
        return servicos;
    }

    //Retorna o preco total de todos os serviços cadastrados para esse quarto //Precisa fazer esse método
    public float getPrecoServicos() {
     return 0;
    }

    
    public void printServicos() {
        servicos.forEach((serv) -> {
            System.out.println(serv.getNomeDoServico());
        });
    }

    @Override
    public String toString() {
        return "DataIn: "+dataIn+"\nDataOut: "+dataOut+"\nCliente "+cliQueReservou+"\nQuarto "+quarto; //To change body of generated methods, choose Tools | Templates.
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
    
    public String getNomeCli(){
        return cliQueReservou.getNome();
    }

    public TipoQuarto getQuarto() {
        return quarto;
    }

    public int getIdReserva() {
        return idReserva;
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
     
    public void EfetuarReserva(){
    iBancoReserva BR = new SimulaBD();
        if(BR.addReserva(this)) {
            System.out.println("Reserva cadastrada com sucesso");
        }
    }
    
    public void FazerCheckout(Date dataOut){
        setDataOut(dataOut);
    }
 
}
