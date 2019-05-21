/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Framework;

/**
 * @author João Vitor Azevedo 743554
 * @author Sabrina Miranda 743595
 * @author Vitor Sugaya 743605
 */
public abstract class TipoGerente extends TipoFuncionario{

    TipoGerente() {
        super(null, 0, null, null, null, null, null, null);
        System.out.println("Criei Gerente Nulo");
    }
     
    protected TipoGerente(String setor, int idFuncionario, String turno, String cpf, String nome, String email, TipoEndereco end, TipoTelefone tel) {
        super(setor, idFuncionario, turno, cpf, nome, email, end, tel);

    }

   
    void cadastrarPessoa(TipoPessoa tp) {
        System.out.println("cadastrei no pai");
    }
    
    void cadastrarFuncionario() {
        System.out.println("Cadastrar funcionario chamado no gerente ! (aquele definido no framework, wtf");
        //manipular BD?
        //
    }
    
    public abstract Boolean cadastrarPessoa();

}
