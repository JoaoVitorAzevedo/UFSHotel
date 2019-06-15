package Sistema;

import Framework.TipoEndereco;
import Framework.TipoTelefone;
import Framework.TipoHospede;
import Framework.TipoRecepcionista;
import java.util.Date;

/**
 * @author João Vitor Azevedo 743554
 * @author Sabrina Miranda 743595
 * @author Vitor Sugaya 743605
 */
public class our_Recepcionista extends TipoRecepcionista {

    String periodo;

    public our_Recepcionista(int ramal, String setor, int idFuncionario, String turno, String cpf, String nome, String email, TipoEndereco end, TipoTelefone tel, String periodo) {
        super(ramal, setor, idFuncionario, turno, cpf, nome, email, end, tel);
        this.periodo = periodo;
    }

    public our_Recepcionista(int id, String nome) {
        super(0, null, id, null, null, nome, null, null, null);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public boolean cadastrarReserva(int id, TipoHospede hospede, Date dataIn, Date dataOut) {
        //our_Reserva reserv = new our_Reserva();
        if (true) {
            System.out.println("Hospede " + hospede.getNome() + " cadastrado com sucesso!");
            return true;
        } else { // algo deu errado
            System.out.println("Algo deu mto errado moçx :/");
            return false;
        }
    }

    public String getPeriodo() {
        return periodo;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }

    @Override
    public void EfetuarReserva() {
        System.out.println("aaaaaaaaaaaaaaaaaaaaa efetuei reserva"); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void CadastrarHospede(our_Hospede o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void FazerCheckout() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
