import java.util.*;
/*
* Realiza un programa que nos diga cuántos dígitos tiene un número introducido
por teclado. Este ejercicio es equivalente a otro realizado anteriormente, con
la salvedad de que el anterior estaba limitado a números de 5 dígitos como
máximo. En esta ocasión, hay que realizar el ejercicio utilizando bucles; de
esta manera, la única limitación en el número de dígitos la establece el tipo de
dato que se utilice (int o long).

*
* @author Fernando Iván Sevilla Valderrama
*/
public class Ejercicio10JavaBucles {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Introduzca numeros positivos para calcular su media, para finalizar el programa deberá introducir un número negativo.");
    
    
    int contador = 1;
    int calculo;
    System.out.print("Introduzca el 1 número: ");
    int num = s.nextInt();
    int sumaNum = 0;
    if (num < 0){
      System.out.println("Programa finalizado con éxito.");
      }else{
      
      
      
    do {
      contador++;
      sumaNum += num;
      System.out.print("Introduzca el "+contador+" número: ");
      num = s.nextInt();
      
      
      
      }while(num >= 0);{
        
        int contadorFinal = (contador - 1);
        int media = sumaNum / contadorFinal;
        System.out.println("Ha introducido "+contadorFinal+" números y la media total de esos números es: "+media+".");
        }
      
    }
	}
}
