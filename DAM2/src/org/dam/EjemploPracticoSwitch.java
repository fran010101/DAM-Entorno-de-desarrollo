package org.dam;

public class EjemploPracticoSwitch {
	
    public static void main(String[] args) {
        int numero=1;
        String cadena;
        switch (numero) {
        case 0: cadena="Es cero";
              break;
        case 1: cadena="Es uno";
              break;
        case 2: cadena="Es dos";
              break;
        default: cadena="Es distinto de 0, 1 ó 2";
        }
        System.out.println(cadena);
    }
}
