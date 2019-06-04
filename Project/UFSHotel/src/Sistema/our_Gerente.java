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
public class our_Gerente extends TipoGerente implements ControllerXGerente {

    public our_Gerente() {
        super();
    }

    public our_Gerente(String setor, int idFuncionario, String turno, String cpf, String nome, String email, TipoEndereco end, TipoTelefone tel) {
        super(setor, idFuncionario, turno, cpf, nome, email, end, tel);

    }

    public our_Gerente(int idFuncionario, String nome) {
        super(null, idFuncionario, null, null, nome, null, null, null);
    }

    @Override
    public Boolean cadastrarPessoa() {
        System.out.println("Cadastrando pessoa dentro do sistema");
        return true;
    }

    public void cadastrarPessoa(TipoPessoa tp) {
        System.out.println("cadastrei no filho");
    }

    @Override
    public boolean cadastrarLimpeza() {
        System.out.println("cadastrei cleide da limpeza");
        return true;
    }

    @Override
    public boolean cadastrarGerente() {
        System.out.println("cadastrei gerente nelsonnn");
        return true;
    }

    @Override
    public boolean cadastrarQuarto() {
        System.out.println("cadastrado quarto 0");
        return true;
    }

    @Override
    public boolean cadastrarRecepcaoAtendimento() {
        System.out.println("estou na interface");
        return true;
    }
}
