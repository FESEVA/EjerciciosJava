import java.util.*;
/*
* Realiza el control de acceso a una caja fuerte. La combinación será un
número de 4 cifras. El programa nos pedirá la combinación para abrirla. Si no
acertamos, se nos mostrará el mensaje “Lo siento, esa no es la combinación”
y si acertamos se nos dirá “La caja fuerte se ha abierto satisfactoriamente”.
Tendremos cuatro oportunidades para abrir la caja fuerte..
*
* @author Fernando Iván Sevilla Valderrama
*/
public class Ejercicio7JavaBucles {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
    int contador = 4;
    int codigo = 0;
    boolean correcto = false;
    
		do {
      System.out.println("\033[93m Tienes "+contador+" intentos disponibles para adivinar el código de 4 cifras de la caja fuerte. \033[39;49m");
      contador--;
      System.out.print("Introduzca el código: ");
       codigo = s.nextInt();
       
       if (codigo == 1234){
          correcto = true;
          System.out.println("\033[32m¡Enhorabuena, has acertado el código! \033[39;49m");
          }else {
            System.out.println("\033[31mCódigo incorrecto. \033[39;49m");
      }
      
      }while (!correcto && contador > 0 );{
        
        if (correcto){
          System.out.println("\033[93m Caja fuerte abierta. \033[39;49m");;
          }else{
            System.out.print("Lo siento has agotado el número de intentos disponibles.");
      }
        
        }
		
	}
}
