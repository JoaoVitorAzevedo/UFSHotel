package Framework;

public class ModuloCadastro  implements IModuloCadastroGerente, IModuloCadastroRecepcionista{
	ModuloCadastro() {	
	}
	public void cadastraFuncionario(int id){
		System.out.println("Eu consegui fazer um cadastro de um funcionario");
	}
	
	public void cadastraHospede(int id) {
		System.out.println("Eu consegui cadastrar um hospede, nro." + id);
		
	}
}
