/**
 * 
 */
package ejerciciosNumerosAleatoriosJava;

import java.util.Scanner;

/**
 * @author FESEVA
 *
 */
public class Ejercicio17NumerosAleatoriosJava {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);

		int altura = 0;
		int anchura = 0;
		do {
			System.out.print("Por favor, introduzca la altura de la pecera (como mínimo 4): ");
			altura = s.nextInt();
			System.out.print("Ahora introduzca la anchura (como mínimo 4): ");
			anchura = s.nextInt();
			if(altura <= 3 || anchura <= 3) {
				System.out.println("Error, altura o anchura incorrecta.");
				System.out.println("-----------------------------------");
			}

		}while(altura <= 3 || anchura <= 3);

		int seguidorAltura = altura;
		int seguidorAnchura = anchura;
		int espacioInterior = ((seguidorAnchura *2) - 3) * (seguidorAltura -2);
		int contador = 0;
		int contadorAltura = 0;
		int contadorPez = 0;
		int pez = (int)(Math.random()*(espacioInterior)+1);
		//1 Line
		do{
			System.out.print("* ");
			contador++;
		}while(contador < seguidorAnchura);

		System.out.println("");
		//MID PECERA
		contador= 0;
		do {
			System.out.print("*");
			contador = 0;
			do{

				contadorPez++;

				if(contadorPez == pez) {
					System.out.print("&");

				}else{	
					System.out.print(" ");
				}
				contador++;

			}while(contador < (seguidorAnchura*2) -3);
			System.out.print("*");
			System.out.println("");
			contadorAltura++;
		}while(contadorAltura < seguidorAltura - 2);


		//2 Line
		contador = 0;
		do{
			System.out.print("* ");
			contador++;
		}while(contador < seguidorAnchura);
	}
}
