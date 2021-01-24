/**
 * 
 */
package ejerciciosArraysJava;

import java.util.Scanner;

/**
 * @author FESEVA
 *
 */
public class Ejercicio4ArraysJava {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);

		int [] numero = new int[20];		
		int [] cuadrado = new int[20];
		int [] cubo = new int[20];
		
		String uno = "Número";
		String dos = "Cuadrado";
		String tres = "Cubo";
		int contadorNumero = 0;
		int numeroAleatorio = 0;
		System.out.printf("%-8s	%-8s	%-8s", uno, dos, tres);
		System.out.println("");
		System.out.println("--------------------------------------");
		do {
			numeroAleatorio = (int)(Math.random()*(101));
			
			numero[contadorNumero] = numeroAleatorio;
			
			System.out.printf("%-8d	",numero[contadorNumero]);
			
			cuadrado[contadorNumero] = (int) Math.pow((numero[contadorNumero]),2);  
			
			System.out.printf("%-8d	",cuadrado[contadorNumero]);
			
			cubo[contadorNumero] = (int) Math.pow((numero[contadorNumero]),3);
			
			System.out.printf("%-8d	",cubo[contadorNumero]);
			
			
			contadorNumero++;
			
			System.out.println("");
		} while (contadorNumero < 20);	
	}
}
