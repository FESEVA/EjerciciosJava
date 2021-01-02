import java.util.Scanner;
/*
* Realiza un programa que calcule la media de tres notas.
*
* @author Fernando Iván Sevilla Valderrama
*/
public class Ejercicio7JavaCondicional {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
    System.out.println("Bienvenido al programa que calcula la nota media de 3 notas introducidas.");
    System.out.print("Introduzca la primera nota: ");
    double n1 = s.nextDouble(); 
    System.out.print("Introduzca la segunda nota: ");
    double n2 = s.nextDouble(); 
    System.out.print("Introduzca la tercera nota: ");
    double n3 = s.nextDouble(); 
    
    if (n1 < 0 || n1 > 10 || n2 < 0 || n2 > 10 || n3 < 0 || n3 > 10 ) {
      System.out.print("Error, introduzca una nota entre 0 y 10.");
		}			
    else  {
      
      double resultado = ( n1 + n2 + n3 )/3;
      
      System.out.print("La media de "+n1+", "+n2+" y "+n3+" es: "+resultado);
      
    }
	}
}
