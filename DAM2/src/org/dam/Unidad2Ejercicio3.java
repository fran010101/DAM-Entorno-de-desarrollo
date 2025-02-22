//El programa pide un número positivo y muestra los veinte siguientes números

package org.dam;

import java.util.Scanner;

public class Unidad2Ejercicio3 {

	public static void main(String[] args) {
		
		int num;
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("Introduzca un número positivo: ");
			num = sc.nextInt();
		} while (num < 0);
		
		System.out.println("Los 20 sigientes números a " + num + " som:");
		for (int n = 0; n <= 20;n++) {
			System.out.println(num + n);
		}
		

	}

}
