//El programa muestr los nímeros divisibles por 2 del ran 1 al 100.

package org.dam;

public class Unidad2Ejercicio5 {

	public static void main(String[] args) {
		
		System.out.println("Los multiplos de 2 de 1 al 100 son:");
		
		for (int n = 1; n <= 100; n++) {
			if (n % 2 == 0) {
				System.out.println(n);
			}
		}
	
	}
	
}