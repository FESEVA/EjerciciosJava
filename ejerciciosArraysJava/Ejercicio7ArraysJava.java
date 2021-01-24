/**
 * 
 */
package ejerciciosArraysJava;

import java.util.Scanner;

/**
 * @author FESEVA
 *
 */
public class Ejercicio7ArraysJava {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int numeroAleatorio = 0;
		
		int [] numero = new int[100];
		System.out.print("Numero aleatorios generados: ");

		for (int i = 0; i < numero.length; i++) {
			numeroAleatorio = (int)(Math.random()*21);
			numero[i] = numeroAleatorio;
			System.out.print(numero[i]+" ");
		}

		int cambiaPosicion = 0;
		int cambiaPosicion2 = 0;
		System.out.println("");
		System.out.print("Introduzca las posiciones a rotar divididas por espacios (Ejemplo: 1 5): ");
		cambiaPosicion = s.nextInt();
		cambiaPosicion2 = s.nextInt();
		
		cambiaPosicion = cambiaPosicion - 1;
		cambiaPosicion2 = cambiaPosicion2 - 1;
		System.out.print("Numeros con las posiciones rotadas: ");
		for (int i = 0; i < numero.length; i++) {

			if (i == cambiaPosicion) {

				System.out.print("'"+numero[cambiaPosicion2]+"' ");
			}else if (i == cambiaPosicion2) {

				System.out.print("'"+numero[cambiaPosicion]+"' ");
			}else {
				System.out.print(numero[i]+" ");
			}



		}
	}
}
