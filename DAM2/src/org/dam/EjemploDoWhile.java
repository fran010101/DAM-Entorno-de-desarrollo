package org.dam;

import java.util.Scanner;

public class EjemploDoWhile {

    public static void main(String[] args) {

        int numero=0, resultado, contador;
        boolean bandera;

        Scanner sc = new Scanner(System.in);

        /*se establece la variable bandera a true para que por lo

 		menos entre una vez en el bucle while

         */

        bandera = true;

        while(bandera) {

            System.out.print("Introduzca un número: ");

            numero = sc.nextInt();

            if(numero>0) {

                /*Si número es mayor que cero se puede realizar la tabla entonces se establece la variable bandera a false para poder

                salir del bucle while */

                bandera = false;

            }

        }

        //se inicializa contador a 1

        contador = 1;

        do {

            resultado = contador * numero;

            System.out.println(numero +" * " + contador + " = " + resultado);

            //se incrementa contador

            contador = contador + 1;

 

            /*cuando contador sea mayor a 10 ya no se cumplirá la condición del do-While y finaliza el bucle 

             */

        } while (contador<=10);

 

        sc.close();

    }

}
