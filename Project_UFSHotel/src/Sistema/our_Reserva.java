/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sistema;

import java.util.Date;

//import Framework.Data;
import Framework.TipoHospede;
import Framework.TipoPagamento;
import Framework.TipoQuarto;
import Framework.TipoRecepcionista;
import Framework.TipoReserva;
import java.util.Map;

/**
 * @author João Vitor Azevedo 743554
 * @author Sabrina Miranda 743595
 * @author Vitor Sugaya 743605
 */
public class our_Reserva extends TipoReserva {

    public our_Reserva(Date dataIn, Date dataOut, TipoHospede cli, TipoRecepcionista recep, TipoQuarto quarto, TipoPagamento pag) {

        super(dataIn, dataOut, cli, recep, quarto, pag);

    }

    public our_Reserva(Date dataIn, Date dataOut, TipoHospede cli, TipoRecepcionista recep, TipoQuarto quarto) {

        super(dataIn, dataOut, cli, recep, quarto);

    }

    @Override
    public String toString() {
        return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }
    
    
            

    public double getTotalConsumido() {
        double total = 0;
        Map<String, Double> Consumido;
        Consumido = getConsumido();
        for (Map.Entry<String, Double> entry : Consumido.entrySet()) {
            Double v = entry.getValue();
            total += v;
        }

        return total;
    }

    public float calcularDesconto(float percentDisc) {
        float preco;
        TipoPagamento pag = getPag();
        preco = pag.getValor();

        return preco * (percentDisc / 100);
    }

    public boolean addDesconto(int percentDisc) {
        float Desconto, valorNovo;
        TipoPagamento pag = getPag();

        Desconto = calcularDesconto(percentDisc);
        valorNovo = pag.getValor() - Desconto;

        pag.setValor(valorNovo);

        return true;
    }

}
