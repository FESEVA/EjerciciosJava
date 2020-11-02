import java.util.Scanner;
/*
* Realiza un conversor de Kb a Mb
*
* @author Fernando Iván Sevilla Valderrama
*/
public class Ejercicio11JavaLeerDatos {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Bienvenido al conversor de Kb a Mb.");
		System.out.print("Introduzca la cantidad de Kb que desee convertir a Mb: ");
		double kb = s.nextDouble();
		
		double mb = (kb / 1024);
		
		System.out.print(+kb+ " KiloBytes son " +mb+ " Megabytes.");
		
	}
}
