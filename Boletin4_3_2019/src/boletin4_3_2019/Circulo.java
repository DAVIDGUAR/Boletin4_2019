/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin4_3_2019;

/**
 *
 * @author david
 */
public class Circulo {

    double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    public Circulo() {
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double calcularArea() {

        double area = Math.PI * (Math.pow(radio, 2));
        return area;
    }

    public double calcularLonxitude() {
        double lonxitude = (2 * Math.PI) * radio;
        return lonxitude;

    }

}
