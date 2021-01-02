import java.util.Scanner;
/*
* Vamos a ampliar uno de los ejercicios de la relación anterior para considerar
las horas extras. Escribe un programa que calcule el salario semanal de un
trabajador teniendo en cuenta que las horas ordinarias (40 primeras horas de
trabajo) se pagan a 12 euros la hora. A partir de la hora 41, se pagan a 16 euros
la hora.
*
* @author Fernando Iván Sevilla Valderrama
*/
public class Ejercicio4JavaCondicional {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Bienvenido al programa que calcula el salario semanal de las horas trabajadas.");
		
		
		int euroHora = 12;
    int euroHoraPlus = 16;
		
		System.out.print("¿Cuantas horas trabajas a la semana? : ");
		int horaSemana = s.nextInt();
		
    
    if ( horaSemana <= 40 ) {
    
      int salarioSemanal = ( euroHora * horaSemana );
      int salarioMensual = (salarioSemanal * 4 );
      
    System.out.println("  ╔═══════════╦════════════════════════════╦══════════════════╦═════════════════════════╗");
		System.out.println("  ║ € / HORA  ║ Horas Semanales trabajadas ║ Salario Semanal  ║  Salario mensual Aprox. ║");
		System.out.println("  ╠═══════════╬════════════════════════════╬══════════════════╬═════════════════════════╣");
		System.out.printf("  ║  %2d €/h   ║           %2d h             ║       %3d €      ║        %4d €           ║\n", +euroHora, +horaSemana, +salarioSemanal, +salarioMensual);
		System.out.println("  ╚═══════════╩════════════════════════════╩══════════════════╩═════════════════════════╝");
    
    }
    
    else if ( horaSemana >= 41 ) {
      
      int horaSemanaPlus = ( horaSemana - 40);
      int salarioSemanalPlus = ( euroHoraPlus * (horaSemanaPlus) );
      int salarioSemanal = ( euroHora * 40 ) + salarioSemanalPlus;
      int salarioMensual = ( salarioSemanal * 4 );
    
    System.out.println("  ╔═══════════╦═════════════╦═══════════════════════════════════╦═════════════════════════════════════╦══════════════════╦═════════════════════════╗");
		System.out.println("  ║ € / HORA  ║ € /HORAPLUS ║     Horas Semanales trabajadas    ║  Horas Extras Semanales trabajadas  ║ Salario Semanal  ║  Salario mensual Aprox. ║");
		System.out.println("  ╠═══════════╬═════════════╬═══════════════════════════════════╬═════════════════════════════════════╬══════════════════╬═════════════════════════╣");
		System.out.printf("  ║  %2d €/h   ║   %2d €/h    ║               %2d h                ║                  %2d h               ║         %3d €    ║          %4d €         ║\n", +euroHora, +euroHoraPlus, +horaSemana, +horaSemanaPlus, +salarioSemanal, +salarioMensual);
		System.out.println("  ╚═══════════╩═════════════╩═══════════════════════════════════╩═════════════════════════════════════╩══════════════════╩═════════════════════════╝");
    
    }
  
   
  }
} 
			
	

