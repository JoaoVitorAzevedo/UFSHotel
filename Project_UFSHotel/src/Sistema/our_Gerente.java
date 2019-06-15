package Sistema;

import Framework.TipoEndereco;
import Framework.TipoTelefone;
import Framework.TipoGerente;
import Framework.TipoPessoa;

/**
 * @author João Vitor Azevedo 743554
 * @author Sabrina Miranda 743595
 * @author Vitor Sugaya 743605
 */
public class our_Gerente extends TipoGerente{

    public our_Gerente() {
        super();
    }

    public our_Gerente(String setor, int idFuncionario, String turno, String cpf, String nome, String email, TipoEndereco end, TipoTelefone tel) {
        super(setor, idFuncionario, turno, cpf, nome, email, end, tel);

    }

    public our_Gerente(int idFuncionario, String nome) {
        super(null, idFuncionario, null, null, nome, null, null, null);
    }
     

    public void cadastrarPessoa(TipoPessoa tp) {
        System.out.println("cadastrei no filho");
    }
    


}
