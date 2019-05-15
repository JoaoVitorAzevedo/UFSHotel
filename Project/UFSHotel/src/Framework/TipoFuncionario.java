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
public abstract class TipoFuncionario extends TipoPessoa /* implements <nome-interface> */ /* implements <nome-interface> */ {

    String setor;
    int idFuncionario;
    String turno;

    public TipoFuncionario(String setor, int idFuncionario, String turno, String cpf, String nome, String email, TipoEndereco end, TipoTelefone tel) {
        super(cpf, nome, email, end, tel);
        this.setor = setor;
        this.idFuncionario = idFuncionario;     // dar um jeito de auto-generate
        this.turno = turno;
    }

    //getters
    @Override
    public int getID() {
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
