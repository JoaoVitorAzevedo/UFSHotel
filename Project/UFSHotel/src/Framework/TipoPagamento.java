/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Framework;

public abstract class TipoPagamento {

    float valorPago;
    String ModalidadePagamento;
    int qtdParcelas;
    boolean statusPagamento;

    public TipoPagamento(float valorPago, String ModalidadePagamento, int qtdParcelas, boolean statusPagamento) {
        this.valorPago = valorPago;
        this.ModalidadePagamento = ModalidadePagamento;
        this.qtdParcelas = qtdParcelas;
        this.statusPagamento = statusPagamento;
    }

    //getters
    public String getModalidadePagamento() {
        return ModalidadePagamento;
    }

    public int getQtdParcelas() {
        return qtdParcelas;
    }

    public float getValorPago() {
        return valorPago;
    }

    //setters
    public void setModalidadePagamento(String ModalidadePagamento) {
        this.ModalidadePagamento = ModalidadePagamento;
    }

    public void setValorPago(float valorPago) {
        this.valorPago = valorPago;
    }

    public void setQtdParcelas(int qtdParcelas) {
        this.qtdParcelas = qtdParcelas;
    }

}
