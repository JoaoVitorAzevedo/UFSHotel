package Sistema;

import Banco.SimulaBD;


public class GUI_Gerente {

    public static void main(String args[]) {
        
        //cria objeto com permissão de gerente para cadastros
        iCadastro_Gerente ir = new ControladorDeCadastro();
        
        //Cadastrando uma nova Recepcionista - entrando com os dados
        ir.cadastrarRecepcao(85, "Josilene");
                
        //Retorna os nomes de todas as recepcionistas
        SimulaBD.getListaRecep().forEach((temp) -> {
            System.out.println(temp.getNome());
        });

    }
}
