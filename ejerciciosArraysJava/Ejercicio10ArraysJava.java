/**
 * 
 */
package ejerciciosArraysJava;

/**
 * @author FESEVA
 *
 */
public class Ejercicio10ArraysJava {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] numero = new int[20];
		int numeroAleatorio = 0;
		int [] numeroOrdenado = new int[20];
		
		int j = 0;
		System.out.println("Array desordenado :");
		for (int i = 0; i < numero.length; i++) {
			numeroAleatorio = (int)(Math.random()*101);
			numero[i] = numeroAleatorio;
			System.out.print(numero[i]+" ");
		}
		
		for (int i = 0; i < numero.length; i++) {
			
			if (numero[i]%2 == 0) {
				numeroOrdenado[j] = numero[i];
				j++;	
			}else {}
			
		}
		
		System.out.println("");
		
		for (int i = 0; i < numero.length; i++) {
			if (numero[i]%2 != 0) {
				
				numeroOrdenado[j] = numero[i];
				j++;
				
			}else{}
			
		}
		System.out.println("");
		System.out.println("Array ordenado de Pares a Impares:");
		
		for ( j = 0; j < numeroOrdenado.length; j++) {
		
			System.out.print(numeroOrdenado[j]+" ");
		}
		
		
		
		
	}
}
