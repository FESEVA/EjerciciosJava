/**
 * 
 */
package ejerciciosArraysJava;

import java.util.Scanner;

/**
 * @author FESEVA
 *
 */
public class Ejercicio1ArraysJava {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int [] num = new int[12];
		int contador = 0;
		num[0]= 39;
		num[1]= -2;
		num[4]= 0;
		num[6]= 14;
		num[8]= 5;
		num[9]= 120;
	
		do {
			
			System.out.println(num[contador]);
			contador++;
		} while (contador < 12);
		
	}
}
