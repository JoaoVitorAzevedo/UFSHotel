package Framework;

import java.util.concurrent.atomic.AtomicInteger;

public class ModuloTipoGerente implements ITipoGerenteTipoPessoa {

    AtomicInteger idG = new AtomicInteger();

    IFuncionario i = new ModuloFuncionario();

    public void realizaCadastro(TipoRecepcionista tr, String nome) {
        i.insereFuncionario(tr);
        System.out.println("Inseri um recpcionista");
    }

    public TipoRecepcionista retornaCadastro(int index) {
        return (TipoRecepcionista) i.retornaFuncionario(index);
    }

}
