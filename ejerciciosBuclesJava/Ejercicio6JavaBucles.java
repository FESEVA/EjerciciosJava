import java.util.*;
/*
* Muestra los números del 320 al 160, contando de 20 en 20 hacia atrás utilizando
un bucle do-while.
*
* @author Fernando Iván Sevilla Valderrama
*/
public class Ejercicio6JavaBucles {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
    
    int num = 340;
		
		do {
      
      System.out.println(num-=20);
      
      } while (num > 160);
		
	}
}
