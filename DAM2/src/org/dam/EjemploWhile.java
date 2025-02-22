package org.dam;

import java.util.Scanner;

	public class EjemploWhile {
		
	    public static void main(String[] args) {
	    	
	        Scanner sc = new Scanner(System.in);
	        int numero, contador, resultado;
	        
	        System.out.print("Introduzca un número: ");
	        numero = sc.nextInt();   
	        
	        contador = 1;
	        
	        while (contador<=10) {
	            resultado=contador*numero;
	            System.out.println(numero + " * " + contador + " = " + resultado);
	            contador = contador+1;
	        }
	        sc.close();
	    }
	}

	/*Resultado obtenido al introducir el número 4 por teclado:

	4 * 1  = 4
	4 * 2  = 8
	4 * 3  = 12
	4 * 4  = 16
	4 * 5  = 20
	4 * 6  = 24
	4 * 7  = 28
	4 * 8  = 32
	4 * 9  = 36
	4 * 10 = 40*/

