/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sistema;

/**
 * @author João Vitor Azevedo 743554
 * @author Sabrina Miranda 743595
 * @author Vitor Sugaya 743605
 */
public class Controller {

    public static void cadastrarQuarto(int id, int andar, our_CategoriaDeQuarto catroom) {

        our_Quarto our = new our_Quarto(id, andar, catroom);
        if (true) {
            System.out.println("Cadastrado Quarto com dados: ");
            our.printData();

        }
        // our.save()
    }

    public static void cadastrarHospede(our_Hospede novoHospede) {
        //BancoDeHospedes.add(novoHospede);
        System.out.println("Novo Hospede cadastrado com sucesso! ID:" + novoHospede.getID() + ", Nome: " + novoHospede.getNome());

    }

    public static void cadastrarFuncionario() {
        System.out.println("cadastradoFuncionario");
    }

    public static boolean cadastrarRecepcaoAtendimento() {

        System.out.println("cadastrado funcionario do tipo Recepção");
        return true;

    }

    public static boolean cadastrarLimpeza() {
        System.out.println("cadastrada Bozena de Pato Branco");
        return true;
    }

    public static boolean cadastrarGerente() {
        System.out.println("Cadastrado o gerente");
        return true;
    }

}
