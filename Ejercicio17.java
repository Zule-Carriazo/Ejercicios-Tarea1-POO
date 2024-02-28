package com.mycompany.ejercicio17;

public class Ejercicio17 {



    public static void main(String[] args) {
        double radio, area, circunferencia;
        radio= 13;
        circunferencia= 2*Math.PI*radio;
        area= Math.PI*Math.pow(radio, 2);
        System.out.println("El radio es: "+ radio);
        System.out.println("El area es: " + area);
        System.out.println("La longitud de la circunferencia es: "+circunferencia);
    }
} 
