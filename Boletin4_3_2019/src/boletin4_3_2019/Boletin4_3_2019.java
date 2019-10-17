/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin4_3_2019;

import javax.swing.JOptionPane;

/**
 *
 * @author david
 */
public class Boletin4_3_2019 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        Circulo obx1 = new Circulo();
        
        obx1.setRadio(Integer.parseInt(JOptionPane.showInputDialog("Introduce el radio del circulo")));
        
        System.out.println("El area del circulo es = "+obx1.calcularArea()+"\nLa longitud del circulo es = "+obx1.calcularLonxitude());
        
        
        
        
    }
    
}
