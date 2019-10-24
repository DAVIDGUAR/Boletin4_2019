/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin4_1_2019;

/**
 *
 * @author david
 */
public class Coche {
    
    int velocidad=0;

    public Coche() {
    }
    
    public int getVelocidade(){
        return velocidad;
        
        
    }
    
    public void acelerar (int valor){
        velocidad=velocidad+valor;
        
    }
   public void frenar (int menos){
       
       
       
       velocidad=velocidad-menos;
       if(velocidad<0){
           
           velocidad =0;
           
       }
       
       
       
   }
 
}
