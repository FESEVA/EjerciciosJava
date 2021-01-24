/**
 * 
 */
package ejerciciosNumerosAleatoriosJava;

import java.util.Scanner;

/**
 * @author FESEVA
 *
 */
public class Ejercicio19NumerosAleatoriosJava {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int contador = 0;
		
		int numRecogidoParAlto = 0;
		int numRecogidoImparBajo = 300;
		int numAleatorio = 0;
do {
	 numAleatorio = (int)((Math.random()*300) - 100);
			contador++;
			System.out.print(numAleatorio+" ");
			if (numAleatorio%2 == 0) {
					
				if (numAleatorio>numRecogidoParAlto) {
					
					numRecogidoParAlto = numAleatorio;
					
				}
				
			}else {
				
					if (numAleatorio<numRecogidoImparBajo) {
					
					numRecogidoImparBajo = numAleatorio;
					
				}
			}
			
		}while(contador < 50);

System.out.println("");
System.out.println("El número par mas alto genereado es el: "+numRecogidoParAlto);
System.out.println("El número impar mas bajo genereado es el: "+numRecogidoImparBajo);

		
	}

}
