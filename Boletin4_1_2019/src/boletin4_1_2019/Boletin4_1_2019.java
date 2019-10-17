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
public class Boletin4_1_2019 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Coche coche1 = new Coche();
        
        System.out.println("Velocidad coche1 = "+coche1.getVelocidade());
        
        coche1.acelerar(20);
        
        System.out.println("Velocidad coche1 = "+coche1.getVelocidade());
        
        coche1.frenar(50);
        
        System.out.println("Velocidad coche1 = "+coche1.getVelocidade());
        
    }
    
}
