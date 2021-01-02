import java.util.*;
/*
* Escribe un programa que diga cuál es la primera cifra de un número entero
introducido por teclado. Se permiten números de hasta 5 cifras.
*
* @author Fernando Iván Sevilla Valderrama
*/
public class Ejercicio18JavaCondicional {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Bienvenido al programa que muestra la primera cifra de cualquier número introducido.");
		System.out.println("Introduzca un número: ");
    
    int num1 = s.nextInt();
    int num2 = 0;
    
    if(num1 >= 0 && num1 < 100000){
      if(num1 >= 0 && num1 < 10){
      num2 = num1;
      }else if(num1 >= 10 && num1 < 100){
        num2 = num1 / 10;
        }else if (num1 >= 100 && num1 < 1000){
          num2 = num1 / 100;
          }else if(num1 >= 1000 && num1 < 10000){
            num2 = num1 / 1000;
            }else if(num1 >= 10000 && num1 < 100000){
              num2 = num1 / 10000;
              }
              System.out.println("La primera cifra de "+num1+ " es: "+num2);
    }else if(num1 < 0) {
      System.out.println("Error, el número no puede ser negativo.");
      }else{
        System.out.println("Error, el número no puede superar las 5 cifras.");
        }
        
    
		
	
  } 
}
