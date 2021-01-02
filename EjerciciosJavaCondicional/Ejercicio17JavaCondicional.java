import java.util.*;
/*
* Escribe un programa que diga cuál es la última cifra de un número entero
introducido por teclado.
*
* @author Fernando Iván Sevilla Valderrama
*/
public class Ejercicio17JavaCondicional {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Bienvenido al programa que muestra la última cifra de un número introducido.");
		System.out.println("Introduzca un número: ");
    
    int num1 = s.nextInt();
    int num2 = (num1 / 10) * 10;
    int num3 = (num1 - num2);
      
    
    System.out.println("La ultima cifra de ese número es el: "+num3);
   
  } 
}
