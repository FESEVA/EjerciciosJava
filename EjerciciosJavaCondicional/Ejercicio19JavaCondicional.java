import java.util.*;
/*
* Realiza un programa que nos diga cuántos dígitos tiene un número entero que
puede ser positivo o negativo. Se permiten números de hasta 5 dígitos.
*
* @author Fernando Iván Sevilla Valderrama
*/
public class Ejercicio19JavaCondicional {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Bienvenido al programa que dice cuantos dígitos tiene un número ya sea positivo o negativo.");
		System.out.println("Introduzca un número: ");
		
    int num1 = s.nextInt();
    int num2 = 0;
    
    if(num1 > -100000 && num1 < 100000 ){
      if(num1 >= 0 && num1 < 10 || num1 <= 0 && num1 > -10){
      num2 = 1;
      }else if(num1 >= 10 && num1 < 100 || num1 <= -10 && num1 > -100){
        num2 = 2;
        }else if (num1 >= 100 && num1 < 1000 || num1 <= -100 && num1 > -1000){
          num2 = 3;
          }else if(num1 >= 1000 && num1 < 10000 || num1 <= -1000 && num1 > -10000){
            num2 = 4;
            }else if(num1 >= 10000 && num1 < 100000 || num1 <= -10000 && num1 > -100000){
              num2 = 5;
              }
              
              if (num2 == 1){
                  System.out.println("El número: "+num1+ " tiene "+num2+" cifra.");
                }else{
                   System.out.println("El número: "+num1+ " tiene "+num2+" cifras.");
                }
                    }else{
        System.out.println("Error, el número no puede superar las 5 cifras.");
        }
    
   
	
   
  } 
}
