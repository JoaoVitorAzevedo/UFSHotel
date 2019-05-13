package Sistema;

import Framework.TipoEndereco;
import Framework.TipoTelefone;

public class our_Gerente extends TipoGerente {
	
	public our_Gerente(String setor, int idFuncionario, String turno, String cpf, String nome, String email, TipoEndereco end, TipoTelefone tel) {
		super(setor, idFuncionario, turno, cpf, nome, email, end, tel);
	}
}
