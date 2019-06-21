/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Framework;

import Banco.SimulaBD;
import Banco.iBancoGerente;
import Sistema.our_Gerente;


/**
 * @author João Vitor Azevedo 743554
 * @author Sabrina Miranda 743595
 * @author Vitor Sugaya 743605
 */
public abstract class TipoGerente extends TipoFuncionario {

    public TipoGerente() {
        super(null, null, null, null, null, null, null);
        System.out.println("Criei Gerente Nulo");
    }

    protected TipoGerente(String setor, String turno, String cpf, String nome, String email, TipoEndereco end, TipoTelefone tel) {
        super(setor, turno, cpf, nome, email, end, tel);

    }

    @Override
    public String toString() {
        return "\n--Dados do Gerente-- \n" + super.toString();
    }

    void cadastrarPessoa() {
        System.out.println("Pessoa cadastrada");
    }

    void cadastrarFuncionario() {
        System.out.println("Cadastrar funcionario chamado no gerente ! (aquele definido no framework, wtf");
        //manipular BD?
        //
    }

    @Override
    public int getID() {
        return idFuncionario;
    }
    
    
    //Métodos úteis
    public void cadastrarGerente() {
        iBancoGerente BG = SimulaBD.getInstanceBD();
        
        if (BG.addGerente(this)) {
            System.out.println("Cadastrado o gerente");
        }

    }
    
    public void cadastrarRecepcionista(TipoRecepcionista recepcionista) {
        iBancoGerente BG = SimulaBD.getInstanceBD();
        
        if (BG.addRecepcionista(recepcionista)){
            System.out.println("Gerente cadastrou uma recepcionista");
        }
    }
    
    public void cadastrarHospede(TipoHospede hospede) {
        iBancoGerente BG = SimulaBD.getInstanceBD();
        
        if ( BG.addHospede(hospede) ) {
            System.out.println("Gerente cadastrou um hospede");
        }
    }

}
