/**
 * 
 */
package ejerciciosArraysJava;

import java.util.Scanner;

/**
 * @author FESEVA
 *
 */
public class Ejercicio20ArraysJava {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);

		System.out.print("Introduzca el número total de nombres de reyes: ");
		int numeroDeReyes = s.nextInt();

		String [] arrayReyes = new String [numeroDeReyes];

		System.out.println("Vaya introduciendo los nombres de los reyes y pulsando INTRO.");


		for (int i = 0; i < arrayReyes.length; i++) {
			arrayReyes[i] = new Scanner(System.in).nextLine();
		}

		String [] arrayReyesCopia = arrayReyes;
		String [] arrayReyesFinal = new String [numeroDeReyes];

		int contadorRomano = 1;

		for (int i = 0; i < arrayReyes.length; i++) {
			for ( int j = 0; j < arrayReyesCopia.length; j++) {	

				if(arrayReyes[i].equals(arrayReyesCopia[j])) {
					//System.out.println(contadorRomano);
					arrayReyesFinal[j] = arrayReyesCopia[j]+" "+contadorRomano+"º";
					contadorRomano++;
				}
			}	
			contadorRomano = 1;

		}
		System.out.println("Los reyes introducidos son:");

		for (int i = 0; i < arrayReyesFinal.length; i++) {
			System.out.println(arrayReyesFinal[i]); 
		}


	}
}
