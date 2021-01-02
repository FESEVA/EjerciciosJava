import java.util.*;
/*
* Realiza un programa que calcule el precio de un desayuno. El programa
preguntará primero qué ha tomado el usuario de comer: palmera, donut o
pitufo. La palmera vale 1.40 € y el donut 1 €. En caso de tomar pitufo, el
programa debe preguntar además si era con aceite o con tortilla; el primero
vale 1’20 € y el segundo 1’60 €. Por último se pregunta por la bebida: zumo o
café a 1’50 y 1’20 respectivamente.
* 
* @author Fernando Iván Sevilla Valderrama
*/
public class Ejercicio29JavaCondicional {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("¿Que ha tomado de comer? (palmera, donut o pitufo): ");
    String comida = System.console().readLine();
  
  double precioComida = 0;
  String tipoPitufo = "";
  
  switch (comida){
    
    case "pitufo":
    case "Pitufo":
    System.out.print("¿Con qué se ha tomado el pitufo? (aceite o tortilla): ");
    tipoPitufo = System.console().readLine();
    if (tipoPitufo.equals("aceite")){
      
      }else if (tipoPitufo.equals("tortilla")){
        
        }else{
          System.out.print("Error, opción no válida.");
          System.exit(1);
          }

    
    
    break;
    
    case "donut":
    case "Donut":
    precioComida = 1;
    break;
    
    case "palmera":
    case "Palmera":
    precioComida = 1.40;
    break;
    
    default:
        
    }
    
    System.out.print("¿Que ha tomado de beber? (zumo o café): ");
    String bebida = System.console().readLine();
    
    double precioBebida = 0;
    if (bebida.equals("zumo")){
      precioBebida = 1.50;
      
        }else if(bebida.equals("café") || bebida.equals("cafe") ){
          precioBebida = 1.20;
          
          } else{
            System.out.print("Error, opción no válida.");
            System.exit(1);
            }
  
    System.out.println("---------------------------------------------------");
    System.out.println("| Aquí tiene su factura  |  Gracias por su compra |");
    System.out.println("---------------------------------------------------");
    
    switch (comida){
    
    case "pitufo":
    case "Pitufo":
  
    if (tipoPitufo.equals("aceite")){
      precioComida = 1.20;
      System.out.printf("Pitufo con aceite: %4.2f €\n", precioComida);
      }else if (tipoPitufo.equals("tortilla")){
        precioComida = 1.60;
        System.out.printf("Pitufo con tortilla: %4.2f €\n", precioComida);
        }

    
    
    break;
    
    case "donut":
    case "Donut":
    precioComida = 1;
    System.out.printf("Donut: %4.2f €\n", precioComida);
    break;
    
    case "palmera":
    case "Palmera":
    precioComida = 1.40;
    System.out.printf("Palmera: %4.2f €\n", precioComida);
    break;
    
    default:
    
  }
  if (bebida.equals("zumo")){
      precioBebida = 1.50;
      System.out.printf("Zumo: %4.2f €\n", precioBebida);
        }else if(bebida.equals("café") || bebida.equals("cafe") ){
          precioBebida = 1.20;
          System.out.printf("Café: %4.2f €\n", precioBebida);
          } 
    double total = precioBebida + precioComida;
    System.out.printf("Total desayuno: %4.2f €", total);
    
  } 
}
