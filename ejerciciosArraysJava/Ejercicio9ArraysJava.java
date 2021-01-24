/**
 * 
 */
package ejerciciosArraysJava;

import java.util.Scanner;

/**
 * @author FESEVA
 *
 */
public class Ejercicio9ArraysJava {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
	
		int [] numero = new int [8];
		
		for (int i = 0; i < numero.length; i++) {
			System.out.print("Introduzca el "+(i + 1)+" número: ");
			numero[i] = s.nextInt();
		}
		System.out.println("--------------------------------------");
		for (int i = 0; i < numero.length; i++) {
			if (numero[i] % 2 == 0) {
				System.out.println(numero[i]+" - par");
			}else {
				System.out.println(numero[i]+" - impar");
			}
			
		}
		
	
	}
}
