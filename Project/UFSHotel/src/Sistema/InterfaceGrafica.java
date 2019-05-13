/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sistema;

import Framework.TipoTelefone;
import Framework.TipoEndereco;

/**
 *
 * @author 743554
 */
public class InterfaceGrafica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //cadastro de quartos
        Controller.cadastrarQuarto(31);
        System.out.println("cadastrado quarto com id 31");

        System.out.println("");
        System.out.println("");

        our_Data date = new our_Data(3, 4, 1299);
        date.printData();
        System.out.println("oiee");
        System.out.println("");

        our_Endereco end = new our_Endereco("17523275", "252", "logradouro", "blablabla", "Jardim Guanabara", "Marília", "Ceará");
        TipoTelefone tel = new TipoTelefone("+55", "14", "99777-7676");

        our_Hospede hosp = new our_Hospede(31, "432.883.228-81", "Joao Vitor", "fulanodetal@gmail.com", end, tel);
        //(int idHospede, String cpf, String nome, String email, our_Endereco end, Telefone tel)
        Controller.cadastrarHospede(hosp);
        System.out.println(hosp.getCpf());
        System.out.println(hosp.getCpf());
        System.out.println(hosp.getCpf());

        // TODO code application logic here
        System.out.println("amigo estou aqui");
        System.out.println("------------------------------------");
        
        
        
        our_Servicos serv = new our_Servicos("NomedoServ", new ArrayList<our_Limpeza>,);
        
    }

}
