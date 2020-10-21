/*
* Escribe un programa en el que se declaren las variables enteras x e y. Asígnales
  los valores 144 y 999 respectivamente. A continuación, muestra por pantalla
  el valor de cada variable, la suma, la resta, la división y la multiplicación.
*
* @author Fernando Iván Sevilla Valderrama
*/
public class Ejercicio1JavaVariables {
	public static void main(String[] args) {
		
		int x = 144;
		System.out.println("La variable x tiene un valor de : " + x);
		int y = 999;
		System.out.println("La variable y tiene un valor de : " + y);
		
		int suma = x + y;
		System.out.println(" x + y = " + suma);
		int resta = x -y;
		System.out.println(" x - y = " + resta);
		int multiplicacion = x * y;
		System.out.println(" x * y = " + multiplicacion);
		double division = (double) x / (double) y; //Con el casting se pone "double" para resultado decimal con variables int.
		System.out.println(" x / y = " + division);
	}
}
