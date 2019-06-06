/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Framework;

import Sistema.iCadastro_Recepcionista;
import java.util.Date;

/**
 * @author João Vitor Azevedo 743554
 * @author Sabrina Miranda 743595
 * @author Vitor Sugaya 743605
 */
public abstract class TipoRecepcionista extends TipoFuncionario implements iCadastro_Recepcionista {

    int ramal;

    public TipoRecepcionista(int ramal, String setor, int idFuncionario, String turno, String cpf, String nome, String email, TipoEndereco end, TipoTelefone tel) {
        super(setor, idFuncionario, turno, cpf, nome, email, end, tel);
        this.ramal = ramal;
    }

    public TipoRecepcionista(int idFuncionario, String nome) {
        super(null, idFuncionario, null, null, nome, null, null, null);
        this.ramal = 0;
    }

    public abstract boolean cadastrarReserva(int id, TipoHospede hospede, Date dataIn, Date dataOut);

    // getters 
    public int getRamal() {
        return ramal;
    }

    //setters
    public void setRamal(int ramal) {
        this.ramal = ramal;
    }

    //metodos
    //funcionario nao sabe o que é um hospede
    public void CadastrarHospede() {
    	TipoEndereco te;
    	TipoTelefone tt;
    	//TipoHospede th = new TipoHospede(0, "485687512", "Roberto", "email@email.com", te, tt);
        System.out.println("Chamei Criador de Hospedes na TipoRecepcionista");
        System.out.println("recepcionista cadastrou hospede com sucesso\n");
        // manipular BD?
    }
    
    protected void realizarCadastro(int id) {
    //	IModuloCadastroRecepcionista modulo = new ModuloCadastro();
    //	modulo.cadastraHospede(id);
    }

}
