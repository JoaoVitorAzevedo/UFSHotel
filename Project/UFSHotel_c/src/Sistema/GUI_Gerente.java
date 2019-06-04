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

import Banco.SimulaBD;

/**
 *
 * @author MartManHunter
 */
public class GUI_Gerente {

    public static void main(String args[]) {
        //Controller.cadastrarQuarto(31, 7, catRoom1);
       // SimulaBD banco = new SimulaBD();
        our_Recepcionista fulana = new our_Recepcionista(85, "Josilene");

        //iCadastro_Gerente gerente1 = SimulaBD.getGerente();
        //gerente1.cadastrarRecepcaoAtendimento(fulana);

        //iCadastro_Gerente interf = new ControladorDeCadastro();
        
        ControladorDeCadastro.cadastrarRecepcaoAtendimento(fulana);
        //ControladorDeCadastro.
        

        SimulaBD.getListaRecep().forEach((temp) -> {
            System.out.println(temp.getNome());
        });

    }
}
