
/*El programa clacula el índice de masa corporal IMC y muestra lo siguiente segun el IMC:
 * 
 * Bajo peso si está por debajo de 18.5
 * Normal si es igual o mayor a 18.5 y menor a 25
 * Sobrepeso si es igual o mayor a 25 y menor a 30
 * Obesidad si es mayor o igual a 30
 * 
 * El peso tiene que estar en el rango de igual o mayor a 30kg y menor o igual a 300kg.
 * La altura tiene que estar en el rango entre 1.30 metros y 2 metros.
 * Si no se cumple el programa te lo vuelve a pedir hasta que se cumpla.

*/
package org.dam;

import java.util.Scanner;

public class Unidad2Ejercicio4 {

	public static void main(String[] args) {

		double peso; 
		double altura;
		
		Scanner sc = new Scanner(System.in);
		
		// Pide el peso y comprueba que está dentro del rango.
		do {
			System.out.println("Introduzca su peso en Kg (mayor o igual a 30kg y menor o igual a 300kg): ");
			peso = sc.nextDouble();
			
			if (peso < 30 || peso > 300) {
				System.out.println("Peso fuera de rango.");
			}
		
		} while (peso < 30 || peso > 300);
		
		//Pide la altura y comprueba que está dentro del rango.
		do {
			System.out.println("Introduzca altura en metros (mayor o igual a 1.30 metros y menor o igual a 2 metros): ");
			altura = sc.nextDouble();
			
			if (altura < 1.30 || altura > 2) {
				System.out.println("Altura fuera de rango.");
			}
		
		} while (altura < 1.30 || altura > 2);
		
		//calcula el IMC
		double imc = peso / altura;
		
		// imprime por consola si es Bajo peso, Normal, sobrepeso u Obesidad, según el IMC
		if (imc < 18.5) {
			System.out.println("Bajo peso.");
		}
		
		if (imc >= 18.5 && imc < 25) {
			System.out.println("Normal.");
		}
		
		if (imc >= 25 && imc < 30) {
			System.out.println("Sobrepeso.");
		}
		
		if (imc >= 30) {
			System.out.println("Obesidad.");
		}
	}

}
