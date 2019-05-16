package Framework;

import java.util.ArrayList;

public  class ModuloFuncionario implements IFuncionario {
	ArrayList<TipoFuncionario> listTF = new ArrayList<TipoFuncionario>();
	 
	public  void insereFuncionario(TipoFuncionario tf) {
		listTF.add(tf);
	}
	public  TipoFuncionario  retornaFuncionario(int index) {
		return listTF.get(index);
	}
}
