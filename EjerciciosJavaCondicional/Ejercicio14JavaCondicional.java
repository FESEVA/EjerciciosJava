import java.util.*;
/*
* Realiza un programa que diga si un número introducido por teclado es par y/o divisible entre 5.
*
* @author Fernando Iván Sevilla Valderrama
*/
public class Ejercicio14JavaCondicional {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Bienvenido al programa que dice si un número introducido por teclado es par y/o divisible entre 5.");
		System.out.println("Introduzca un número: ");
	
    int num1 = s.nextInt();
    
    if(num1 > 0){
    
    if(num1 % 2 == 0){
      
      	System.out.print("El "+num1+" es par");
      	      }else{
        System.out.print("El "+num1+" no es par");

        }
    if(num1 % 5 == 0){
      
        	System.out.print(" y es divisible entre 5.");
        	
      }else{
        System.out.print(" y no es divisible entre 5.");
        }
    }else{
       System.out.println("Error, introduzca un número positivo.");
      
      }
    
  } 
}
