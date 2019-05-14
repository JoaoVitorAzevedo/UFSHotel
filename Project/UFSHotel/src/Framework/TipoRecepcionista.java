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

public abstract class TipoRecepcionista extends TipoFuncionario {

    int ramal;

    public TipoRecepcionista(int ramal, String setor, int idFuncionario, String turno, String cpf, String nome, String email, TipoEndereco end, TipoTelefone tel) {
        super(setor, idFuncionario, turno, cpf, nome, email, end, tel);
        this.ramal = ramal;
    }

    public abstract boolean cadastrarReserva(int id, TipoHospede hospede, Data dataIn, Data dataOut);

    // getters 
    public int getRamal() {
        return ramal;
    }

    //setters
    public void setRamal(int ramal) {
        this.ramal = ramal;
    }

    //metodos    
    public void CadastrarHospede() {
        System.out.println("Chamei Criador de Hospedes na TipoRecepcionista");
        System.out.println("recepcionista cadastrou hospede com sucesso\n");
        // manipular BD?
    }

}
