package Sistema;

import java.util.Date;
import Framework.TipoFuncionario;
import Framework.TipoServicos;
import java.util.List;

/**
 * @author João Vitor Azevedo 743554
 * @author Sabrina Miranda 743595
 * @author Vitor Sugaya 743605
 */

public class our_Servicos extends TipoServicos {

    public our_Servicos(String nomeDoServico, List<TipoFuncionario> responsaveis, float precoDoServico, Date dataServico, String horario) {
        super(nomeDoServico, responsaveis, precoDoServico, dataServico, horario);

    }

}
