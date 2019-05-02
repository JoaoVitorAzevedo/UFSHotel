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
    public static void cadastrarHospede(our_Hospede novoHospede){
        //BancoDeHospedes.add(novoHospede);
        System.out.println("Novo Hospede cadastrado com sucesso! ID:" + novoHospede.getIdHospede()+", Nome: "+novoHospede.getNome());
        
    }
    public static void cadastrarFuncionario(){
    
    }
    
        
    
    
    
    
    
    
    
}
