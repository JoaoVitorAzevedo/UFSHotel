/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sistema;

import Banco.SimulaBD;
import Banco.iBancoGerente;
import Banco.iBancoRecepcionista;
import Framework.TipoFuncionario;
import java.util.List;

/**
 * @author João Vitor Azevedo 743554
 * @author Sabrina Miranda 743595
 * @author Vitor Sugaya 743605
 */
public class ControladorDeCadastro implements iCadastro_Recepcionista, iCadastro_Gerente {

    //Construtor
    public ControladorDeCadastro() {
    }

    //Métodos de cadastro do Gerente
    @Override
    public void cadastrarQuarto(int id, int andar, our_CategoriaDeQuarto catroom) {
        iBancoGerente BG = new SimulaBD();
        our_Quarto newQuarto = new our_Quarto(id, andar, catroom);

        if (BG.addQuarto(newQuarto)) {
            System.out.println("Cadastrado Quarto com dados: ");
        }

    }

    @Override
    public void cadastrarRecepcao(int id, String nome) {
        iBancoGerente BG = new SimulaBD();
        our_Recepcionista newRecep = new our_Recepcionista(id, nome);

        if (BG.addRecepcionista(newRecep)) {
            System.out.println("Recepcionista cadastrado com sucesso!");
        }

    }

    @Override
    public void cadastrarGerente(int idFuncionario, String nome) {
        iBancoGerente BG = new SimulaBD();
        our_Gerente newGerente = new our_Gerente(idFuncionario, nome);

        if (BG.addGerente(newGerente)) {
            System.out.println("Cadastrado o gerente");
        }

    }

    //Métodos de cadastro da Recepcionista
    @Override
    public void CadastrarHospede(our_Hospede o) {
        System.out.println("cadastrado o");
    }

    @Override
    public void EfetuarReserva() {
        System.out.println("reservei"); //To change body of generated methods, choose Tools | Templates.
    }

    public void cadastrarServico(String nomeDoServico, List<TipoFuncionario> responsaveis, float precoDoServico) {
        iBancoRecepcionista BR = new SimulaBD();
        our_Servicos newServico = new our_Servicos(nomeDoServico, responsaveis, precoDoServico);

        if (BR.addServico(newServico)) {
            System.out.println("Serviço cadastrado");
        }
    }

    public void AddServicoQuarto(our_Quarto quarto, Float preco) {

    }

    @Override
    public void FazerCheckout() {
        System.out.println("recepcionista precisa limpar a lista de consumação do quarto aqui, receber o pagamento etc");
    }

}
