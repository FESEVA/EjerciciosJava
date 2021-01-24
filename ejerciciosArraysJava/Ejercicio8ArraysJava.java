/**
 * 
 */
package ejerciciosArraysJava;

import java.util.Scanner;

/**
 * @author FESEVA
 *
 */
public class Ejercicio8ArraysJava {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);

		String [] mes = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre", };
		
		double [] temperatura = new double [mes.length];
		
		
		for (int i = 0; i < mes.length; i++) {
			System.out.print("Introduzca la temperatura media que ha hecho en "+mes[i]+": ");
			temperatura[i] = s.nextDouble();
		}
		
		// Hacer que cuando el decimal sea mayor o igual que 5 se redondee y si no que se trunque
		
		for (int i = 0; i < mes.length; i++) {
			if((temperatura[i]*100)%100 >= 50) {
				
				temperatura[i] = (int)temperatura[i] + 1;
			}else {
				temperatura[i] = (int)temperatura[i];
			}
		}
		//Gráfico
		System.out.println("");
		System.out.println("-- GRAFICO DE BARRAS DE TEMPERATURA MEDIA DE LOS MESES DE 2020 --");
		System.out.println("");
		for (int i = 0; i < mes.length; i++) {
			System.out.printf("%10s|",mes[i]);
			for (int j = 0; j < (int)temperatura[i]; j++) {
				System.out.print("-");
				
			}
			System.out.println("");
		}
		System.out.printf("%10s________________________________________________________\n","");
		System.out.printf("%10s0    5    1    1    2    2    3    3    4    4    5    5\n","");
		System.out.printf("%10s          0    5    0    5    0    5    0    5    0    5\n","");
		System.out.printf("%10sC    C    C    C    C    C    C    C    C    C    C    C\n","");
		System.out.printf("%10sº    º    º    º    º    º    º    º    º    º    º    º\n","");
	}
}
