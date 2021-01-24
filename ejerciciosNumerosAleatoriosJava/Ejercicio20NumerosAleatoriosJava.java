/**
 * 
 */
package ejerciciosNumerosAleatoriosJava;
import java.util.Scanner;
/**
 * @author FESEVA
 *
 */
public class Ejercicio20NumerosAleatoriosJava {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		System.out.print("Por favor, indique la capacidad de la cuba en litros: ");
		int capacidadCuba = s.nextInt();
		int litrosCuba = (int)(Math.random()*(capacidadCuba + 1));
		int contadorEspacioInterno = 0;
		int contadorAltura = 0;
		int seguidorCapacidadCuba = capacidadCuba;
		int contadorPintaLitros = 0;
		int contador = 0;
		System.out.println("");
		//Variable Cuba
		
			//Espacio sin agua
		
		if((seguidorCapacidadCuba-litrosCuba) == 0) {
		}else {
	
			do {
				System.out.print("*");
				contadorEspacioInterno++;
				do {
					System.out.print(" ");
					contador++;
				}while (contador < 4);
				contador = 0;
				
				
				System.out.println("*");
			}while(contadorEspacioInterno < (seguidorCapacidadCuba-litrosCuba));
			contadorEspacioInterno = 0;
		}
				//Agua
			
			if(litrosCuba == 0) {
			}else {
			
			do {
				System.out.print("*");
				contadorPintaLitros++;
				do {
					System.out.print("=");
					contador++;
				}while (contador <4);
				contador = 0;
				
				
				System.out.println("*");
				
			}while(contadorPintaLitros < litrosCuba);
			}
			contadorPintaLitros = 0;
			System.out.println("******");
			System.out.println("La cuba tiene una capacidad de "+capacidadCuba+" litros y contiene "+litrosCuba+" litros de agua.");
	}
}
