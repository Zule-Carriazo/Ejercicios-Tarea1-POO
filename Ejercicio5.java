package com.mycompany.ejercicio5;

public class Ejercicio5 {

    public static void main(String[] args) {
        double suma, x,y;
        x=20;
        suma=0;
        suma= suma + x;
        y=40;
        x=x + Math.pow(y,2);
        suma=suma + x/y;
        System.out.println("El valor de la suma es: " +suma);
    }
}