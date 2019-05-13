/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Framework;

/**
 *
 * @author MartManHunter
 */
public abstract class  TipoPagamento {
       float valorPago;
       String ModalidadePagamento;
       int qtdParcelas;

    public TipoPagamento(float valorPago, String ModalidadePagamento, int qtdParcelas) {
        this.valorPago = valorPago;
        this.ModalidadePagamento = ModalidadePagamento;
        this.qtdParcelas = qtdParcelas;
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
