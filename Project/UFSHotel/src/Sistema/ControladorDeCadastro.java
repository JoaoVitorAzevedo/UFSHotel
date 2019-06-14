/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sistema;

import Banco.SimulaBD;
import Banco.iBancoGerente;
import Framework.TipoRecepcionista;

/**
 * @author João Vitor Azevedo 743554
 * @author Sabrina Miranda 743595
 * @author Vitor Sugaya 743605
 */
public class ControladorDeCadastro implements iCadastro_Recepcionista, iCadastro_Gerente {

    public ControladorDeCadastro() {
        System.out.println("fiz nada");
    }

    public void cadastrarQuarto(int id, int andar, our_CategoriaDeQuarto catroom) {
        iBancoGerente BG = new SimulaBD();
        our_Quarto newQuarto = new our_Quarto(id, andar, catroom);
        if(BG.addQuarto(newQuarto))
            System.out.println("Cadastrado Quarto com dados: ");
        
    }

    public static void cadastrarHospede(our_Hospede novoHospede) {
        //BancoDeHospedes.add(novoHospede);
        System.out.println("Novo Hospede cadastrado com sucesso! ID:" + novoHospede.getID() + ", Nome: " + novoHospede.getNome());

    }

    public void cadastrarFuncionario() {
        System.out.println("cadastradoFuncionario");
    }

    public static void cadastrarRecepcao(int id, String nome) {
        iBancoGerente BG = new SimulaBD();
        our_Recepcionista newRecep = new our_Recepcionista(id, nome);
        if(BG.addRecepcionista(newRecep))
            System.out.println("Recepcionista cadastrado com sucesso!");

    }

    public boolean cadastrarLimpeza() {
        System.out.println("cadastrada Bozena de Pato Branco");
        return true;
    }

    @Override
    public void cadastrarGerente() {
        System.out.println("Cadastrado o gerente");

    }

    @Override
    public void CadastrarHospede(our_Hospede o) {
        System.out.println("cadastrado o");
    }

    @Override
    public void EfetuarReserva() {
        System.out.println("reservei"); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void cadastrarFuncLimpeza() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void cadastrarQuarto() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void cadastrarRecepcao(TipoRecepcionista recep) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
