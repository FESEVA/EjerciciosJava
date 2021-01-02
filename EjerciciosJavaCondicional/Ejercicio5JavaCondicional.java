import java.util.Scanner;
/*
* Realiza un programa que resuelva una ecuación de primer grado (del tipo ax+b = 0).
*
* @author Fernando Iván Sevilla Valderrama
*/
public class Ejercicio5JavaCondicional {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Bienvenido al programa que resuelve ecuaciones de primer grado del tipo ax + b = 0");
   
    System.out.print("Introduzca el valor de a: ");
    double a = s.nextDouble();
    
    System.out.print("Introduzca el valor de b: ");
    double b = s.nextDouble();
    
    double resultado = (-b / a);
    
    if ( a != 0 ) {
      System.out.println("x = "+resultado);
		}			
    else {
      System.out.println("Error, no tiene solución real.");
    }
  }
}
