/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sistema;

/**
 *
 * @author MartManHunter
 */
public class Controller {
    
    
         public static void cadastrarQuarto(int id){
             
             
             our_Quarto our = new our_Quarto(id);
             System.out.println("o andar é: " + our.getIdQuarto());
             
            // our.save()
             
             
             
         }
    
    
    
    
    
}
