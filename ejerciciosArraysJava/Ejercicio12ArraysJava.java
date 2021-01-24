/**
 * 
 */
package ejerciciosArraysJava;


import java.util.Scanner;

/**
 * @author FESEVA
 *
 */
public class Ejercicio12ArraysJava {

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
		
		
		//VISUALIZAR INDICE Y VALORES DEL ARRAY INICIAL

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
		
		//POSICION INICIAL POR FINAL.
		
		System.out.print("Introduzca la posición inicial: ");
		int posicionInicial = s.nextInt();
		System.out.print("Introduzca la posición final: ");
		int posicionFinal = s.nextInt();
		
		while (posicionInicial >= posicionFinal) {
			System.out.println("Error, la posicion inicial no puede ser igual o mayor que la posicion final.");

			System.out.print("Introduzca la posición inicial: ");
			posicionInicial = s.nextInt();
			System.out.print("Introduzca la posición final: ");
			posicionFinal = s.nextInt();	
		}
		int j = 0;
		int numeroCambio = 0;
		if (posicionInicial != 0 || posicionInicial == 0) {
			numeroOrdenado[j] = numero[numero.length-1];
			for (int i = -1; i <= posicionInicial; i++) {
				if(i==posicionInicial) {
					numeroCambio = numero[i];

				}else {
					j++;
					numeroOrdenado[j] = numero[i+1];
				}	
			}


			for (int i = posicionInicial ; i < posicionFinal-1; i++) {

				numeroOrdenado[j] = numero[i+1];	
				j++;
			}

			numeroOrdenado[j] = numeroCambio;

			for (int i = posicionFinal+1 ; i < numeroOrdenado.length; i++) {
				j++;
				numeroOrdenado[j] = numero[i-1];	

			}
		}
				
		//20 5 7 4 32 9 2 14 11 6
		
		
		//VISUALIZAR INDICE Y VALORES DEL ARRAY FINAL
		
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
