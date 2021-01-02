import java.util.Scanner;
/*
* Escribe un programa que nos diga el horóscopo a partir del día y el mes de nacimiento.
*
* @author Fernando Iván Sevilla Valderrama
*/
public class Ejercicio10JavaCondicional {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Bienvenido al programa que muestra el horóscopo según el nacimiento. ");
    System.out.print("Introduzca el día de nacimiento del 1 al 31 : ");
      int dia = s.nextInt();
    System.out.print("Introduzca el mes de nacimiento del 1 al 12 : ");
      int mes = s.nextInt();
      
      String nomMes;
      
      
    if  (dia >= 1 && dia <= 31){
      
    switch (mes) {
      
      case 1:
      
      nomMes = "Enero";
      if (dia >= 1 && dia <= 20){
        System.out.print("El día "+dia+" del mes de "+nomMes+" corresponde con: Capricornio.");
      }else if (dia >= 21 && dia <=31){
        System.out.print("El día "+dia+" del mes de "+nomMes+" corresponde con: Acuario.");
      }
      break;
      
      case 2:
      
      nomMes = "Febrero";
      if (dia >= 1 && dia <= 19){
        System.out.print("El día "+dia+" del mes de "+nomMes+" corresponde con: Acuario.");
      }else if (dia >= 20 && dia <=29){
        System.out.print("El día "+dia+" del mes de "+nomMes+" corresponde con: Piscis.");
      }else {
        System.out.println("Error, el mes de Febrero solo tiene como máximo 29 días.");
        }
      break;
      
      case 3:
      
      nomMes = "Marzo";
      if (dia >= 1 && dia <= 20){
        System.out.print("El día "+dia+" del mes de "+nomMes+" corresponde con: Piscis.");
      }else if (dia >= 21 && dia <=31){
        System.out.print("El día "+dia+" del mes de "+nomMes+" corresponde con: Aries.");
      }
      break;
      
      case 4:
      
      nomMes = "Abril";
      if (dia >= 1 && dia <= 20){
        System.out.print("El día "+dia+" del mes de "+nomMes+" corresponde con: Aries.");
      }else if (dia >= 21 && dia <=30){
        System.out.print("El día "+dia+" del mes de "+nomMes+" corresponde con: Tauro.");
      }else {
        System.out.println("Error, el mes seleccionado solo tiene 30 días como máximo.");
        }
      break;
      
      case 5:
      
      nomMes = "Mayo";
      if (dia >= 1 && dia <= 21){
        System.out.print("El día "+dia+" del mes de "+nomMes+" corresponde con: Tauro.");
      }else if (dia >= 22 && dia <=31){
        System.out.print("El día "+dia+" del mes de "+nomMes+" corresponde con: Geminis.");
      }
      break;
      
      case 6:
      
      nomMes = "Junio";
      if (dia >= 1 && dia <= 21){
        System.out.print("El día "+dia+" del mes de "+nomMes+" corresponde con: Geminis.");
      }else if (dia >= 22 && dia <=30){
        System.out.print("El día "+dia+" del mes de "+nomMes+" corresponde con: Cancer.");
      }else {
        System.out.println("Error, el mes seleccionado solo tiene 30 días como máximo.");
        }
      break;
      
      case 7:
      
      nomMes = "Julio";
      if (dia >= 1 && dia <= 23){
        System.out.print("El día "+dia+" del mes de "+nomMes+" corresponde con: Cancer.");
      }else if (dia >= 24 && dia <=31){
        System.out.print("El día "+dia+" del mes de "+nomMes+" corresponde con: Leo.");
      }
      break;
      
      case 8:
      
      nomMes = "Agosto";
      if (dia >= 1 && dia <= 23){
        System.out.print("El día "+dia+" del mes de "+nomMes+" corresponde con: Leo.");
      }else if (dia >= 24 && dia <=31){
        System.out.print("El día "+dia+" del mes de "+nomMes+" corresponde con: Virgo.");
      }
      break;
      
      case 9:
      
      nomMes = "Septiembre";
      if (dia >= 1 && dia <= 23){
        System.out.print("El día "+dia+" del mes de "+nomMes+" corresponde con: Virgo.");
      }else if (dia >= 21 && dia <=30){
        System.out.print("El día "+dia+" del mes de "+nomMes+" corresponde con: Libra.");
      }else {
        System.out.println("Error, el mes seleccionado solo tiene 30 días como máximo.");
        }
      break;
      
      case 10:
      
      nomMes = "Octubre";
      if (dia >= 1 && dia <= 23){
        System.out.print("El día "+dia+" del mes de "+nomMes+" corresponde con: Libra.");
      }else if (dia >= 24 && dia <=31){
        System.out.print("El día "+dia+" del mes de "+nomMes+" corresponde con: Escorpio.");
      }
      break;
      
      case 11:
      
      nomMes = "Noviembre";
      if (dia >= 1 && dia <= 22){
        System.out.print("El día "+dia+" del mes de "+nomMes+" corresponde con: Escorpio.");
      }else if (dia >= 23 && dia <=30){
        System.out.print("El día "+dia+" del mes de "+nomMes+" corresponde con: Sagitario.");
      }else {
        System.out.println("Error, el mes seleccionado solo tiene 30 días como máximo.");
        }
      break;
      
      case 12:
      
      nomMes = "Diciembre";
      if (dia >= 1 && dia <= 21){
        System.out.print("El día "+dia+" del mes de "+nomMes+" corresponde con: Sagitario.");
      }else if (dia >= 22 && dia <=31){
        System.out.print("El día "+dia+" del mes de "+nomMes+" corresponde con: Capricornio.");
      }
      break;
    
    
      default:
      System.out.println("Fecha de nacimiento no válida.");
    
    }
  }else {
    System.out.println("Fecha de nacimiento no válida.");
    }
    
    
    
    
    
    }
  }

