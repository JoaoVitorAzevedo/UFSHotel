package Sistema;

import Banco.SimulaBD;
import Banco.iBancoGerente;
import Framework.TipoFuncionario;
import Framework.TipoRecepcionista;

public class ControladorDeConsultas implements iConsulta_Gerente, iConsulta_Recepcionista {

    public String getGerente(int id) {
        iBancoGerente BG = new SimulaBD();
        return (BG.getNomeGerente(id));

    }

    @Override
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

}
