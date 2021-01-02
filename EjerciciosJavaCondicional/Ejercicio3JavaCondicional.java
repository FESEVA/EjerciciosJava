import java.util.Scanner;
/*
* Escribe un programa en que dado un número del 1 a 7 escriba el correspondiente nombre del día de la semana.
*
* @author Fernando Iván Sevilla Valderrama
*/
public class Ejercicio3JavaCondicional {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Escribe un número del 1 al 7 para mostrar el día semanal correspondiente: ");
    
    int dia = s.nextInt();
    
    switch (dia) {
      case 1:
      System.out.println("El número "+dia+" corresponde con el Lunes.");
      break;
      
      case 2:
      System.out.println("El número "+dia+" corresponde con el Martes.");
      break;
      
      case 3:
      System.out.println("El número "+dia+" corresponde con el Miércoles.");
      break;
      
      case 4:
      System.out.println("El número "+dia+" corresponde con el Jueves.");
      break;
      
      case 5:
      System.out.println("El número "+dia+" corresponde con el Viernes.");
      break;
      
      case 6:
      System.out.println("El número "+dia+" corresponde con el Sábado.");
      break;
      
      case 7:
      System.out.println("El número "+dia+" corresponde con el Domingo.");
      break;
      
      default:
      System.out.println("El número "+dia+" no corresponde con ningún día semanal.");
   } 
	}
}
