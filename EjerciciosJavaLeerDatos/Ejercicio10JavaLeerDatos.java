import java.util.Scanner;
/*
* Realiza un conversor de Mb a Kb
*
* @author Fernando Iván Sevilla Valderrama
*/
public class Ejercicio10JavaLeerDatos {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Bienvenido al conversor de Mb a Kb.");
		System.out.print("Introduzca la cantidad de Mb que desee convertir a Kb: ");
		double mb = s.nextDouble();
		
		double kb = (mb * 1024);
		
		System.out.print(+mb+ " MegaBytes son " +kb+ " Kilobytes.");
		
	}
}
