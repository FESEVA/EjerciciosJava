import java.util.Scanner;
/*
* Realiza un programa que pida una hora por teclado y que muestre luego buenos
días, buenas tardes o buenas noches según la hora. Se utilizarán los tramos de
6 a 12, de 13 a 20 y de 21 a 5. respectivamente. Sólo se tienen en cuenta las
horas, los minutos no se deben introducir por teclado.
*
* @author Fernando Iván Sevilla Valderrama
*/
public class Ejercicio2JavaCondicional {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Introduzca una hora en formato 24h: ");
    
    int hora = s.nextInt();
    
    if ( hora >= 6 && hora <= 12 ) {
    System.out.println("Son las "+hora+". Buenos días.");
		}	
    else if ( hora >= 13 && hora <= 20) {
    System.out.println("Son las "+hora+". Buenas tardes.");
		}	
    else if ( hora >= 21 && hora <= 23 || hora >= 0 && hora <= 5) {
    System.out.println("Son las "+hora+". Buenas noches.");
		}	
    else {
    System.out.println("Error, introduzca una hora en formato 24h (0 a 23.)");
		}		
	}
}
