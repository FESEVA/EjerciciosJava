import java.util.*;
/*
* Una pastelería nos ha pedido realizar un programa que haga presupuestos de
tartas. El programa preguntará primero de qué sabor quiere el usuario la tarta:
manzana, fresa o chocolate. La tarta de manzana vale 18 euros y la de fresa
16. En caso de seleccionar la tarta de chocolate, el programa debe preguntar
además si el chocolate es negro o blanco; la primera opción vale 14 euros y la
segunda 15. Por último se pregunta si se añade nata y si se personaliza con un
nombre; la nata suma 2.50 y la escritura del nombre 2.75.*
* @author Fernando Iván Sevilla Valderrama
*/
public class Ejercicio27JavaCondicional {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Elija un sabor (manzana, fresa o chocolate): ");
    String sabor = System.console().readLine();
    
    String chocolate = "";
    double precioSabor = 0;
    
    
    switch (sabor){
      
      case "chocolate":
      case "Chocolate":
      System.out.println("¿Qué tipo de chocolate quiere? (negro o blanco): ");
      chocolate = System.console().readLine();
        
        if (chocolate.equals("negro")){
          precioSabor = 14;
          
          }else if (chocolate.equals("blanco")){
            precioSabor= 15;
  
            }else{
              System.out.println("Error, ese sabor no existe. ");
              System.exit(1);
              }
      
      break;
      
      case "manzana":
      case "Manzana":
      precioSabor = 18;
      
      break;
      
      case "fresa":
      case "Fresa":
      precioSabor = 16;
      
      break;
      
      default:
      
      
      }
    
    
    
    System.out.println("¿Quiere nata? (si o no): ");
    String nata = System.console().readLine();
    
    double precioNata = 0;
    
    if (nata.equals("si")){
      precioNata = precioSabor + 2.50;
      }else if (nata.equals("no")){
        precioNata = precioSabor + 0;
        }else{
          System.out.println("Error, opción incorrecta");
          System.exit(1);
          }
    
    
    System.out.println("¿Quiere ponerle un nombre? (si o no): ");
    String nombre = System.console().readLine();
    
    double precioNombre = 0;
    
    if (nombre.equals("si")){
      precioNombre = precioNata + 2.75;
      }else if (nombre.equals("no")){
        precioNombre = precioNata + 0;
        }else{
          System.out.println("Error, opción incorrecta");
          System.exit(1);
          }
    
    
        System.out.println("---------------------------------------------------");
        System.out.println("| Aquí tiene su factura  |  Gracias por su compra |");
        System.out.println("---------------------------------------------------");
      if (sabor.equals("chocolate") && (chocolate.equals("negro")) || sabor.equals("chocolate") && (chocolate.equals("blanco"))){
        System.out.printf("Tarta de %s %s:  %4.2f €\n", sabor, chocolate, precioSabor);
        }else{
          System.out.printf("Tarta de %s: %4.2f €\n", sabor, precioSabor);
          }
          
      if (nata.equals("si")){
        System.out.println("Con nata: 2,50 €");
        }else{
          }
       
      if (nombre.equals("si")){
        System.out.println("Con nombre:  2,75 €");
        }else{
          }     
          
      System.out.printf("Total: %4.2f €", precioNombre);
  } 
}
