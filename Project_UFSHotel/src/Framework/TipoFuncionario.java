/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Framework;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author João Vitor Azevedo 743554
 * @author Sabrina Miranda 743595
 * @author Vitor Sugaya 743605
 */
public abstract class TipoFuncionario extends TipoPessoa {

    String setor;
    int idFuncionario;
    String turno;
    static AtomicInteger idAuto = new AtomicInteger();

    @Override
    public String toString() {
        return super.toString() + "\nSetor: " + setor
                + "\nID: " + idFuncionario
                + "\nTurno: " + turno + "\n";

    }

    protected TipoFuncionario(String setor, String turno, String cpf, String nome, String email, TipoEndereco end, TipoTelefone tel) {
        super(cpf, nome, email, end, tel);
        this.setor = setor;
        this.idFuncionario = TipoFuncionario.idAuto.incrementAndGet();     // dar um jeito de auto-generate
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
