package Sistema;

import Banco.SimulaBD;
import Banco.iBancoGerente;
import java.util.Date;

public class GUI_Gerente {

    public static void main(String args[]) {
        iBancoGerente BGerente = SimulaBD.getInstanceBD();

        //Cadastrando uma nova Recepcionista - entrando com os dados
        
        
        //Listando todos os funcionários
        System.out.println("listando funcionarios");
        BGerente.listarFuncionarios();

        //busca da reserva de acordo com a data de entrada
        //our_Reserva new_o_r = (our_Reserva) SimulaBD.getBDCarregado().getReserva(dt);
        //System.out.println("Reserva em nome de: " + new_o_r.getCliQueReservou());
        
        //Joao
        
        Date dataIn = new Date(); 
        Date dataOut = new Date();
  /*
        System.out.println("hospede:" + bd.getHospede1());
        our_Reserva rs1 =  new our_Reserva(bd.getData1(), bd.getData2(), bd.getHospede1(), bd.getRecep1(), bd.getRoom1());
        System.out.println("Reserva dados\n" +        rs1);*/
 

    }
}
