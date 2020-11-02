import java.util.Scanner;
/*
* Realiza un programa que calcule la nota que hace falta sacar en el segundo
examen de la asignatura Programación para obtener la media deseada. Hay
que tener en cuenta que la nota del primer examen cuenta el 40% y la del
segundo examen un 60%.
*
* @author Fernando Iván Sevilla Valderrama
*/
public class Ejercicio12JavaLeerDatos {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("\033[33m Bienvenido al programa que calcula la nota que se tiene que sacar en el segundo examen para alcanzar el objetivo de la nota del trimestre propuesta, teniendo encuenta que la nota del primer examen vale un 40 % y la del segundo un 60%.\033[39;49m");
		System.out.println("");
		
		System.out.println("Introduzca la nota del primer examen: ");	
		double n1 = s.nextDouble();
		
		System.out.println("Introduzca la nota que quiere sacar en el trimestre: ");	
		double notaTrimestre = s.nextDouble();
		
		double n2 = (notaTrimestre - (0.4 * n1)) / 0.6;
		
		System.out.println("Para sacar un "+notaTrimestre+" en el trimestre, tendría que sacar un "+n2+" en el segundo examen.");	
		
		
		
	}
}
