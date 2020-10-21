/*
* Realiza un conversor de euros a pesetas. La cantidad en euros que se quiere
convertir deberá estar almacenada en una variable
*
* @author Fernando Iván Sevilla Valderrama
*/
public class Ejercicio4JavaVariables {
	public static void main(String[] args) {
		// 1 euros = 166.386 psts
		int euros = 1999;
		double calculo = (double) euros * 166.386; 
		System.out.println("" + euros + " euros son: " + calculo + " pesetas.");
	}
}
