/**
 * 
 */
package ejerciciosBuclesJava;

import java.util.Scanner;

/**
 * @author FESEVA
 *
 *
 */
public class Ejercicio11BuclesJava {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner s = new Scanner(System.in);
		
		System.out.print("Introduzca un número: ");
		int num = s.nextInt();		
		int contador = 0;
		int seguidorNumero = num;
		int numeroInverso = 0;
		
		//Inversion doble
		
		do {
			contador++;
			int cifra = (int)seguidorNumero%10;
			
			
			seguidorNumero = seguidorNumero/10;
			numeroInverso = (numeroInverso * 10) + cifra;
			
		}while(seguidorNumero > 0);
		
		
		
		if(contador%2 != 0) {
			
			System.out.println("Lo siento. El número introducido tiene longitud impar, no se puede partir en trocitos.");
		}else {
			System.out.println("Los trocitos del número son los siguientes: ");
			
			int cifraCorrecta = 0;
			int parCorrecto = 0;
			int otraVariable = 0;
			do {
				
				int cifra = (int)numeroInverso%100;
				
				
				numeroInverso = numeroInverso/100;
				
				cifraCorrecta = cifra;
				
				//Invertision doble del par obtenido
				
				do {
					parCorrecto = (int)cifraCorrecta%10;
					cifraCorrecta = cifraCorrecta/10;
					
					parCorrecto = (otraVariable * 10)+cifraCorrecta;
					
					otraVariable = parCorrecto;
//						if (cifraCorrecta == 0) {
//							
//						}else {
//							System.out.println(parCorrecto);
//						}
					
					System.out.println(parCorrecto);
				}while(cifraCorrecta > 0);
				
				
				
				
				
				
				
				
				
				
				
			}while(numeroInverso > 0);
			
			
			
		}
		
		
		
		
		
		
		
	}
}
