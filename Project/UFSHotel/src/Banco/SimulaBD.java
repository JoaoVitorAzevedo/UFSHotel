/*
 * The MIT License
 *
 * Copyright 2019 MartManHunter.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package Banco;

import Framework.TipoTelefone;

import Sistema.our_CategoriaDeQuarto;
import Sistema.our_Endereco;
import Sistema.our_Gerente;
import Sistema.our_Hospede;
import Sistema.our_Quarto;
import Sistema.our_Recepcionista;
import Sistema.our_Servicos;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author 743554
 */
	
public class SimulaBD implements iBancoGerente, iBancoRecepcionista{

	private static SimulaBD single_instance = null;
    //Objetos hipotéticos para preencher banco inicialmente
    our_Recepcionista recep1;
    our_Hospede valter;
    our_Hospede hospede1;
    our_CategoriaDeQuarto Casal;
    our_Endereco endereco1;
    TipoTelefone telefone1;
    our_Servicos serv;
    our_Servicos serv2;
    our_Servicos serv3;
    our_CategoriaDeQuarto suite;
    our_Gerente gerenteRoberto;
    our_Quarto room1;

    //Listas para armazenamento do banco
    public static List<our_Recepcionista> listaRecepcao;
    public static List<our_Quarto> listaQuarto;
    public static List<our_Gerente> listaGerente;
    public static List<our_Servicos> listaServico;
    

    public SimulaBD() {
    	

        listaRecepcao = new ArrayList<>();
        listaQuarto = new ArrayList<>();
        listaGerente = new ArrayList<>();
        listaServico = new ArrayList<>();

        this.recep1 = new our_Recepcionista(31, "Recepção", 88, "Tarde", "432.343.222.41", "Juju Recepcionista", "my@email.com", endereco1, telefone1, "Tarde de novo");
        SimulaBD.listaRecepcao.add(recep1);

        Casal = new our_CategoriaDeQuarto("Casal", 2, 120.0f);

        endereco1 = new our_Endereco("17523275", "252", "logradouro", "blablabla", "Jardim Guanabara", "Marília", "Ceará");

        hospede1 = new our_Hospede(31, "432.883.228-81", "Joao Vitor", "fulanodetal@gmail.com", endereco1, telefone1);
        serv = new our_Servicos("Comidinhas top", null, 22.0f);
        serv2 = new our_Servicos("Massagem", null, 22.0f);
        serv3 = new our_Servicos("Frigobar Liberado", null, 22.0f);
        this.suite = new our_CategoriaDeQuarto("Suite", 3, 180.0f);  

        suite.addServico(serv2);
        suite.addServico(serv);
        suite.addServico(serv3);

        room1 = new our_Quarto(123, 7, suite);

        gerenteRoberto = new our_Gerente(0, "Roberto");
        SimulaBD.listaGerente.add(gerenteRoberto);

    }

    //Métodos para adicionar no banco
    @Override
    public boolean addRecepcionista(our_Recepcionista newRecepcionista) {
        listaRecepcao.add(newRecepcionista);
        return true;
    }
      
    @Override
    public boolean addGerente(our_Gerente newGerente){
        listaGerente.add(newGerente);
        return true;
    }
    
    @Override
    public boolean addQuarto(our_Quarto newQuarto){
        listaQuarto.add(newQuarto);
        return true;
    }
    
    @Override
     public boolean addServico(our_Servicos newServico){
        listaServico.add(newServico);
        return true;
    }
     
     //ALGUEM ME AJUDA AQUIIII PLIS
    //Caso de uso que retorna nome de um Gerente x
    @Override
    public String getNomeGerente(int id) {
        for(our_Gerente or: listaGerente){
            int teste = or.getID();
            if(id == teste)
                return or.getNome();
        }
        return null;
    }

    public SimulaBD getBDCarregado() {
    	
    	if (single_instance == null) {
    		single_instance = new SimulaBD();
    	}
        return single_instance;
    }

    //Retorna toda a lista de Recepcionistas
    public static ArrayList<our_Recepcionista> getListaRecep() {
        return (ArrayList<our_Recepcionista>) SimulaBD.listaRecepcao;
    }

}
