/**
 * 
 */
package ejerciciosArraysJava;

import java.util.Scanner;

/**
 * @author FESEVA
 *
 */
public class Ejercicio5ArraysJava {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int [] numero = new int[10];
		int numeroMayor = 0;
		int numeroMenor = 999999999;
		System.out.println("Introduzca 10 números:");

		for (int i = 0; i < 10; i++) {
			numero[i]= s.nextInt();	
			if (numero[i] > numeroMayor ) {
				numeroMayor = numero[i];
				
			}
			
			if (numero[i] < numeroMenor) {
				numeroMenor = numero[i];
			}
		}
		System.out.println("-----------------------------");
		for (int i = 0; i < 10; i++) {
			
			if(numero[i] != numeroMayor && numero[i] != numeroMenor){
				System.out.println(numero[i]);
			}
			
			if (numero[i] == numeroMayor) {

				System.out.println(numero[i]+" máximo");
			}
			
			if (numero[i] == numeroMenor) {
				System.out.println(numero[i]+" mínimo");
			}
			
			
		}


	}
}
