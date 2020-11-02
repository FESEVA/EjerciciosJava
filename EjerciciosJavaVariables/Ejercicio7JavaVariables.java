/*
* Escribe un programa que declare variables de tipo char y de tipo String . Intenta
mostrarlas por pantalla todas juntas en la misma línea y con una sola sentencia
de Java (con un solo println ) ¿es posible?
*
* @author Fernando Iván Sevilla Valderrama
*/
public class Ejercicio7JavaVariables {
	public static void main(String[] args) {
		
		char letra = 'a';
		String cadena = "Antonio";
		
		System.out.println("\033[33m Si es posible.\033[39;49m");
		
		System.out.println("¿Alguien sabe " +letra+ " donde fue "+cadena+"?");
		
	}
}
