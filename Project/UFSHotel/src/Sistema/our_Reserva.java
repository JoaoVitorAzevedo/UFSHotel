/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sistema;

import Framework.Data;
import Framework.TipoHospede;
import Framework.TipoPagamento;
import Framework.TipoQuarto;
import Framework.TipoRecepcionista;
import Framework.TipoReserva;

/**
 * @author João Vitor Azevedo 743554
 * @author Sabrina Miranda 743595
 * @author Vitor Sugaya 743605
 */
public class our_Reserva extends TipoReserva {

    public our_Reserva(Data dataIn, Data dataOut, int idReserva, TipoHospede cli, TipoRecepcionista recep, TipoQuarto quarto, TipoPagamento pag) {

        super(dataIn, dataOut, idReserva, cli, recep, quarto, pag);

    }
    
    public getTotalConsumido() {
    	double total = 0;
    	
        for (Map.Entry<String, float> entry : Consumido.entrySet()) {
            float v = entry.getValue();
            total += Double.parseDouble(v);
        }
        
        return total;
    }
    
    public float calcularDesconto(float percentDisc) {
    	float preco;
    	preco = pag.getValor();
    	
    	return preco*(percentDisc/100);
    }
    
    public bool addDesconto(percentDisc) {
    	float Desconto, valorNovo;
    	
    	Desconto = calcularDesconto(percentDisc);
    	valorNovo = getValor() - Desconto;
    	
    	setValor(valorNovo);
    	
    	return true;
    }

}
