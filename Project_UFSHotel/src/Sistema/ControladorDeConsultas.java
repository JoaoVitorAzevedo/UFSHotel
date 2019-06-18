package Sistema;

import Banco.SimulaBD;
import Banco.iBancoGerente;
import Framework.TipoFuncionario;
import Framework.TipoRecepcionista;

public class ControladorDeConsultas implements iConsulta_Gerente, iConsulta_Recepcionista {

    @Override
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

    @Override
    public void getHospedeID(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
