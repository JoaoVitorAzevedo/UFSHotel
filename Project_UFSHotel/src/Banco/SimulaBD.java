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

import Framework.TipoHospede;
import Framework.TipoRecepcionista;
import Framework.TipoFuncionario;
import Framework.TipoQuarto;
import Framework.TipoReserva;
import Framework.TipoTelefone;
import Framework.ControladorDeCadastros;
import Framework.ControladorDeConsultas;
import Framework.ControladorDeReservas;
import Framework.iCadastroGerente;
import Framework.iCadastroRecepcionista;
import Framework.iConsultaGerente;
import Framework.iConsultaRecepcionista;
import Framework.iReservaGerente;



import Sistema.our_CategoriaDeQuarto;
import Sistema.our_Endereco;
import Sistema.our_Gerente;
import Sistema.our_Hospede;
import Sistema.our_Pagamento;
import Sistema.our_Quarto;
import Sistema.our_Recepcionista;
import Sistema.our_Reserva;
import Sistema.our_Servicos;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import Framework.iReservaGerente;
import Framework.iReservaRecepcionista;

/**
 *
 * @author 743554
 */
public class SimulaBD implements iBancoGerente, iBancoRecepcionista {

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
    our_Pagamento pag1;

    Date data1;
    Date data2;

    // Referencias Interfaces, usar getters
    iCadastroGerente iGerenteCadastrador = new ControladorDeCadastros();
    iConsultaGerente iGerenteConsultador = new ControladorDeConsultas();
    iReservaGerente iGerenteReservador = new ControladorDeReservas();

    iReservaRecepcionista iRecepcionistaCadastrador = new ControladorDeReservas();
    iConsultaRecepcionista iRecepcionistaConsultador = new ControladorDeConsultas();
    iCadastroRecepcionista iRecepcionistaCadastro = new ControladorDeCadastros();
    
   

    //Listas para armazenamento do banco
    public static List<TipoHospede> listaHospede;
    public static List<TipoFuncionario> listaFuncionariosBD;
    public static List<TipoQuarto> listaQuarto;
    public static List<our_Servicos> listaServico;
    public static List<our_Reserva> listaReserva;

    // public static List<our_Recepcionista> listaRecepcao;
    // public static List<our_Gerente> listaGerentes;
    public SimulaBD() {
        data1 = new Date(1996, 5, 21);
        data2 = new Date(1996, 7, 21);

        listaFuncionariosBD = new ArrayList<>();
        listaQuarto = new ArrayList<>();
        listaServico = new ArrayList<>();
        listaHospede = new ArrayList<>();
        listaReserva = new ArrayList<>();

        // listaGerentes = new ArrayList<>(); // not using yet
        // listaRecepcao = new ArrayList<>();
        telefone1 = new TipoTelefone("+55", "15", "99768-4759");

        this.recep1 = new our_Recepcionista(31,"Recepção", "Tarde", "432.343.222.41", "Juju Recepcionista", "my@email.com", endereco1, telefone1, "Tarde de novo");

        Casal = new our_CategoriaDeQuarto("Casal", 2, 120.0f);

        endereco1 = new our_Endereco("17523275", "252", "logradouro", "blablabla", "Jardim Guanabara", "Marília", "Ceará");

        hospede1 = new our_Hospede("432.883.228-81", "Joao Vitor", "fulanodetal@gmail.com", endereco1, telefone1);
        serv = new our_Servicos("Comidinhas top", null, 22.0f);
        serv2 = new our_Servicos("Massagem", null, 22.0f);
        serv3 = new our_Servicos("Frigobar Liberado", null, 22.0f);
        this.suite = new our_CategoriaDeQuarto("Suite", 3, 180.0f);

        suite.addServico(serv2);
        suite.addServico(serv);
        suite.addServico(serv3);

        room1 = new our_Quarto(7, suite);

        gerenteRoberto = new our_Gerente("gerencia ue","tarde", "4372837238-12", "Robertinho de Souza", "ro_berto@gmail.com", endereco1, telefone1);
        
        pag1 = new our_Pagamento(100);
        
        SimulaBD.listaFuncionariosBD.add(recep1);
        SimulaBD.listaFuncionariosBD.add(gerenteRoberto);
        SimulaBD.listaHospede.add(hospede1);
        SimulaBD.listaQuarto.add(room1);

    }


    public our_Hospede getHospede1() {
        return hospede1;
    }

    public our_Recepcionista getRecep1() {
        return recep1;
    }

    public Date getData1() {
        return data1;
    }

    public Date getData2() {
        return data2;
    }

    public our_Quarto getRoom1() {
        return room1;
    }
    
    //Métodos para adicionar no banco
    @Override
    public boolean addRecepcionista(our_Recepcionista newRecepcionista) {
        listaFuncionariosBD.add(newRecepcionista);
        return true;
    }

    @Override
    public boolean addGerente(our_Gerente newGerente) {
        listaFuncionariosBD.add(newGerente);
        return true;
    }

    @Override
    public boolean addQuarto(our_Quarto newQuarto) {
        listaQuarto.add(newQuarto);
        return true;
    }

    @Override
    public boolean addServico(our_Servicos newServico) {
        listaServico.add(newServico);
        return true;
    }
     @Override
    public boolean addReserva(our_Reserva newReserva) {
        listaReserva.add(newReserva);
        return true;
    }
    
    public boolean addHospede(our_Hospede newHospede) {
        listaHospede.add(newHospede);
        return true;
    }

    //Caso de uso que retorna nome de um TipoFuncionario a partir de um id
    @Override
    public String getNomeGerente(int id) {
        for (TipoFuncionario ger : listaFuncionariosBD) {
            //TODO:TipoGerente Talvez?
            if (ger instanceof our_Gerente) {
                int id_g = ger.getID();
                if (id == id_g) {
                    return ger.getNome();
                }
            }
        }
        return null;
    }

    public String getNomeRecepcionista(int id) {
        for (TipoFuncionario recep : listaFuncionariosBD) {
            if (recep instanceof TipoRecepcionista) {
                int id_r = recep.getID();
                if (id == id_r) {
                    return recep.getNome();
                }
            }
        }
        return null;
    }

    public String getNomeHospede(int id) {
        for (TipoHospede hosp : listaHospede) {
            int r_id = hosp.getID();
            if (id == r_id) {
                return hosp.getNome();
            }
        }
        return null;
    }
    
    //Métodos para retornar um objeto especifico a partir de um id

    
    public our_Recepcionista getRecepcionista(int id) {
        for (TipoFuncionario or : listaFuncionariosBD) {
            if (or instanceof TipoRecepcionista) {
                int id_r = or.getID();
                if (id == id_r) {
                    return (our_Recepcionista) or;
                }
            }
        }
        return null;
    }
    
    public TipoReserva getReserva(Date dt_in) {
        for(TipoReserva res: listaReserva){
            Date r_id = res.getDataIn();
            if(dt_in == r_id)
                return res;
        }
        return null;
    }
    
    @Override
    public TipoQuarto getQuartoDisp() {
        for(TipoQuarto quarto: listaQuarto){
            if(quarto.getStatusDisponibilidade() == true)
                return quarto;
        }
        return null;
    }
    
    //DEBUGGING ONLY PURPOSE
    public our_Pagamento getPagamento(){
        return pag1;
    }
    
    //DEBUGGING ONLY PURPOSE
    public our_Quarto getQuarto(){
        return room1;
    }

    public static SimulaBD getBDCarregado() {

        if (single_instance == null) {
            single_instance = new SimulaBD();
        }
        return single_instance;
    }
    
    public List getListaHospede(){
        return listaHospede;
    }

    //Retorna toda a lista de um TipoPessoa
    @Override
    public boolean isValidRecepcionista(TipoRecepcionista recepcionista) {
        if (recepcionista.getNome() == null) {
            return false;
        } else return recepcionista.getNome().equals(getNomeRecepcionista(recepcionista.getID()));
    }

    @Override
    public boolean isValidHospede(TipoHospede hospede) {
        if (hospede.getNome() == null) {
            return false;
        } else return hospede.getNome().equals(getNomeHospede(hospede.getID()));
    }

    //Tira o poder do usuário de dar "new"
    public iCadastroGerente getiGerenteCadastrador() {
        return iGerenteCadastrador;
    }

    public iConsultaGerente getiGerenteConsultador() {
        return iGerenteConsultador;
    }

    public iReservaRecepcionista getiRecepcionistaCadastrador() {
        return iRecepcionistaCadastrador;
    }

    public iConsultaRecepcionista getiRecepcionistaConsultador() {
        return iRecepcionistaConsultador;
    }
    
    public iReservaGerente getiGerenteReservador() {
        return iGerenteReservador;
    }



}
