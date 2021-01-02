import java.util.*;
/*
* Escribe un programa que ordene tres números enteros introducidos por teclado.
*
* @author Fernando Iván Sevilla Valderrama
*/
public class Ejercicio13JavaCondicional {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Bienvenido al programa que ordena tres números enteros introducidos por teclado.");
    System.out.print("Introduzca el primer número: ");
    int num1 = s.nextInt();
    System.out.print("Introduzca el segundo número: ");
    int num2 = s.nextInt();
    System.out.print("Introduzca el tercer número: ");
    int num3 = s.nextInt();
    
    if (num1 == num2 || num1 == num3 || num2 == num3){
      
      System.out.println("Por favor introduzca números distintos para poder ordenarlos.");
    }else {
    
    System.out.println("¿Como quieres ordenar los números, en orden 'ascendente' o en orden 'descendente'?");
    
    String orden = s.next();
    
    if ("descendente".equals(orden)){
    
      if (num1 > num2 && num2 > num3){
      
      System.out.println("El orden descendente seria: "+num1+" > "+num2+" > "+num3+".");
      }
      
      if (num1 > num3 && num3 > num2){
      
      System.out.println("El orden descendente seria: "+num1+" > "+num3+" > "+num2+".");
      }
   
      if (num2 > num1 && num1 > num3){
      
      System.out.println("El orden descendente seria: "+num2+" > "+num1+" > "+num3+".");
      }
      
      if (num2 > num3 && num3 > num1){
      
      System.out.println("El orden descendente seria: "+num2+" > "+num3+" > "+num1+".");
      }
      
      if (num3 > num2 && num2 > num1){
      
      System.out.println("El orden descendente seria: "+num3+" > "+num2+" > "+num1+".");
      }
      
      if (num3 > num1 && num1 > num2){
      
      System.out.println("El orden descendente seria: "+num3+" > "+num1+" > "+num2+".");
      }
      
    }else if ("ascendente".equals(orden)){
      
      if (num1 < num2 && num2 < num3){
      
      System.out.println("El orden ascendente seria: "+num1+" < "+num2+" < "+num3+".");
      }
      
      if (num1 < num3 && num3 < num2){
      
      System.out.println("El orden ascendente seria: "+num1+" < "+num3+" < "+num2+".");
      }
   
      if (num2 < num1 && num1 < num3){
      
      System.out.println("El orden ascendente seria: "+num2+" < "+num1+" < "+num3+".");
      }
      
      if (num2 < num3 && num3 < num1){
      
      System.out.println("El orden ascendente seria: "+num2+" < "+num3+" < "+num1+".");
      }
      
      if (num3 < num2 && num2 < num1){
      
      System.out.println("El orden ascendente seria: "+num3+" < "+num2+" < "+num1+".");
      }
      
      if (num3 < num1 && num1 < num2){
      
      System.out.println("El orden ascendente seria: "+num3+" < "+num1+" < "+num2+".");
      }
      
      }
    }
  } 
}
