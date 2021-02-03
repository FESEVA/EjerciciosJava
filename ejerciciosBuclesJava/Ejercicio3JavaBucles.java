import java.util.*;
/*
* Muestra los numeros multiplos de 5 de 0 a 100 utilizando un bucle do-while.
*
* @author Fernando Iván Sevilla Valderrama
*/
public class Ejercicio3JavaBucles {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int calculo = 0;
    int num = 0;
     
		do {
      num++;
			calculo = 5 * num;
			System.out.println("El " +num+ " múltiplo de 5 es: "+calculo);
		} while ( calculo < 100);
		
		
	}
}
