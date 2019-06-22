/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Framework;

import java.util.Date;
import Banco.SimulaBD;
import Banco.iBancoRecepcionista;

/**
 * @author João Vitor Azevedo 743554
 * @author Sabrina Miranda 743595
 * @author Vitor Sugaya 743605
 */
public abstract class TipoRecepcionista extends TipoFuncionario {

    int ramal;

    public TipoRecepcionista(int ramal, String setor, String turno, String cpf, String nome, String email, TipoEndereco end, TipoTelefone tel) {
        super(setor, turno, cpf, nome, email, end, tel);
        this.ramal = ramal;
    }

    public TipoRecepcionista(int idFuncionario, String nome) {
        super(null, null, null, nome, null, null, null);
        this.ramal = 0;
    }

    @Override
    public String toString() {
        return super.toString() + "Ramal: " + ramal;
    }

    // getters 
    public int getRamal() {
        return ramal;
    }

    //setters
    public void setRamal(int ramal) {
        this.ramal = ramal;
    }
        
    public void cadastrarRecepcionista() {
        iBancoRecepcionista BR = SimulaBD.getInstanceBD();
        
        if (BR.addRecepcionista(this)){
            System.out.println("Recepcionista cadastrada com sucesso");
        }
    }
}
