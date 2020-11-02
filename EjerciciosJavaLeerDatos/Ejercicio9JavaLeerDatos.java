import java.util.Scanner;
/*
* Escribe un programa que calcule el volumen de un cono según la fórmula 
	 1
V= - 2 h
	 3
*
* @author Fernando Iván Sevilla Valderrama
*/
public class Ejercicio9JavaLeerDatos {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Bienvenido al programa que calcula el volumen de un cono.");
		System.out.print("Introduzca la altura del cono en cm: ");
		double altura = s.nextDouble();
		System.out.print("Introduzca el radio de la base del cono en cm: ");
		double radio = s.nextDouble();
		
		double volumen = ( Math.PI * (Math.pow(radio,2)) * altura )/3;
		
		System.out.print("El volumen del cono es de: " + volumen + " cm³.");
		
	}
}
