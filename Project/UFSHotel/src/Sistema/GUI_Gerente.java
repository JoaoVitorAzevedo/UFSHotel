package Sistema;

import Banco.SimulaBD;


public class GUI_Gerente {

    public static void main(String args[]) {
        //Controller.cadastrarQuarto(31, 7, catRoom1);
        // SimulaBD banco = new SimulaBD();
        our_Recepcionista fulana = new our_Recepcionista(85, "Josilene");
        SimulaBD banco = new SimulaBD();

        //iCadastro_Gerente gerente1 = SimulaBD.getGerente();
        //gerente1.cadastrarRecepcaoAtendimento(fulana);
        //iCadastro_Gerente interf = new ControladorDeCadastro();
        //ControladorDeCadastro.cadastrarRecepcaoAtendimento(fulana);
        iCadastro_Gerente ir = new ControladorDeCadastro();
        //ir.
        iCadastro_Recepcionista iRecep = new ControladorDeCadastro();
        
        //ControladorDeCadastro.
        

        SimulaBD.getListaRecep().forEach((temp) -> {
            System.out.println(temp.getNome());
        });

    }
}
