/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Framework;

/**
 *
 * @author 743554
 */
public abstract class TipoGerente extends TipoFuncionario {

   /* public TipoGerente() {
        super(null, 0, null, null, null, null, null, null);
        System.out.println("Criei Gerente Nulo");
    }
     */
    
    

    
    
    public TipoGerente(String setor, int idFuncionario, String turno, String cpf, String nome, String email, TipoEndereco end, TipoTelefone tel){
        super(setor, idFuncionario, turno, cpf, nome, email, end, tel);
        
        
       }

    public void cadastrarFuncionario() {
        System.out.println("Cadastrar funcionario chamado no gerente ! (aquele definido no framework, wtf");
        //manipular BD?
        //
    }
     
    
}
