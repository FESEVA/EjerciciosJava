/**
 * 
 */
package ejerciciosArraysJava;

import java.util.Scanner;

/**
 * @author FESEVA
 *
 */
public class Ejercicio6ArraysJava {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int [] numero = new int[15];
		int [] numeroRotado = new int[15];
		int i = 0;
		System.out.print("Introduzca "+numero.length+" numeros dividido por espacios: ");
		for ( i = 0; i < numero.length; i++) {			
			numero[i] = s.nextInt();		
			
		}
		
		i = 0;
		for (int j = 0; j < numeroRotado.length ; j++){
			
			if(i==0) {
				numeroRotado[j] = numero[numero.length - 1];
				j++;
				numeroRotado[j] = numero[i];		
			}
			
			if(i > 0) {
				numeroRotado[j]= numero[i]; 	
			}
			i++;
				
		}
		System.out.println("-------------------------------------------------------------------------");
		System.out.print("Nuevo array rotado: ");
		
		for (int j = 0; j < numeroRotado.length ; j++){
			
			System.out.print(numeroRotado[j]+" ");
				
		}	
		
	}
}
