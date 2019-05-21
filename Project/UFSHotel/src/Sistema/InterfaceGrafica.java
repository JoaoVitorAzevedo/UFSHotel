/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sistema;

import Framework.ITipoGerenteTipoPessoa;
import Framework.ModuloTipoGerente;
/**
 * @author João Vitor Azevedo 743554
 * @author Sabrina Miranda 743595
 * @author Vitor Sugaya 743605
 */
import Framework.TipoTelefone;

public class InterfaceGrafica {

    public static void main(String[] args) {
        //cadastro de quartos
        our_CategoriaDeQuarto catRoom1 = new our_CategoriaDeQuarto("Suite", 3, 120.0f);    //Nome da Categoria, capacidade, preco)

        Controller.cadastrarQuarto(31, 7, catRoom1);

        //System.out.println("cadastrado quarto com id 31");
        our_Data date = new our_Data(3, 4, 1299);
        //date.printData();

        our_Endereco end = new our_Endereco("17523275", "252", "logradouro", "blablabla", "Jardim Guanabara", "Marília", "Ceará");
        TipoTelefone tel = new TipoTelefone("+55", "14", "99777-7676");

        //our_Hospede hosp = new our_Hospede(31, "432.883.228-81", "Joao Vitor", "fulanodetal@gmail.com", end, tel);
        //(int idHospede, String cpf, String nome, String email, our_Endereco end, Telefone tel)
        //Controller.cadastrarHospede(hosp);
        //System.out.println(hosp.getCpf());
        //System.out.println(hosp.getCpf());
        //System.out.println(hosp.getCpf());
        //System.out.println("amigo estou aqui");
        //System.out.println("------------------------------------");
        //servicos para a lista de um quarto
        our_Servicos serv = new our_Servicos("NomedoServ1", null, 22.0f, new our_Data(6, 8, 1986), "horario tal");
        our_Servicos serv2 = new our_Servicos("NomedoServ2", null, 22.0f, new our_Data(6, 8, 1986), "horario y");
        our_Servicos serv3 = new our_Servicos("NomedoServ3", null, 22.0f, new our_Data(6, 8, 1986), "horario x");

        our_CategoriaDeQuarto catRoom = new our_CategoriaDeQuarto("Casal", 2, 90.0f);    //Nome da Categoria, capacidade, preco)

        catRoom.addServico(serv2);
        catRoom.addServico(serv);
        catRoom.addServico(serv3);
        //System.out.println("printando services");
        //catRoom.printServicos();
        //catRoom.printData();

        //catRoom.printData();
        //criando quarto com categoria criada acima
        our_Quarto room01 = new our_Quarto(123, 7, catRoom);
        room01.printData();

        //our_Gerente gerente = new our_Gerente(0, "Roberto");
        our_Recepcionista recep = new our_Recepcionista(1, "Marco Antonio");
        // Controller.cadastrarRecepcaoAtendimento(recep);

        ITipoGerenteTipoPessoa modGerente = new ModuloTipoGerente();
        modGerente.realizaCadastro(recep);

        our_Recepcionista or = (our_Recepcionista) modGerente.retornaCadastro(0);
        System.out.println(or.getNome());

    }

}
