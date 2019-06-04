/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sistema;

import Banco.SimulaBD;
import Sistema.our_CategoriaDeQuarto;
import Sistema.our_Hospede;
import Sistema.our_Quarto;
import Sistema.our_Recepcionista;
import Sistema.our_Gerente;

/**
 * @author João Vitor Azevedo 743554
 * @author Sabrina Miranda 743595
 * @author Vitor Sugaya 743605
 */
public class ControladorDeCadastro implements iCadastro_Recepcionista {

    public ControladorDeCadastro() {
        System.out.println("fiz nada");
    }

    public void cadastrarQuarto(int id, int andar, our_CategoriaDeQuarto catroom) {

        our_Quarto our = new our_Quarto(id, andar, catroom);
        if (true) {
            System.out.println("Cadastrado Quarto com dados: ");
            //our.printData();

        }
        // our.save()
    }

    public void cadastrarHospede(our_Hospede novoHospede) {
        //BancoDeHospedes.add(novoHospede);
        System.out.println("Novo Hospede cadastrado com sucesso! ID:" + novoHospede.getID() + ", Nome: " + novoHospede.getNome());

    }

    public void cadastrarFuncionario() {
        System.out.println("cadastradoFuncionario");
    }

    public static boolean cadastrarRecepcaoAtendimento(our_Recepcionista recep) {

        System.out.println("cadastrarRecepcaoAtendimento do CONTROLLER executado"); //To change body of generated methods, choose Tools | Templates.
        SimulaBD.addRecepcionista((our_Recepcionista) recep);
        return true;

    }

    public boolean cadastrarLimpeza() {
        System.out.println("cadastrada Bozena de Pato Branco");
        return true;
    }

    public boolean cadastrarGerente() {
        System.out.println("Cadastrado o gerente");
        return true;
    }

    @Override
    public void CadastrarHospede(our_Hospede o) {
        System.out.println("cadastrado o");
    }

    @Override
    public void EfetuarReserva() {
        System.out.println("reservei"); //To change body of generated methods, choose Tools | Templates.
    }

}
