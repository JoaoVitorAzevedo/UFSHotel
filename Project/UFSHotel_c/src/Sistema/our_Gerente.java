package Sistema;

import Framework.TipoEndereco;
import Framework.TipoTelefone;
import Framework.TipoGerente;
import Framework.TipoPessoa;
import Framework.TipoRecepcionista;
import Banco.SimulaBD;

/**
 * @author João Vitor Azevedo 743554
 * @author Sabrina Miranda 743595
 * @author Vitor Sugaya 743605
 */
public class our_Gerente extends TipoGerente {

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

    // Metodos da Interface
    @Override
    public void cadastrarFuncLimpeza() {
        System.out.println("cadastrar Flimpeza chamado no our_Gerente");
    }

    @Override
    public void cadastrarGerente() {
        System.out.println("cadastrar gerente chamado no our_Gerente");

    }

    @Override
    public void cadastrarQuarto() {
        System.out.println("cadastrar quarto chamado no our_Gerente");

    }

    public void cadastrarRecepcaoAtendimento(TipoRecepcionista recep) {
        System.out.println("cadastrarRecepcaoAtendimento do our_gerente executado");; //To change body of generated methods, choose Tools | Templates.
      //  SimulaBD banquinho = new SimulaBD();
      //  banquinho.addRecepcionista((our_Recepcionista) recep);
      SimulaBD.addRecepcionista((our_Recepcionista) recep);
    }
    
    

}
