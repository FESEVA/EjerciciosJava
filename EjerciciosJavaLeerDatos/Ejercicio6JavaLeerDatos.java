import java.util.Scanner;
/*
* Escribe un programa que calcule el área de un triángulo.
*
* @author Fernando Iván Sevilla Valderrama
*/
public class Ejercicio6JavaLeerDatos{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
	
		System.out.println("Bienvenido al programa que calcula el área de un triángulo ▲ .");
	
		System.out.print("Introduzca la base en cm: ");
		double base = s.nextDouble();
	
		System.out.print("Introduzca la altura en cm: ");
		double altura = s.nextDouble();
	
		double area = ( base * altura )/2;
	
		System.out.println("El area del triángulo con " +base+ " cm de base y " +altura+ " cm de altura es de: " +area+ " cm.");
		
	}
}
