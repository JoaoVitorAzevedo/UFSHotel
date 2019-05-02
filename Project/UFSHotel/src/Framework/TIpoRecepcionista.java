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
public abstract class TipoRecepcionista extends TipoFuncionario {
    
    int ramal;

    public TipoRecepcionista(int ramal, String setor, int idFuncionario, String turno, String cpf, String nome, String email, Endereco end, Telefone tel) {
        super(setor, idFuncionario, turno, cpf, nome, email, end, tel);
        this.ramal = ramal;
    }

 
    

    
    // getters 
    public int getRamal() {
        return ramal;
    }
    //setters
    public void setRamal(int ramal) {
        this.ramal = ramal;
    }
     
    //metodos    
    
    public void CadastrarHospede(){
        System.out.println("Chamei Criador de Hospedes");
        System.out.println("recepcionista cadastrou hospede com sucesso");

        // manipular BD?
    }
    
    
    
}
