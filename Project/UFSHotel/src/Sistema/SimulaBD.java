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
package Sistema;

import Framework.TipoTelefone;

/**
 *
 * @author 743554
 */
public class SimulaBD {

    //our_Gerente gerente;
    our_Recepcionista recep1;
    our_Hospede valter;
    our_TipoCategoriaDeQuarto casal;
    our_Data data1;
    our_Endereco endereco1;
    TipoTelefone telefone1;
    our_Servicos serv;
    our_Servicos serv2;
    our_Servicos serv3;
    our_CategoriaDeQuarto suite;
    our_Gerente gerenteRoberto;

    our_Hospede hospede1;

    our_Quarto room1;

    public SimulaBD() {
        our_CategoriaDeQuarto casal = new our_CategoriaDeQuarto("Casal", 2, 120.0f);    //Nome da Categoria, capacidade, preco)

        data1 = new our_Data(3, 4, 1299);
        endereco1 = new our_Endereco("17523275", "252", "logradouro", "blablabla", "Jardim Guanabara", "Marília", "Ceará");
        telefone1 = new TipoTelefone("+55", "14", "99777-7676");

        hospede1 = new our_Hospede(31, "432.883.228-81", "Joao Vitor", "fulanodetal@gmail.com", endereco1, telefone1);
        serv = new our_Servicos("Comidinhas top", null, 22.0f, new our_Data(6, 8, 1986), "horario tal");
        serv2 = new our_Servicos("Massagem", null, 22.0f, new our_Data(6, 8, 1986), "horario y");
        serv3 = new our_Servicos("Frigobar Liberado", null, 22.0f, new our_Data(6, 8, 1986), "horario x");
        this.suite = new our_CategoriaDeQuarto("Suite", 3, 180.0f);    //Nome da Categoria, capacidade, preco)

        suite.addServico(serv2);
        suite.addServico(serv);
        suite.addServico(serv3);

        room1 = new our_Quarto(123, 7, suite);

        gerenteRoberto = new our_Gerente(0, "Roberto");
        this.recep1 = new our_Recepcionista(31, "Recepção", 88, "Tarde", "432.343.222.41", "Juju Recepcionista", "my@email.com", endereco1, telefone1, "Tarde de novo");


    }

    public SimulaBD getBDCarregado() {
        return this;
    }
}
