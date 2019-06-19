package Framework;

import Banco.SimulaBD;
import Banco.iBancoGerente;
import Framework.TipoFuncionario;
import Framework.TipoRecepcionista;
import Sistema.our_Hospede;
import Sistema.our_Quarto;

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

    }

    @Override
    public void getHospedeByCPF() {

    }


      @Override
    public our_Quarto getQuartoDisp() {
         iBancoGerente BG = new SimulaBD();
        our_Quarto quarto = (our_Quarto) BG.getQuartoDisp();
        return quarto;
    
    }

    
    public our_Hospede getHospede(int id) {
        iBancoGerente BG = new SimulaBD();
        our_Hospede hospede = (our_Hospede) BG.getHospede(id);
        return hospede;
    }

}
