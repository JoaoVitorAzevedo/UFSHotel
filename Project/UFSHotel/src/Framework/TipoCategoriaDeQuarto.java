/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Framework;

import java.util.List;

/**
 *
 * @author 743554
 */
public class TipoCategoriaDeQuarto {

    String classificacao;
    int capacidade;
    List<TipoServicos> servicos;  // lista de serviços que esse quarto oferece

    public TipoCategoriaDeQuarto(String classificacao, int capacidade) {
        this.classificacao = classificacao;
        this.capacidade = capacidade;
    }

}
