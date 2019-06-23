
package Sistema;

import Banco.SimulaBD;
import Banco.iBancoRecepcionista;
import java.util.Date;
import java.util.List;


/**
 *
 * @author 743554
 */
public class GUI_Recepcionista {
    
    public static void main(String args[]){
    iBancoRecepcionista mRecepcionista = SimulaBD.getInstanceBD();
    
    //Cadastrar hospede    
    our_Hospede mohammed = new our_Hospede("Mohammed Salim", "Sri Lanka");
    mohammed.cadastrarHospede();
    
    our_Hospede vitor = new our_Hospede("sugaya vitor", "Brasil");
    vitor.cadastrarHospede();
    System.out.println("\n");
    
    //Lista todos os hospedes cadastrados fazendo uso da sobrescrita de método (há atributos a mais na classe filha)
    System.out.println("~~Listando todos os hospedes~~");
    List<our_Hospede> listaHospede = mRecepcionista.getListaHospede();
    our_Hospede.listarOurHospede(listaHospede);
    System.out.println("\n");
    
    System.out.println("~~Buscando Hospede de ID 1~~");
    //Retorna o nome do Hospede a partir do id
    System.out.println(mRecepcionista.getNomeHospede(1));
    System.out.println("\n");
    
    //Construindo uma reserva
    our_Quarto quartoDisp = (our_Quarto) mRecepcionista.getQuartoDisp();
    Date dataIn = new Date(2019, 0, 21);
    our_Pagamento pagamento = new our_Pagamento("Crédito", 3, false);
    
    our_Reserva Reserva1 = new our_Reserva(dataIn, 2, vitor, quartoDisp, pagamento);
    Reserva1.EfetuarReserva();
    System.out.println("\n");
    
    System.out.println("~~Listando todas as reservas~~");
    mRecepcionista.listarReservas();
    
    System.out.println(Reserva1.getPrecoTotal());
    
    //Realizando pagamento
           
    }
    
    
    
    //efetuar reserva
}
