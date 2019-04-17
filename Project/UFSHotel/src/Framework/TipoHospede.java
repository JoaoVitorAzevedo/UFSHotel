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
public class TipoHospede extends Pessoa {
    
    int idHospede;

    public TipoHospede(int idHospede, String cpf, String nome, String email, Endereco end, Telefone tel) {
        super(cpf, nome, email, end, tel);
        this.idHospede = idHospede;
    }
    

    public int getIdHospede() {
        return idHospede;
    }

    public void setIdHospede(int idHospede) {
        this.idHospede = idHospede;
    }
    
    

   
    
    
    
}
