package Sistema;

import Banco.SimulaBD;
import java.util.Date;

public class GUI_Gerente {

    public static void main(String args[]) {

        ////Precisa mesmo ter todos essas interfaces sendo que sempre quem vai executar é o gerente???
        iCadastroGerente mCadastro = SimulaBD.getBDCarregado().getiGerenteCadastrador();
        iConsultaGerente mConsulta = SimulaBD.getBDCarregado().getiGerenteConsultador();
        iReservaGerente mReserva = SimulaBD.getBDCarregado().getiGerenteReservador();

        //Cadastrando uma nova Recepcionista - entrando com os dados
        // bd.getiGerenteCadastrador().cadastrarRecepcao(85, "Josilene");
        //  System.out.println(bd.getBDCarregado().getiGerenteConsultador().getGerente(0));
        System.out.println("listando funcionarios");
        mConsulta.listarFuncionarios();
        
        
        //Não acho certo usar o SimulaBD. pq dá abertura pra fazer qualquer coisa
        //O gerente cadastra a reserva???
        Date dt = new Date();
        our_Hospede oh = (our_Hospede) SimulaBD.getBDCarregado().getHospede(31);
        our_Recepcionista or = (our_Recepcionista) SimulaBD.getBDCarregado().getRecepcionista(88);
        our_Quarto oq = SimulaBD.getBDCarregado().getQuarto();
        our_Pagamento op = SimulaBD.getBDCarregado().getPagamento();
        
        
        our_Reserva o_r = new our_Reserva(dt, dt, oh, or, oq, op );
        //our_Reserva o_r = new our_Reserva(dt, 3, oh, or, oq, op );
        
        mReserva.cadastrarReserva(o_r);
        
        //busca da reserva de acordo com a data de entrada
        our_Reserva new_o_r = (our_Reserva) SimulaBD.getBDCarregado().getReserva(dt);
        System.out.println("Reserva em nome de: " + new_o_r.getCliQueReservou());
        
        //Joao
        
        Date dataIn = new Date(); 
        Date dataOut = new Date();
  /*
        System.out.println("hospede:" + bd.getHospede1());
        our_Reserva rs1 =  new our_Reserva(bd.getData1(), bd.getData2(), bd.getHospede1(), bd.getRecep1(), bd.getRoom1());
        System.out.println("Reserva dados\n" +        rs1);*/
           
    }
}
