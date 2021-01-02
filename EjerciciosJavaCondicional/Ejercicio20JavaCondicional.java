import java.util.*;
/*
* Realiza un programa que diga si un número entero positivo introducido por
teclado es capicúa. Se permiten números de hasta 5 cifras.
*
* @author Fernando Iván Sevilla Valderrama
*/
public class Ejercicio20JavaCondicional {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Bienvenido al programa que dice si un número positivo de 5 cifras introducido por teclado es capicúo.");
		System.out.println("Introduzca un número: ");
		
	
    int num1 = s.nextInt();
    int total = 0;
    int num3 = 0;
    int num3p = 0;
    int num4 = 0;
    int num5 = 0;
    boolean capicuo = false;
    
    if (num1 >= 0 && num1 < 100000){
    
    
    if(num1 >= 0 && num1 < 10){
      capicuo = true;
      }else if(num1 >= 10 && num1 < 100){
        total = 10;
        num3 = num1 / total;
        num4 = num3 * total;
        num5 = num1 - num4;
          if (num3 == num5){
            capicuo = true;
            }
        }else if (num1 >= 100 && num1 < 1000){
          total = 100;
          num3 = num1 / total;
          num3p = num1 / 10;
          num4 = num3p * 10;
          num5 = num1 - num4;
          if (num3 == num5){
            capicuo = true;
            }
          }else if(num1 >= 1000 && num1 < 10000){
            total = 1000;
            num3 = num1 / total;
            int cifra2 =  (num1 / 100 ) - (num3 * 10);
            int cifra3 = (num1 / 10 ) - ((num1 / 100) * 10);
            int cifra4 = num1 - ((num1 /10) * 10); 
            
              if (num3 == cifra4 && cifra2 == cifra3){
              capicuo = true;
              }
            }else if(num1 >= 10000 && num1 < 100000){
              total = 10000;
              int cifra1 = num1 / total;
              int cifra2 =  (num1 / 1000) - (cifra1 * 10);
              int cifra3 =  (num1 / 100) - (num1 / 1000) * 10;
              int cifra4 =  (num1 / 10) - (num1 / 100) * 10;
              int cifra5 =  (num1) - (num1 / 10) * 10;
                if (cifra1 == cifra5 && cifra2 == cifra4){
                  capicuo = true;
                }
              }
              
              if (capicuo == true){
                System.out.println("El número "+num1+ " es capicúo.");
                }else {
                  System.out.println("El número "+num1+ " no es capicúo.");
                  }
      }else{
        System.out.println("Error, el numero tiene que ser positivo y con un máximo de 5 cifras.");
        }
  } 
}
