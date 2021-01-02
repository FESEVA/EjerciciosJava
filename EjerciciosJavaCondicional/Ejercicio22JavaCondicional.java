import java.util.*;
/*
* Realiza un programa que, dado un día de la semana (de lunes a viernes) y una
hora (horas y minutos), calcule cuántos minutos faltan para el fin de semana.
Se considerará que el fin de semana comienza el viernes a las 15:00h. Se da
por hecho que el usuario introducirá un día y hora correctos, anterior al viernes
a las 15:00h.
*
* @author Fernando Iván Sevilla Valderrama
*/
public class Ejercicio22JavaCondicional {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Bienvenido al programa que calcula cuantos minutos faltan para el fin de semana ( Viernes a las 15:00 H ). ");
		    
    System.out.print("Introduzca el dia (lunes a viernes): ");
    
    String dia = s.nextLine();
    
    System.out.print("Introduzca la hora (00 a 23): ");
    
    int hora = s.nextInt();
    
    System.out.print("Introduzca los minutos (0 a 59): ");
    
    int minuto = s.nextInt();
    
    int conversionMinuto = (hora * 60) + minuto;
    
    int minutosFinDeSemana;
    
    int minutosEnDia = 1440;
    
    switch(dia) {

    case "lunes":
      minutosFinDeSemana = 6660 - conversionMinuto;
      System.out.println("Quedan "+minutosFinDeSemana+ " minutos para el fin de semana.");
    break;
    
    case "martes":
      minutosFinDeSemana = (6660 - (minutosEnDia)) - conversionMinuto;
      System.out.println("Quedan "+minutosFinDeSemana+ " minutos para el fin de semana.");
    break;
    
    case "miercoles":
      minutosFinDeSemana = (6660 - (minutosEnDia*2)) - conversionMinuto;
      System.out.println("Quedan "+minutosFinDeSemana+ " minutos para el fin de semana.");
    break;
    
    case "jueves":
      minutosFinDeSemana = (6660 - (minutosEnDia*3)) - conversionMinuto;
      System.out.println("Quedan "+minutosFinDeSemana+ " minutos para el fin de semana.");
    break;
    
    case "viernes":
      minutosFinDeSemana = (6660 - (minutosEnDia*4)) - conversionMinuto;
      System.out.println("Quedan "+minutosFinDeSemana+ " minutos para el fin de semana.");
    break;

    default:
    minutosFinDeSemana = 6660 - conversionMinuto;
    System.out.println("Quedan "+minutosFinDeSemana+ " minutos para el fin de semana.");
    }
    
    
  } 
}
