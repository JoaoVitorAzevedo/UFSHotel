/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Framework;

import Banco.SimulaBD;
import Banco.iBancoGerente;
import Banco.iBancoRecepcionista;
import Framework.TipoFuncionario;
import Sistema.our_CategoriaDeQuarto;
import Sistema.our_Gerente;
import Sistema.our_Hospede;
import Sistema.our_Quarto;
import Sistema.our_Recepcionista;
import Sistema.our_Servicos;
import java.util.List;

/**
 * @author João Vitor Azevedo 743554
 * @author Sabrina Miranda 743595
 * @author Vitor Sugaya 743605
 */
public class ControladorDeCadastros {

    //Construtor
    public ControladorDeCadastros() {
    }

    //Métodos de cadastro do Gerente

  
    @Override
  

    //Métodos de cadastro da Recepcionista
    public void CadastrarHospede(our_Hospede o) {
        System.out.println("cadastrado o");
    }

    public void cadastrarServico(String nomeDoServico, List<TipoFuncionario> responsaveis, float precoDoServico) {
        iBancoRecepcionista BR = new SimulaBD();
        our_Servicos newServico = new our_Servicos(nomeDoServico, responsaveis, precoDoServico);

        if (BR.addServico(newServico)) {
            System.out.println("Serviço cadastrado");
        }
    }

    public void AddServicoQuarto(our_Quarto quarto, Float preco) {

    }
}
