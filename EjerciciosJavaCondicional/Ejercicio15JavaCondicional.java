import java.util.*;
/*
* Escribe un programa que pinte una pirámide rellena con un carácter introducido
por teclado que podrá ser una letra, un número o un símbolo como *, +, -, $, &,
etc. El programa debe permitir al usuario mediante un menú elegir si el vértice
de la pirámide está apuntando hacia arriba, hacia abajo, hacia la izquierda o
hacia la derecha.
*
* @author Fernando Iván Sevilla Valderrama
*/
public class Ejercicio15JavaCondicional {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Bienvenido al programa que pinta una piramide personalizada según el carácter introducido y la dirección de la pirámide.");
    char simbolo = s.next().charAt(0);
    
    System.out.println("Introduzca el número correspondiente a la dirección de la pirámide deseada: 1-Arriba | 2-Abajo | 3-Derecha | 4-Izquierda ");
    
    int direccion = s.nextInt();
    
    
     System.out.println("");
     
    
    switch(direccion) {
    
    case 1:
    System.out.println("  "+simbolo+"  ");
		System.out.println(" "+simbolo+""+simbolo+""+simbolo+" ");
		System.out.println(""+simbolo+""+simbolo+""+simbolo+""+simbolo+""+simbolo+"");
    break;

    case 2:
      System.out.println(""+simbolo+""+simbolo+""+simbolo+""+simbolo+""+simbolo+"");
      System.out.println(" "+simbolo+""+simbolo+""+simbolo+" ");
      System.out.println("  "+simbolo+"  ");
    break;
    
    case 3:
      System.out.println(simbolo);
      System.out.println(simbolo+""+simbolo);
      System.out.println(simbolo+""+simbolo+""+simbolo);
      System.out.println(simbolo+""+simbolo);
      System.out.println(simbolo);
    break;
    
    case 4:
      System.out.println("  "+simbolo);
      System.out.println(" "+simbolo+""+simbolo);
      System.out.println(simbolo+""+simbolo+""+simbolo);
      System.out.println(" "+simbolo+""+simbolo);
      System.out.println("  "+simbolo);
    break;

    default:
    System.out.println("  "+simbolo+"  ");
		System.out.println(" "+simbolo+""+simbolo+""+simbolo+" ");
		System.out.println(""+simbolo+""+simbolo+""+simbolo+""+simbolo+""+simbolo+"");
    }
  } 
}
