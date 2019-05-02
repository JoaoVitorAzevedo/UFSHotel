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

    public TipoGerente() {
        super(null, 0, null, null, null, null, null, null);
        System.out.println("Criei Gerente Nulo");
    }

    
    
    public void cadastrarFuncionario(){
        System.out.println("Cadastrei um funcionario urruuuu");
        //manipular BD?
        //
        
       }
     
    
}
