/**
 * 
 */

package ejerciciosArraysJava;

import java.util.Scanner;

/**
 * @author FESEVA
 *
 */

public class Ejercicio3ArraysJava {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		int [] numero = new int[10];
		int contador = 0;
		System.out.println("Introduzca 10 números:");
		do {
			numero[contador] = 	s.nextInt();
			
			contador ++;
		} while (contador < numero.length);
		System.out.println("");
		System.out.println("Los números introducidos a la inversa son:");
		System.out.println("");
		do {
			contador --;
			System.out.println(numero[contador]);
			
		} while (contador > 0);

	}
}
