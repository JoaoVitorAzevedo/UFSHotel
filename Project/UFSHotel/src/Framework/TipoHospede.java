/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Framework;

public class TipoHospede extends TipoPessoa {

    int idHospede;

    public TipoHospede(int idHospede, String cpf, String nome, String email, TipoEndereco end, TipoTelefone tel) {
        super(cpf, nome, email, end, tel);
        this.idHospede = idHospede;

    }

    public int getIdHospede() {
        return idHospede;
    }

    @Override
    public int getID() {
        return this.idHospede;
    }

    public void setIdHospede(int idHospede) {
        this.idHospede = idHospede;
    }

}
