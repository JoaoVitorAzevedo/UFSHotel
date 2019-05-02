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
public abstract class TipoFuncionario extends Pessoa {
    
    String setor;
    int idFuncionario;
    String turno;
    

    public TipoFuncionario(String setor, int idFuncionario, String turno, String cpf, String nome, String email, TipoEndereco end, Telefone tel) {
        super(cpf, nome, email, end, tel);
        this.setor = setor;
        this.idFuncionario = idFuncionario;
        this.turno = turno;
    }
    
    
    
    
    
    //getters
    public int getIdFuncionario() {
        return idFuncionario;
    }
    public String getSetor() {
        return setor;
    }
    public String getTurno() {
        return turno;
    }
    
    
    //setters
    public void setIdFuncionario(int idFuncionario) {
        this.idFuncionario = idFuncionario;
    }
    public void setSetor(String setor) {
        this.setor = setor;
    }
    public void setTurno(String turno) {
        this.turno = turno;
    }
    
    
    
}
