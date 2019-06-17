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
        
        
        Date dt = new Date();
        our_Hospede oh = (our_Hospede) SimulaBD.getBDCarregado().getHospede(31);
        our_Recepcionista or = (our_Recepcionista) SimulaBD.getBDCarregado().getRecepcionista(88);
        our_Quarto oq = SimulaBD.getBDCarregado().getQuarto();
        our_Pagamento op = SimulaBD.getBDCarregado().getPagamento();
        
        if(oh == null)
            System.out.println("hospede esta nulo");
        if(or == null)
            System.out.println("recepcionista esta nulo");
        if(oq == null)
            System.out.println("quarto esta nulo");
        if(op == null)
            System.out.println("pagamento esta nulo");
        
        our_Reserva o_r = new our_Reserva(dt, dt, oh, or, oq, op );
        //our_Reserva o_r = new our_Reserva(dt, 3, oh, or, oq, op );
        
        //SimulaBD.getBDCarregado().getiGerenteReservador().cadastrarReserva(o_r);
        
    }
}
