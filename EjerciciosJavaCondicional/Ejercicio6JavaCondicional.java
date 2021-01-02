import java.util.Scanner;
/*
* Realiza un programa que calcule el tiempo que tardará en caer un objeto desde
una altura h. Aplica la fórmula t =√2h/g siendo g = 9.81m/s²
*
* @author Fernando Iván Sevilla Valderrama
*/
public class Ejercicio6JavaCondicional {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
    System.out.println("Bienvenido al programa que calcula el tiempo que tarda en caer un objeto desde una altura.");
    System.out.print("Introduce la altura en metros a la que desea dejar caer el objeto: ");
    double altura = s.nextInt();
    
    if ( altura >= 0 ){
      
      double tiempo = (Math.sqrt((2*altura)/9.81));
      
      System.out.println("El objeto tardará "+tiempo+" segundos en caer al suelo.");
		}
    else {
      System.out.println("Error, la altura no puede ser negativa.");
    }
	}
}
