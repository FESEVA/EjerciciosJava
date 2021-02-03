/**
 * 
 */
package ejerciciosArraysJava;

import java.util.Scanner;

/**
 * @author FESEVA
 *
 */
public class Ejercicio19ArraysJava {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int [] arrayAleatorio = new int [12];
		int [] arrayResultado = new int [12];
		
		
		for (int i = 0; i < arrayAleatorio.length; i++) {
			arrayAleatorio[i] = (int)(Math.random()*201);
			
		}
		System.out.println("");
		System.out.println("Array original:");
		System.out.println("");
		//CUADRO ARRAY ORIGINAL ALEATORIO
		System.out.print("Índice	");
		for (int i = 0; i < arrayAleatorio.length; i++) {
			System.out.printf("%5d",i);
		}
		System.out.println("");
		System.out.print("Valor	");
		for (int i = 0; i < arrayAleatorio.length; i++) {
			System.out.printf("%5d",arrayAleatorio[i]);
		}
		
		System.out.println("");
		System.out.println("");
		int posicion = 0;
		//DATOS QUE INTODUCE EL USUARIO
		System.out.print("Introduzca el número que quiere insertar: ");
			int numero = s.nextInt();
			
			do {
		System.out.print("Introduzca la posición donde lo quiere insertar (0 – 11): ");
			 posicion = s.nextInt();
			}while(posicion < 0 || posicion >= arrayAleatorio.length);
		
		int j = 0;
		for (int i = 0; i < arrayResultado.length-1; i++) {
			
			if (posicion == 0) {
				i = 0;
				for (int k = 1; k < arrayResultado.length; k++) {
					arrayResultado[0] = numero;
					arrayResultado[k] = arrayAleatorio[i];
					i++;
				}
				
			}else if(posicion == 11){
				i = 0;
				for (int k = 0; k < arrayResultado.length; k++) {
					
					
					arrayResultado[k] = arrayAleatorio[i];
					arrayResultado[arrayResultado.length-1] = numero;
					i++;
				}
				
			}else {
				for (i = 0; i <= posicion; i++) {
					arrayResultado[i] = arrayAleatorio[i];
					if (i == posicion) {
						arrayResultado[i]= numero;	
					}
					 
				}
				j = i-1;
				for (i=posicion+1; i < arrayResultado.length; i++) {
					
					arrayResultado[i] = arrayAleatorio[j];
					 j++;
				}
						
			}
			 
			 
			
		}
		System.out.println("");
		System.out.println("Array resultado:");
		System.out.println("");
		System.out.print("Índice	");
		for (int i = 0; i < arrayResultado.length; i++) {
			System.out.printf("%5d",i);
		}
		System.out.println("");
		System.out.print("Valor	");
		for (int i = 0; i < arrayResultado.length; i++) {
			System.out.printf("%5d",arrayResultado[i]);
		}
		
		System.out.println("");
		System.out.println("");	
			
			
		
	}
}
