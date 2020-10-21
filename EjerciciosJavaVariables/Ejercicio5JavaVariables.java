/*
* Realiza un conversor de pesetas a euros. La cantidad en pesetas que se quiere
convertir deberá estar almacenada en una variable
*
* @author Fernando Iván Sevilla Valderrama
*/
public class Ejercicio5JavaVariables {
	public static void main(String[] args) {
		// 1 euros = 166.386 psts
		double pesetas = 332605.614;
		double calculo = pesetas / 166.386; 
		System.out.println("" + pesetas + " pesetas son: " + calculo + " euros.");
	}
}
