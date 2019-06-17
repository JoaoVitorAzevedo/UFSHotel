package Sistema;

import Banco.SimulaBD;
import java.util.Date;

public class GUI_Gerente {

    public static void main(String args[]) {

        SimulaBD bd = SimulaBD.getBDCarregado();

        //Cadastrando uma nova Recepcionista - entrando com os dados
        // bd.getiGerenteCadastrador().cadastrarRecepcao(85, "Josilene");
        //  System.out.println(bd.getBDCarregado().getiGerenteConsultador().getGerente(0));
        System.out.println("listando funcionarios");

        bd.getBDCarregado().getiGerenteConsultador().listarFuncionarios();
        Date dataIn = new Date(); Date dataOut = new Date();
  
        System.out.println("hospede:" + bd.getHospede1());
        our_Reserva rs1 =  new our_Reserva(bd.getData1(), bd.getData2(), bd.getHospede1(), bd.getRecep1(), bd.getRoom1());
        System.out.println("Reserva dados\n" +        rs1);
    }
}
