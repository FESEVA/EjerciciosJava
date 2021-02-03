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
public class Ejercicio17ArraysJava {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);

		int [] numeroAleatorio = new int [10];
		int [] arrayFinal = new int [10];
		int [] arrayFinal2 = new int [10];
		int numeroElegido = 0;
		boolean check = false; 

		for (int i = 0; i < 10; i++) {
		    arrayFinal2[i] = -1;
		}
		
		//GENERA ARRAY ALEATORIO
		for (int i = 0; i < numeroAleatorio.length; i++) {
			numeroAleatorio[i] = (int)(Math.random()*101);
			System.out.print(numeroAleatorio[i]+" ");
		} 
		System.out.println("");
		System.out.println("");

		//Comprueba si el numero introducido esta en el array
		for (int i = 0; check == false; i++) {
			System.out.print("Introduzca un número de los 10 generados: ");
			numeroElegido = s.nextInt();	

			for (int j = 0; j < numeroAleatorio.length; j++) {
				if (numeroAleatorio[j] == numeroElegido ) {
					check = true;
				}
			}
			if(check == false) {
				System.out.println("");
				System.out.println("Error, ese número no se encuentra dentro de los números generados. Vuelva a intentarlo.");
				System.out.println("");
			}			
		}

		//GENERA NUEVO ARRAY ORDENADO
		System.out.println("");
		System.out.println("El nuevo Array es el siguiente: ");

		//SI COINCIDE QUE EL NUMERO ELEGIDO ESTA YA EN LA POSICION 0 SE MUESTRA EL MISMO ARRAY ALEATORIO GENEREADO
		if (numeroAleatorio[0] == numeroElegido) {
			for (int i = 0; i < numeroAleatorio.length; i++) {
				System.out.print(numeroAleatorio[i]+" ");

			}
		}else {

			//SE ALACENA EL ARRAY ALEATORIO EN arrayFinal para hacer el bucle.
			int j = 1;
			check = false;

			for (int i = 0; i < arrayFinal.length; i++) {

				if (i == 0) {
					arrayFinal[0] = numeroAleatorio[numeroAleatorio.length -1];

					if(arrayFinal[0] == numeroElegido) {
						check = true;
					}

				}else {

					for ( i = 0; i < arrayFinal.length -1; i++) {

						arrayFinal[j] = numeroAleatorio[i];

						j++;
						if(i == 10 ){
							arrayFinal[0] = numeroAleatorio[i];
						}

					}

				}
			}

			// segundo paso

			j = 1;



			int h = 0;

			//Si al generar el arrayFinal y rotandolo una vez coincide que la posicion 0 es la del numeroElegido entonces se muestra ese arrayFinal
			if (arrayFinal[0] == numeroElegido) {
				for (int i = 0; i < arrayFinal.length; i++) {

					System.out.print(arrayFinal[i]+" ");
				}
			}else {
				//Si no entonces empieza el bucle rotando un paso a la derecha hasta que el numero elegido este en la posición 0.

				while(arrayFinal2[0] != numeroElegido) {
					j = 1;
					arrayFinal2[0] = arrayFinal[arrayFinal.length-1];
					for (int i = 0; i < arrayFinal.length-1; i++) {
						arrayFinal2[j] = arrayFinal[i];
						j++;
					}
					j = 1;

					for (int i = 0; i < arrayFinal2.length; i++) {
						arrayFinal[i] = arrayFinal2[i];	
					}
				}




				for (int i = 0; i < arrayFinal2.length; i++) {

					System.out.print(arrayFinal2[i]+" ");
				}

			}

		}

	}
}
