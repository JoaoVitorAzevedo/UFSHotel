package Sistema;

import Banco.SimulaBD;
import Banco.iBancoGerente;

public class ControladorDeConsultas implements iConsulta_Gerente{
    
    public String getGerente (int id){
        iBancoGerente BG = new SimulaBD();
        return(BG.getNomeGerente(id));
        
    }

}
