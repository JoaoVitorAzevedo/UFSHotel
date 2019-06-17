/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Framework;

/**
 * @author João Vitor Azevedo 743554
 * @author Sabrina Miranda 743595
 * @author Vitor Sugaya 743605
 */
public abstract class TipoPagamento {

    float valor;
    String ModalidadePagamento;
    int qtdParcelas;
    boolean statusPagamento;

    public TipoPagamento(float valor, String ModalidadePagamento, int qtdParcelas, boolean statusPagamento) {
        this.valor = valor;
        this.ModalidadePagamento = ModalidadePagamento;
        this.qtdParcelas = qtdParcelas;
        this.statusPagamento = statusPagamento;
    }
    
    public TipoPagamento(float valor) {
        this.valor = valor;
        this.ModalidadePagamento = null;
        this.qtdParcelas = 0;
        this.statusPagamento = false;
    }

    //getters
    public String getModalidadePagamento() {
        return ModalidadePagamento;
    }

    public int getQtdParcelas() {
        return qtdParcelas;
    }

    public float getValor() {
        return valor;
    }

    //setters
    public void setModalidadePagamento(String ModalidadePagamento) {
        this.ModalidadePagamento = ModalidadePagamento;
    }

    public void setValor(float valo) {
        this.valor = valor;
    }

    public void setQtdParcelas(int qtdParcelas) {
        this.qtdParcelas = qtdParcelas;
    }

    public void setStatusPagamento(boolean status) {
        this.statusPagamento = status;
    }
    
    public void receberPagamento(float valor) {
        if(valor == this.valor){
            this.statusPagamento = true;
            this.valor = 0;
        }else{
            this.valor -= valor;
        }
    }
    
    public void incrementarPagamento(float valor){
        if(this.statusPagamento == true){
            this.statusPagamento = false;
        }
        this.valor += valor;
    }

}
