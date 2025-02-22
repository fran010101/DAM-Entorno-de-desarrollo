//Es un programa en el que se pide al usuario que introduzca tres números y diga en que orden quiere que se presente. ascendete o descendente

package org.dam;

import java.util.Scanner;

public class Unidad2Ejercicio1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Tienes que introducir tres números enteros y después en que orden quieres que se muestre, ascendente o descendente");
		
		System.out.println("Introduce el primer número: ");
		int num1 = sc.nextInt();
		
		System.out.println("Introduce el segundo número: ");
		int num2 = sc.nextInt();
		
		System.out.println("Introduce el tercer número: ");
		int num3 = sc.nextInt();
		
				
		
		
		
		while(true) {
			
			System.out.println("¿En que orden quieres que se muestre, ascendente (1) o descendente (2)?");
			int orden = sc.nextInt();
			
			//orden ascendente
			if (orden == 1) {
				
				if (num1 < num2) { 
					if (num1 < num3) {
						if (num2 < num3) {
							System.out.println("Orden ascendente: " + num1 + "," + num2 + "," + num3);
							break;
						}  else {
							System.out.println("Orden ascendente: " + num1 + "," + num3 + "," + num2);
							break;
						}
					}  else {
						System.out.println("Orden ascendente: " + num3 + "," + num1 + "," + num2);
						break;
					}
				} else {
					if (num2 < num3) {
						if (num1 < num3) {
							System.out.println("Orden ascendente: " + num2 + "," + num1 + "," + num3);
							break;
						} else {
							System.out.println("Orden ascendente: " + num2 + "," + num3 + "," + num1);
							break;
						}
					} else {
						System.out.println("Orden ascendente: " + num3 + "," + num2 + "," + num1);
						break;
					}
				}
			
			} else if(orden == 2) { //orden descendente
				if (num1 > num2) {
					if (num1 > num3) {
						if (num2 > num3) {
							System.out.println("Orden descendente: " + num1 + "," + num2 + "," + num3);
							break;
						}  else {
							System.out.println("Orden descendente: " + num1 + "," + num3 + "," + num2);
							break;
						}
					}  else {
						System.out.println("Orden descendente: " + num3 + "," + num1 + "," + num2);
						break;
					}
				} else {
					if (num2 > num3) {
						if (num1 > num3) {
							System.out.println("Orden descendente: " + num2 + "," + num1 + "," + num3);
							break;
						} else {
							System.out.println("Orden descendente: " + num2 + "," + num3 + "," + num1);
							break;
						}
					} else {
						System.out.println("Orden descendente: " + num3 + "," + num2 + "," + num1);
						break;
					}
				}
			} else {
				System.out.println("Introduzca ascendente (1) o descendente (2):");
			}
		

		}
		 sc.close();
	}
}
