/**
 * 
 */
package ejerciciosArraysJava;


import java.util.Scanner;

/**
 * @author FESEVA
 *
 */
public class Ejercicio11ArraysJava {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);

		int [] numero = new int[10];

		int [] numeroOrdenado = new int[10];

		for (int i = 0; i < numero.length; i++) {
			numero[i] = s.nextInt();
		}

		System.out.printf("%-45s Array Inicial\n"," ");
		System.out.print("Índice:		");
		for (int i = 0; i < numero.length; i++) {
			System.out.print(i+"	");
		}
		System.out.println("");
		System.out.print("Valor:		");
		for (int i = 0; i < numero.length; i++) {
			System.out.print(numero[i]+"	");
		}
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");

		int validator = 0;
		int j = 0; 
		for (int i = 0; i < numero.length; i++) {

			for (int p = 1; p <= numero[i]; p++) {

				if (numero[i]%p == 0) {
					validator++;		
				}
			}

			if (validator == 2) {
				numeroOrdenado[j] = numero[i];
				j++;
			}
			validator = 0;
		}

		for (int i = 0; i < numero.length; i++) {
			for (int p = 1; p <= numero[i]; p++) {
				if (numero[i]%p == 0) {
					validator++;		
				}
			}	
			if (validator > 2 || numero[i] == 1 || numero[i] < 0) {
				numeroOrdenado[j] = numero[i];
				j++;
			}
			validator = 0;
		}
		System.out.printf("%-46s Array Final\n"," ");
		System.out.print("Índice:		");
		for (int i = 0; i < numero.length; i++) {
			System.out.print(i+"	");
		}
		System.out.println("");
		System.out.print("Valor:		");
		for ( j = 0; j < numeroOrdenado.length; j++) {
			System.out.print(numeroOrdenado[j]+"	");
		}
	}
}
