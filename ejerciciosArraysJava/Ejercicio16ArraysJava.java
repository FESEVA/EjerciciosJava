/**
 * 
 */
package ejerciciosArraysJava;

import java.util.Scanner;

/**
 * @author FESEVA
 *
 */
public class Ejercicio16ArraysJava {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);

		int [] numeroAleatorio = new int [20];
		int [] numeroResaltado = new int [20];

		for (int i = 0; i < numeroAleatorio.length; i++) {
			numeroAleatorio[i]= (int) (Math.random()*401);
			System.out.print(numeroAleatorio[i]+" ");
		}
		System.out.println("");
		System.out.println("");
		System.out.print("¿Qué números quiere resaltar? (1 – los múltiplos de 5, 2 – los múltiplos de 7): ");

		int eleccion = s.nextInt();
		System.out.println("");
		if (eleccion == 1) {

			for (int i = 0; i < numeroResaltado.length; i++) {
				numeroResaltado[i] = numeroAleatorio[i];
				if (numeroResaltado[i] % 5 == 0) {
					System.out.print("["+numeroResaltado[i]+"] ");
				}else {
					System.out.print(numeroResaltado[i]+" ");
				}
			}

		}else if(eleccion == 2) {
			for (int i = 0; i < numeroResaltado.length; i++) {
				numeroResaltado[i] = numeroAleatorio[i];
				if (numeroResaltado[i] % 7 == 0) {
					System.out.print("["+numeroResaltado[i]+"] ");
				}else {
					System.out.print(numeroResaltado[i]+" ");
				}
			}

		}else {
			System.out.println("Error, esa elección no existe.");
		}




	}
}
