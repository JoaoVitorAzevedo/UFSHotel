/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sistema;

import Framework.Data;
import Framework.TipoFuncionario;
import Framework.TipoServicos;
import java.util.List;

/**
 * @author João Vitor Azevedo 743554
 * @author Sabrina Miranda 743595
 * @author Vitor Sugaya 743605
 */
public class our_Servicos extends TipoServicos {

    public our_Servicos(String nomeDoServico, List<TipoFuncionario> responsaveis, float precoDoServico, Data dataServico, String horario) {
        super(nomeDoServico, responsaveis, precoDoServico, dataServico, horario);

    }

}
