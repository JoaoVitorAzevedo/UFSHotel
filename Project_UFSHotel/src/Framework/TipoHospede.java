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
public abstract class TipoHospede extends TipoPessoa {

    static AtomicInteger idAuto = new AtomicInteger();
    int idHospede;

    protected TipoHospede( String cpf, String nome, String email, TipoEndereco end, TipoTelefone tel) {
        super(cpf, nome, email, end, tel);
        this.idHospede = TipoHospede.idAuto.incrementAndGet();

    }

    @Override
    public int getID() {
        return this.idHospede;
    }

    void setIdHospede(int idHospede) {
        this.idHospede = idHospede;
    }

}
