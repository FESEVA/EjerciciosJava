/**
 * 
 */
package ejerciciosArraysJava;

import java.util.Scanner;

/**
 * @author FESEVA
 *
 */
public class Ejercicio15ArraysJava {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);

		int [] mesa = new int [10];


		// CUADRO INICIAL MESA ALEATORIO 


		System.out.printf("┌─────────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┐\n"); 
		System.out.print("│Mesa nº  │"); 
		for (int i = 1; i < mesa.length+1; i++) {

			System.out.printf("  %-3d│",i); 
		}
		System.out.println("");
		System.out.println("├─────────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┤");
		System.out.print("│Ocupación│");
		for (int i = 0; i < mesa.length; i++) {
			mesa[i] = (int)(Math.random()*5);
			System.out.printf("  %-3d│",mesa[i]); 
		}
		System.out.println("");
		System.out.println("└─────────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┘");

		//COMPROBADOR DE OCUPANTES

		int ocupante = 0;
		boolean validator = false;
		do {
			System.out.print("¿Cuántos son? (Introduzca -1 para salir del programa): ");
			ocupante = s.nextInt();

			if(ocupante > 4 || ocupante == 0 || ocupante < -1) {
				System.out.println("");
				System.out.println("Lo siento, no admitimos grupos de "+ocupante+", haga grupos de 1 persona como mínimo o  de 4 personas como máximo e intente de nuevo");
				System.out.println("");
			}else if (ocupante == -1) {
				System.out.println("Gracias. Hasta pronto.");
				System.exit(0);
			}
			//SELECTOR DE OCUPANTES

			switch (ocupante) {
			case 1:
				validator = false;
				for (int i = 0; validator == false && i < mesa.length; i++) {
					if (mesa[i] == 0 ) {
						mesa[i] = mesa[i]+ocupante;
						System.out.println("Por favor, siéntense en la mesa número "+(i+1)+".");
						validator = true;
					}

				}

				for (int i = 0; validator == false && i < mesa.length; i++) {
					if(mesa[i] == 1 || mesa[i] == 2 || mesa[i] == 3) {
						mesa[i] = mesa[i]+ocupante;
						System.out.println("Tendrán que compartir mesa. Por favor, siéntense en la mesa número "+(i+1)+".");
						validator = true;
					}


				}
				for (int i = 0; validator == false && i < mesa.length; i++) {
					if(mesa[i] == 4 ) {
						System.out.println("Lo siento, en estos momentos no queda sitio.");
						validator = true;
					}


				}
				validator = false;	
				break;
			case 2:
				validator = false;
				for (int i = 0; validator == false && i < mesa.length; i++) {
					if (mesa[i] == 0 ) {
						mesa[i] = mesa[i]+ocupante;
						System.out.println("Por favor, siéntense en la mesa número "+(i+1)+".");
						validator = true;
					}

				}

				for (int i = 0; validator == false && i < mesa.length; i++) {
					if(mesa[i] == 1 || mesa[i] == 2 ) {
						mesa[i] = mesa[i]+ocupante;
						System.out.println("Tendrán que compartir mesa. Por favor, siéntense en la mesa número "+(i+1)+".");
						validator = true;
					}


				}
				for (int i = 0; validator == false && i < mesa.length; i++) {
					if(mesa[i] == 3|| mesa[i] == 4 ) {
						System.out.println("Lo siento, en estos momentos no queda sitio.");
						validator = true;
					}


				}
				validator = false;	
				break;
			case 3:
				validator = false;
				for (int i = 0; validator == false && i < mesa.length; i++) {
					if (mesa[i] == 0 ) {
						mesa[i] = mesa[i]+ocupante;
						System.out.println("Por favor, siéntense en la mesa número "+(i+1)+".");
						validator = true;
					}

				}

				for (int i = 0; validator == false && i < mesa.length; i++) {
					if(mesa[i] == 1 ) {
						mesa[i] = mesa[i]+ocupante;
						System.out.println("Tendrán que compartir mesa. Por favor, siéntense en la mesa número "+(i+1)+".");
						validator = true;
					}


				}
				for (int i = 0; validator == false && i < mesa.length; i++) {
					if(mesa[i] == 2 || mesa[i] == 3|| mesa[i] == 4 ) {
						System.out.println("Lo siento, en estos momentos no queda sitio.");
						validator = true;
					}


				}
				validator = false;
				break;
			case 4:
				validator = false;
				for (int i = 0; validator == false && i < mesa.length; i++) {
					if (mesa[i] == 0 ) {
						mesa[i] = mesa[i]+ocupante;
						System.out.println("Por favor, siéntense en la mesa número "+(i+1)+".");
						validator = true;
					}

				}

				for (int i = 0; validator == false && i < mesa.length; i++) {
					if(mesa[i] == 1 || mesa[i] == 2 || mesa[i] == 3|| mesa[i] == 4 ) {
						System.out.println("Lo siento, en estos momentos no queda sitio.");
						validator = true;
					}


				}
				validator = false;
				break;

			default:
				break;
			}
			//CUADRO FINAL MESAS Y OCUPANTES

			System.out.printf("┌─────────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┐\n"); 
			System.out.print("│Mesa nº  │"); 
			for (int i = 1; i < mesa.length+1; i++) {

				System.out.printf("  %-3d│",i); 
			}
			System.out.println("");
			System.out.println("├─────────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┤");
			System.out.print("│Ocupación│");
			for (int i = 0; i < mesa.length; i++) {

				System.out.printf("  %-3d│",mesa[i]); 
			}
			System.out.println("");
			System.out.println("└─────────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┘");

		}while(ocupante != -1);

	}
}
