/**
 * 
 */
package ejerciciosArraysJava;

import java.util.Iterator;
import java.util.Scanner;

/**
 * @author FESEVA
 *
 */
public class Ejercicio14ArraysJava {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);

		String [] original = new String [8];
		String [] colores = {"rojo", "azul", "amarillo", "naranja", "rosa", "negro", "blanco", "morado"};
		String [] resultado = new String [8];
		
		for (int i = 0; i < original.length; i++) {
			
			original[i]= s.nextLine();
			
		}
		
		//CUADRADO ARRAY ORIGINAL
		
		System.out.println("Array original:");
		System.out.printf("┌───────────┬───────────┬───────────┬───────────┬───────────┬───────────┬───────────┬───────────┐\n"); 
		System.out.print("│"); 
		for (int i = 0; i < original.length; i++) {

			System.out.printf("     %-6d│",i); 
		}
		System.out.println("");
		System.out.println("├───────────┼───────────┼───────────┼───────────┼───────────┼───────────┼───────────┼───────────┤");
		System.out.print("│");
		for (int i = 0; i < original.length; i++) {

			System.out.printf("%-11s│",original[i]); 
		}
		System.out.println("");
		System.out.println("└───────────┴───────────┴───────────┴───────────┴───────────┴───────────┴───────────┴───────────┘");
	
		//COLORES PRIMERAS POSICIONES
		int j = 0;
		for (int i = 0; i < resultado.length; i++) {
			
			
			for (int k = 0; k < colores.length; k++) {
				if (original[i].equals(colores[k])) {
					resultado[j] = original[i];
				j++;
				}
				
			}
				
		}
		//NO-COLORES ULTIMAS POSICIONES
		
		System.out.print("");

		for (int i = 0; i < resultado.length; i++) {
			int o = 0;

			for (int k = 0; k < colores.length; k++) {

				if (!original[i].equals(colores[k])) {	
					o++;
					if(o == colores.length) {
						resultado[j]= original[i];
						j++;

					}

				}

			}

		}
		
		
		//CUADRADO RESULTADO
		
		System.out.println("Array resultado:");
		System.out.printf("┌───────────┬───────────┬───────────┬───────────┬───────────┬───────────┬───────────┬───────────┐\n"); 
		System.out.print("│"); 
		for (int i = 0; i < resultado.length; i++) {

			System.out.printf("     %-6d│",i); 
		}
		System.out.println("");
		System.out.println("├───────────┼───────────┼───────────┼───────────┼───────────┼───────────┼───────────┼───────────┤");
		System.out.print("│");
		for ( j = 0; j < resultado.length; j++) {

			System.out.printf("%-11s│",resultado[j]); 
		}
		System.out.println("");
		System.out.println("└───────────┴───────────┴───────────┴───────────┴───────────┴───────────┴───────────┴───────────┘");
	
		
		
		
		
	}
}
