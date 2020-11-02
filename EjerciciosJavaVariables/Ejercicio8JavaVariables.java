/*
* Escribe un programa que declare variables de tipo char y de tipo String . Intenta
mostrarlas por pantalla todas juntas en la misma línea y con una sola sentencia
de Java (con un solo println ) ¿es posible?
*
* @author Fernando Iván Sevilla Valderrama
*/
public class Ejercicio8JavaVariables {
	public static void main(String[] args) {
		
		char letra1 = 't';
		char letra2 = 'a';
		char letra3 = 'r';
		char letra4 = 'd';
		char letra5 = 'e';
		
		String cadena = "tarde";
		
		System.out.println("\033[33m Si es posible.\033[39;49m");
		
		System.out.println(""+letra1+""+letra2+""+letra3+""+letra4+""+letra5+" ¡Ve antes de que sea "+cadena+"!");
		
	}
}
