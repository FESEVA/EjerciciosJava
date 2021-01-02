import java.util.*;
/*
* Realiza un programa que resuelva una ecuación de primer grado (del tipo ax+b = 0).
*
* @author Fernando Iván Sevilla Valderrama
*/
public class Ejercicio9JavaCondicional {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Bienvenido al programa que resuelve ecuaciones de primer grado del tipo ax² + bx + c = 0)");
   
    System.out.print("Introduzca el valor de a: ");
    double a = s.nextDouble();
    
    System.out.print("Introduzca el valor de b: ");
    double b = s.nextDouble();
    
    System.out.print("Introduzca el valor de c: ");
    double c = s.nextDouble();
    
    if (a==0 ){ //Error a no puede ser 0
      System.out.println("Error, a no puede ser 0.");
    }else {
      
      if (b==0 && c==0){
        System.out.println("Resultado x: 0");
      }else{
        
        double ecuacionParte1 = (( b * b) -4 * a * c);
        
        if(ecuacionParte1 > 0){
        double ecuacionParte2 = Math.sqrt( ecuacionParte1 );
        double resultado1 = (-b + ecuacionParte2)/(2 * a);
        double resultado2 = (-b - ecuacionParte2)/(2 * a);
        System.out.println("Resultado x1: "+resultado1);
        System.out.println("Resultado x2: "+resultado2);
        }else{
          System.out.println("No hay solución real.");
        }
      }
    }
    
      
    
  } 
}
