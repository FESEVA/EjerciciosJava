import java.util.*;
/*
* Muestra los numeros multiplos de 5 de 0 a 100 utilizando un bucle for.
*
* @author Fernando Iván Sevilla Valderrama
*/
public class Ejercicio1JavaBucles {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int calculo = 0;
    
		for (int num = 1; calculo < 100; num++) {
			calculo = 5 * num;
			System.out.println("El " +num+ " múltiplo de 5 es: "+calculo);
		}
		
		
	}
}
