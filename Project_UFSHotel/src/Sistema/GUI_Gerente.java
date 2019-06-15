package Sistema;

import Banco.SimulaBD;

public class GUI_Gerente {

    public static void main(String args[]) {

        SimulaBD bd = SimulaBD.getBDCarregado();

        //Cadastrando uma nova Recepcionista - entrando com os dados
        // bd.getiGerenteCadastrador().cadastrarRecepcao(85, "Josilene");
        //  System.out.println(bd.getBDCarregado().getiGerenteConsultador().getGerente(0));
        System.out.println("listando funcionarios");

        bd.getBDCarregado().getiGerenteConsultador().listarFuncionarios();

    }
}
