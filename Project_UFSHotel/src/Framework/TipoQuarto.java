/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Framework;

import Banco.SimulaBD;
import Sistema.our_CategoriaDeQuarto;
import Sistema.our_Quarto;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author João Vitor Azevedo 743554
 * @author Sabrina Miranda 743595
 * @author Vitor Sugaya 743605
 */
public abstract class TipoQuarto {

    int idQuarto;
    int andar;
    TipoCategoriaDeQuarto tipo;
    StatusQuarto status = new StatusQuarto(true, true);
    static AtomicInteger idGen = new AtomicInteger();

//Construtores
    public TipoQuarto(int andar, TipoCategoriaDeQuarto tipo) {
        this.idQuarto = TipoQuarto.idGen.incrementAndGet();
        this.andar = andar;
        this.tipo = tipo;
        this.status.setLimpeza(true);
        this.status.setDisponibilidade(true);

    }

    public TipoQuarto(int idQuarto) {
        this.idQuarto = idQuarto;

    }

    //getters
    public int getAndar() {
        return andar;
    }

    //Retorna o preco total de todos os serviços cadastrados para esse quarto
    public float getPrecoServicos() {
        //return(this.TipoCategoriaDeQuarto.getPrecoServicos());    
        return 0.0f;
    }

    public int getIdQuarto() {
        return idQuarto;
    }

    public boolean getStatusLimpeza() {
        return status.limpeza;
    }

    public boolean getStatusDisponibilidade() {
        return status.disponibilidade;
    }

    public TipoCategoriaDeQuarto getTipo() {
        return tipo;
    }

    //setters
    public void addPrecoServico(float preco) {
        //this.status.addPrecoServico(preco);
    }

    public void setTipo(TipoCategoriaDeQuarto tipo) {
        this.tipo = tipo;
    }

    public void setIdQuarto(int idQuarto) {
        this.idQuarto = idQuarto;
    }

    public void setAndar(int andar) {
        this.andar = andar;
    }

    public void setStatuslimpeza(boolean bol) {
        this.status.limpeza = bol;
    }

    public void setStatusDisponibilidade(boolean bol) {
        this.status.disponibilidade = bol;
    }

    //Métodos com lógica de framework
    
    public void cadastrarQuarto() {
        SimulaBD BG = new SimulaBD();
        our_Quarto newQuarto = new our_Quarto(andar, (our_CategoriaDeQuarto)tipo);

        if (BG.addQuarto(newQuarto)) {
            System.out.println("Cadastrado Quarto com dados: ");
        }

    }
}
