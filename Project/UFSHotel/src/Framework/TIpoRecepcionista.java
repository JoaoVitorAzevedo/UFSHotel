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
public abstract class TIpoRecepcionista extends TipoFuncionario {
    
    int ramal;

    public TIpoRecepcionista(int ramal, String setor, int idFuncionario, String cpf, String nome, String email, Endereco end, Telefone tel) {
        super(setor, idFuncionario, cpf, nome, email, end, tel);
        this.ramal = ramal;
    }
    

    
    // get set
    public int getRamal() {
        return ramal;
    }

    public void setRamal(int ramal) {
        this.ramal = ramal;
    }
    
    
    
    //metodos    
    
    
    public void CadastrarHospede(){
        System.out.println("recepcionista cadastrou hospede com sucesso");
    }
    
}
