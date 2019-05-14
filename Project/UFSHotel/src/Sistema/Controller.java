/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sistema;

public class Controller {

    public static void cadastrarQuarto(int id) {

        our_Quarto our = new our_Quarto(id,0,null);
        System.out.println("o andar é: " + our.getIdQuarto());

        // our.save()
    }

    public static void cadastrarHospede(our_Hospede novoHospede) {
        //BancoDeHospedes.add(novoHospede);
        System.out.println("Novo Hospede cadastrado com sucesso! ID:" + novoHospede.getIdHospede() + ", Nome: " + novoHospede.getNome());

    }

    public static void cadastrarFuncionario() {

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
        System.out.println("Cadastrado o genrente");
        return true;
    }

}
