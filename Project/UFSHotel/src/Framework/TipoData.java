/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Framework;

/**
 *
 * @author 743554
 */
public abstract class TipoData {
    
    int dia;
    int mes;
    int ano;
    
    
    
    public void setData(int d, int m, int y){
        this.dia = d;
        this.mes = m;
        this.ano = y;
    
    
    }
    
    public void getData(){
        System.out.println("seila");
        System.out.println("Data: "+ dia+"/"+mes+"/"+ano);
        System.out.println("fim");
        
        
    
    
    }
    
}
