import java.util.Scanner;
/*
* Escribe un programa que pida por teclado un día de la semana y que diga qué
asignatura toca a primera hora ese día.
*
* @author Fernando Iván Sevilla Valderrama
*/
public class Ejercicio1JavaCondicional {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Bienvenido al programa que muestra la primera asignatura según el día elegido.");
		System.out.println("Escriba un día ( ejemplo: Lunes) :");
		String dia = s.nextLine();
		
		if ( "Lunes".equals(dia)) {
			System.out.println("El "+dia+" a primera hora tenenemos Entornos de Desarrollo.");
		
		}else if ( "Martes".equals(dia)) {
			System.out.println("El "+dia+" a primera hora tenenemos Programación.");
			
		}else if ( "Miércoles".equals(dia) || "Miercoles".equals(dia) ) {
			System.out.println("El "+dia+" a primera hora tenenemos Programación.");
			
		}else if ( "Jueves".equals(dia)) {
			System.out.println("El "+dia+" a primera hora tenenemos Programación.");
			
		}else if ( "Viernes".equals(dia)) {
			System.out.println("El "+dia+" a primera hora tenenemos Formación y Orientación Laboral.");
			
		} else {
			System.out.println("No has introducido un día válido, por favor introduzca dias de Lunes a Viernes.");
		}			
	}
}
