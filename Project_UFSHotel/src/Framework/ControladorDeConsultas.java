package Framework;

import Banco.SimulaBD;
import Banco.iBancoGerente;
import java.util.List;

public class ControladorDeConsultas implements iConsultaGerente, iConsultaRecepcionista {

    @Override
    public String getGerente(int id) {
        iBancoGerente BG = new SimulaBD();
        return (BG.getNomeGerente(id));

    }

    public void listarFuncionarios() {

        SimulaBD.listaFuncionariosBD.forEach((c) -> {
            System.out.println(c);
        });

    }

    @Override
    public void listarRecepcionistas() {

        SimulaBD.listaFuncionariosBD.forEach((c) -> {
            if (c instanceof TipoRecepcionista) {
                System.out.println(c);
            }
        });

    }

    @Override
    public void listarReservas() {
        
        SimulaBD.listaReserva.forEach((r) -> {
                System.out.println(r);       
        });
    }
    
    public void listarHospedes() {
        
        SimulaBD.listaHospede.forEach((h) -> {
          
                System.out.println(h.getID() + " " + h.getNome());
            
        });
    }

    @Override
    public TipoHospede getHospedeByCPF(String cpf) {
        SimulaBD BD = new SimulaBD();
        List<TipoHospede> listaHospede = BD.getListaHospede();
        
        for(TipoHospede hosp: listaHospede){
            String cpf_corr = hosp.getCPF();
            if(cpf.equals(cpf_corr)){
                return hosp;
            }
        }
        return null;
    }

      @Override
    public TipoQuarto getQuartoDisp() {
        iBancoGerente BG = new SimulaBD();
        TipoQuarto quarto = BG.getQuartoDisp();
        return quarto;
    
    }

    
    public TipoHospede getHospede(int id) {
        iBancoGerente BG = new SimulaBD();
        TipoHospede hospede = BG.getHospede(id);
        return hospede;
    }

}
