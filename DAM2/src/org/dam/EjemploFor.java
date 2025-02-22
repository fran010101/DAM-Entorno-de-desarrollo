package org.dam;

import java.util.Scanner;



public class EjemploFor {

    public static void main(String[] args) {

        //Declaración de variables

        int numero, resultado;
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduzca un número: ");
        numero = sc.nextInt();

        for (int contador = 0; contador <= 10; contador++) {

            resultado = contador*numero;

            System.out.println(numero + " * " + contador + " = " + resultado);

        }

        sc.close();

    }

}

 
