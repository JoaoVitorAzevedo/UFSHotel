
package Sistema;

import Banco.SimulaBD;
import Banco.iBancoRecepcionista;
import java.util.List;


/**
 *
 * @author 743554
 */
public class GUI_Recepcionista {

    
    public static void main(String args[]){
    iBancoRecepcionista mConsulta = SimulaBD.getInstanceBD();
    
    //Cadastrar hospede    
    our_Hospede mohammed = new our_Hospede("Mohammed Salim", "Sri Lanka");
    mohammed.cadastrarHospede();
    
    our_Hospede vitor = new our_Hospede("sugaya vitor", "Brasil");
    vitor.cadastrarHospede();
    
    //Lista todos os hospedes cadastrados fazendo uso da sobrescrita de método (há atributos a mais na classe filha)
    System.out.println("~~listando hospedes~~");
    List<our_Hospede> listaHospede = mConsulta.getListaHospede();
    our_Hospede.listarOurHospede(listaHospede);
    
    //Retorna o nome do Hospede a partir do id
    System.out.println(mConsulta.getNomeHospede(1));
   
        
    }
    
    
    
    //efetuar reserva
}
