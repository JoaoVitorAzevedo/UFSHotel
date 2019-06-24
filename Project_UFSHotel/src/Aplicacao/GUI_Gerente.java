package Aplicacao;

import Banco.SimulaBD;
import Banco.iBancoGerente;

public class GUI_Gerente {

    public static void main(String args[]) {
        iBancoGerente BGerente = SimulaBD.getInstanceBD();

        //Cadastrando uma nova Recepcionista - entrando com os dados
        our_Endereco end = new our_Endereco("13.235-089", "34", "Casa Branca", "Porto Velho", "MA");
        our_Telefone tel = new our_Telefone("+55", "14", "998987677");
        our_Recepcionista Marilda = new our_Recepcionista(23, "Recepção", "noturno", "345.543.345-55", "Marilda@gmail.com", "Marilda Garcia", end, tel, "semestre");
       
        Marilda.cadastrarRecepcionista();
        //outro jeito de salvar no BD => BGerente.addRecepcionista(Marilda);
        
        System.out.println("\n");
        
        //Listando todos os funcionários
        System.out.println("~~~listando funcionarios~~~");
        BGerente.listarFuncionarios();
        System.out.println("\n");
        
         //Buscando Funcionario pelo ID
        System.out.println("~~~Buscando Funcionario de ID 0~~~");
        System.out.println(BGerente.getNomeRecepcionista(1));
 

    }
}
