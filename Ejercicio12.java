 package com.mycompany.ejercicio12;

public class Ejercicio12 {

    public static void main(String[] args) {
        int  horas_trabajadas;
        double valor_hora, retencion, p_retencion;
        double salario_bruto, salario_neto;
       
        valor_hora=5000;
        horas_trabajadas=48;
        salario_bruto=valor_hora* horas_trabajadas;
        retencion= salario_bruto*(12.5/100);
        p_retencion=
        salario_neto= salario_bruto- retencion;
        System.out.println("Las horas trabajadas son: " + horas_trabajadas);
        System.out.println("El valor_hora es : " + valor_hora);
        System.out.println("La retencion es : " + retencion);
        System.out.println("El salario bruto es : " + salario_bruto);
        System.out.println("El salario neto es : " + salario_neto);
       
    }
}



