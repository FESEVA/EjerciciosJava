import java.util.*;
/*
* Calcula la nota de un trimestre de la asignatura Programación. El programa
pedirá las dos notas que ha sacado el alumno en los dos primeros controles.
Si la media de los dos controles da un número mayor o igual a 5, el alumno
está aprobado y se mostrará la media. En caso de que la media sea un número
menor que 5, el alumno habrá tenido que hacer el examen de recuperación que
se califica como apto o no apto, por tanto se debe preguntar al usuario ¿Cuál
ha sido el resultado de la recuperación? (apto/no apto). Si el resultado
de la recuperación es apto, la nota será un 5; en caso contrario, se mantiene
la nota media anterior.
*
* @author Fernando Iván Sevilla Valderrama
*/
public class Ejercicio21JavaCondicional {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Bienvenido al programa que calcula la nota media de la asignatura de programación.");
    
    double nota1 = 0;
    double nota2 = 0;
    String notaRecuperacion = "";
    
		System.out.print("Nota del primer control: ");
      nota1 = s.nextDouble(); 
		System.out.print("Nota del segundo control: ");
      nota2 = s.nextDouble();
      
    double notaMedia = (nota1 + nota2) / 2;
      
    if(notaMedia >= 5){
      System.out.println("Tu nota de Programación es: "+notaMedia);
    }else{
      System.out.print("¿Cuál ha sido el resultado de la recuperación? (apto/no apto): ");
        notaRecuperacion = System.console().readLine();
        if(notaRecuperacion.equals("apto")){
          System.out.print("Tu nota de Programación es 5");
          }else {
            System.out.print("Tu nota de Programación es: "+notaMedia);
            }
      }
      
      
    
	
  } 
}
