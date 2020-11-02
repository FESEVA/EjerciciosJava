import java.util.Scanner;

/*
* Escribe un programa que sume, reste, multiplique y divida dos números
introducidos por teclado. Ya utilizando la utilidad "Scanner" para compatibilidad y uso de decimales.
*
* @author Fernando Iván Sevilla Valderrama
*/
public class Ejercicio4JavaLeerDatos {
	public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	
		System.out.println("Bienvenidos al programa que suma, resta, multiplica y divide dos números introducidos por el usuario.");
		
		System.out.print("Introduzca el primer número: ");
		double num1 = s.nextDouble();
		
		System.out.print("Introduzca el segundo número: ");
		double num2 = s.nextDouble();
		
		double suma = ( num1 + num2 );
		double resta = ( num1 - num2 );
		double multiplicacion = ( num1 * num2 );
		double division = ( num1 / num2 );
		
		System.out.println("");
		System.out.println("	·El resultado de la suma de: " +num1+ " y " +num2+ " es: " +suma);
		System.out.println("	·El resultado de la resta de: " +num1+ " y " +num2+ " es: " +resta);
		System.out.println("	·El resultado de la multiplicación de: " +num1+ " y " +num2+ " es: " +multiplicacion);
		System.out.println("	·El resultado de la división de: " +num1+ " y " +num2+ " es: " +division);
	}
}
