import java.util.*;
/*
* Implementa el juego piedra, papel y tijera. Primero, el usuario 1 introduce
su jugada y luego el usuario 2. Si alguno de los usuarios introduce una opción
incorrecta, el programa deberá mostrar un mensaje de error.
* @author Fernando Iván Sevilla Valderrama
*/
public class Ejercicio28JavaCondicional {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Turno del jugador 1 (introduzca piedra, papel o tijera): ");
      String jugador1 = System.console().readLine();
  
    System.out.print("\033[H\033[2J");
    System.out.flush();
  
    System.out.print("Turno del jugador 2 (introduzca piedra, papel o tijera): ");
      String jugador2 = System.console().readLine();
      
      
  if (jugador1.equals("piedra") && jugador2.equals("papel")){
    System.out.println("Gana el jugador 2");
    }else if (jugador1.equals("piedra") && jugador2.equals("piedra")){
      System.out.println("Empate");
      }else if (jugador1.equals("piedra") && jugador2.equals("tijera")){
      System.out.println("Gana el jugador 1");
      }else if (jugador1.equals("papel") && jugador2.equals("piedra")){
      System.out.println("Gana el jugador 1");
      }else if (jugador1.equals("papel") && jugador2.equals("papel")){
      System.out.println("Empate");
      }else if (jugador1.equals("papel") && jugador2.equals("tijera")){
      System.out.println("Gana el jugador 2");
      }else if (jugador1.equals("tijera") && jugador2.equals("piedra")){
      System.out.println("Gana el jugador 2");
      }else if (jugador1.equals("tijera") && jugador2.equals("papel")){
      System.out.println("Gana el jugador 1");
      }else if (jugador1.equals("tijera") && jugador2.equals("tijera")){
      System.out.println("Empate");
      }else {
      System.out.println("Error, el jugador 1  o el jugador 2 han introducido una opción incorrecta.");
      }
      
      
     // if (!jugador1.equals("tijera")  || !jugador1.equals("piedra") || !jugador1.equals("papel") && jugador2.equals("tijera")  || jugador2.equals("piedra") || jugador2.equals("papel")){
     // System.out.println("Error, el jugador 1 ha introducido una opción incorrecta.");
     // }
      
      //else if (jugador1.equals("tijera")  || jugador1.equals("piedra") || jugador1.equals("papel") && !jugador2.equals("tijera")  || !jugador2.equals("piedra") || !jugador2.equals("papel")){
      //System.out.println("Error, el jugador 2 ha introducido una opción incorrecta.");
     // }else if (!jugador1.equals("tijera")  || !jugador1.equals("piedra") || !jugador1.equals("papel") && !jugador2.equals("tijera")  || !jugador2.equals("piedra") || !jugador2.equals("papel")){
      //System.out.println("Error, el jugador 1  y el jugador 2 han introducido una opción incorrecta.");
      //}
    
  } 
}
