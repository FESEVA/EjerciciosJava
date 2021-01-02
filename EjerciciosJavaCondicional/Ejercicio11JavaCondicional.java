import java.util.*;
/*
* Escribe un programa que dada una hora determinada (horas y minutos), calcule los segundos que faltan para llegar a la medianoche.
*
* @author Fernando Iván Sevilla Valderrama
*/
public class Ejercicio11JavaCondicional {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Bienvenido al programa que dada una hora determinada (horas y minutos), calcule los segundos que faltan para llegar a la medianoche.");
   
    System.out.print("Introduzca la hora en formato 24h separadas por espacios (nueve menos cuarto: ejemplo 20 45) : ");
    int horas = s.nextInt();
    int minutos = s.nextInt();
    if (horas == 0 && minutos == 0){
    System.out.println("Ya es medianoche y faltan 86400 segundos para la siguiente media noche.");
    }else{
    
      if (horas >=0 && horas <=23 && minutos >=0 && minutos <= 59 ){
        int calHoras = 3600 * horas;
        int calMinutos = 60 * minutos;
        int calTotal = calHoras + calMinutos;
        int calDia = (3600 * 24) - calTotal; //Numero total de segundos en el día menos los segundos ya pasados .
        System.out.println("Faltan "+calDia+" segundos para medianoche.");
      }else{
        System.out.println("Error, hora no válida.");    
      }
    }
  } 
}
