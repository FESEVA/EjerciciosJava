/**
 * 
 */
package ejerciciosNumerosAleatoriosJava;

import java.util.Scanner;

/**
 * @author FESEVA
 *
 */
public class Ejercicio21NumerosAleatoriosJava {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		int caraCruz1 = (int)(Math.random()*2);
		int caraCruz2 = (int)(Math.random()*2);
		int caraCruz3 = (int)(Math.random()*2);
		int caraCruz4 = (int)(Math.random()*2);
		int caraCruz5 = (int)(Math.random()*2);
		
		String resultado = "";
		
		
		if(caraCruz1 == 0){
			resultado = " - cara";
			System.out.println("2 centimos"+resultado);
		}else {
			resultado = " - cruz";
			System.out.println("2 centimos"+resultado);
		}
		if(caraCruz2 == 0){
			resultado = " - cara";
			System.out.println("20 centimos"+resultado);
		}else {
			resultado = " - cruz";
			System.out.println("20 centimos"+resultado);
		}
		if(caraCruz3 == 0){
			resultado = " - cara";
			System.out.println("50 centimos"+resultado);
		}else {
			resultado = " - cruz";
			System.out.println("50 centimos"+resultado);
		}
		if(caraCruz4 == 0){
			resultado = " - cara";
			System.out.println("1 euro"+resultado);
		}else {
			resultado = " - cruz";
			System.out.println("1 euro"+resultado);
		}
		if(caraCruz5 == 0){
			resultado = " - cara";
			System.out.println("2 euros"+resultado);
		}else {
			resultado = " - cruz";
			System.out.println("2 euros"+resultado);
		}		
		
	}

}
