package org.dam;

import java.util.Scanner;

public class EstructuraDeControl2 {
	
    public static void main(String[] args) {
        //Declaración de variables
        Scanner sc = new Scanner(System.in);
        double calificacion;

        System.out.print("Introduzca la puntuación del estudiante(0-10): ");
        calificacion = sc.nextDouble();

        if (calificacion >= 9) {
            System.out.println("Categoría: Excelente");
        } else if (calificacion >= 8) {
            System.out.println("Categoría: Muy Bueno");
        } else if (calificacion >= 7) {
            System.out.println("Categoría: Bueno");
        } else if (calificacion >= 5) {
            System.out.println("Categoría: Suficiente");
        } else {
            System.out.println("Categoría: Insuficiente");
        }
        sc.close();
    }
}

