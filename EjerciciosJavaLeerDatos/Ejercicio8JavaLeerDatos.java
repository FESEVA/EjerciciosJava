import java.util.Scanner;
/*
* Escribe un programa que calcule el salario semanal de un empleado en base a
las horas trabajadas, a razón de 12 euros la hora. (PRO)
*
* @author Fernando Iván Sevilla Valderrama
*/
public class Ejercicio8JavaLeerDatos {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Bienvenido al programa que calcula el salario semanal de las horas trabajadas.");
		
		System.out.print("¿Cuanto cobra la hora? : ");
		double euroHora = s.nextDouble();
		
		System.out.print("¿Cuantas horas trabajas a la semana? : ");
		double horaSemana = s.nextDouble();
		
		double salarioSemanal = ( euroHora * horaSemana );
		double salarioMensual = ((( horaSemana / 5 ) * 22) * euroHora );
		
		System.out.println("  ╔═══════════╦════════════════════════════╦══════════════════╦═════════════════════════╗");
		System.out.println("  ║ € / HORA  ║ Horas Semanales trabajadas ║ Salario Semanal  ║  Salario mensual Aprox. ║");
		System.out.println("  ╠═══════════╬════════════════════════════╬══════════════════╬═════════════════════════╣");
		System.out.printf("  ║ %5.2f €/h ║           %5.2f h          ║       %5.2f €   ║       %7.2f €         ║\n", +euroHora, +horaSemana, +salarioSemanal, +salarioMensual);
		System.out.println("  ╚═══════════╩════════════════════════════╩══════════════════╩═════════════════════════╝");
		
	}
}
