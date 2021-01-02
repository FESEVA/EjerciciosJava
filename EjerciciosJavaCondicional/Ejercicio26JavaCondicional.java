import java.util.*;
/*
* Realiza un programa que calcule el precio de unas entradas de cine en función
del número de personas y del día de la semana. El precio base de una entrada
son 8 euros. El miércoles (día del espectador), el precio base es de 5 euros. Los
jueves son el día de la pareja, por lo que la entrada para dos cuesta 11 euros.
Con la tarjeta CineCampa se obtiene un 10% de descuento. Si un jueves, un
grupo de 6 personas compran entradas, el precio total sería de 33 euros ya
que son 3 parejas; pero si es un grupo de 7, pagarán 3 entradas de pareja más
1 individual que son 41 euros (33 + 8).*
* @author Fernando Iván Sevilla Valderrama
*/
public class Ejercicio26JavaCondicional {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Venta de entradas YelmoCine");
		System.out.print("Número de entradas: ");
    int numeroEntradas = s.nextInt();
		System.out.print("Día de la semana: ");
    String diaSemana = System.console().readLine();
		System.out.print("¿Tiene tarjeta MoviYelmo? (s/n): ");
    char tarjetaDescuento = s.next(".").charAt(0);
    
    String fraseEntradas = "";
    double precioEntrada = 0;
    double total = precioEntrada * numeroEntradas;
    
    switch (diaSemana) {
    
      
      case "miercoles":
      case "Miercoles":
      precioEntrada = 5;
      total = precioEntrada * numeroEntradas;
      System.out.println("-----------------------------------------------------------------------");
     System.out.printf("| Aquí tiene sus entradas para el %-10s|  Gracias por su compra  |\n", diaSemana);
      System.out.println("-----------------------------------------------------------------------");
      System.out.printf("Entradas individuales:           %6d\n", numeroEntradas);
      System.out.printf("Precio por entrada individual:    %4.2f€\n", precioEntrada);
      System.out.printf("Total:                           %4.2f€\n", total);
      break;
      
      case "jueves":
      case "Jueves":
      precioEntrada = 8;
      double precioEntradaPareja = 11;
      int checkParejas = numeroEntradas % 2;
      int numeroEntradasParejas = 0;
      int entradasIndividuales = checkParejas;
      
      if (checkParejas == 0){
        numeroEntradasParejas = numeroEntradas / 2;
        total = precioEntradaPareja * numeroEntradasParejas;
          System.out.println("-----------------------------------------------------------------------");
         System.out.printf("| Aquí tiene sus entradas para el %-10s|  Gracias por su compra  |\n", diaSemana);
          System.out.println("-----------------------------------------------------------------------");
          System.out.printf("Entradas parejas:                %6d\n", numeroEntradasParejas);
          System.out.printf("Precio por entrada de pareja:    %4.2f€\n", precioEntradaPareja);
          System.out.printf("Total:                           %4.2f€\n", total);
        }else{
          numeroEntradasParejas = numeroEntradas / 2;
          total = (precioEntradaPareja * numeroEntradasParejas) + (precioEntrada * entradasIndividuales);
          System.out.println("-----------------------------------------------------------------------");
         System.out.printf("| Aquí tiene sus entradas para el %-10s|  Gracias por su compra  |\n", diaSemana);
          System.out.println("-----------------------------------------------------------------------");
          System.out.printf("Entradas parejas:                %6d\n", numeroEntradasParejas);
          System.out.printf("Precio por entrada de pareja:    %4.2f€\n", precioEntradaPareja);
          System.out.printf("Entradas individuales:           %6d\n", entradasIndividuales);
          System.out.printf("Precio por entrada individual:    %4.2f€\n", precioEntrada);
          System.out.printf("Total:                           %4.2f€\n", total);
          
          }
      break;
      
     default:
      
      precioEntrada = 8;
      total = precioEntrada * numeroEntradas;
      
      System.out.println("-----------------------------------------------------------------------");
     System.out.printf("| Aquí tiene sus entradas para el %-10s|  Gracias por su compra  |\n", diaSemana);
      System.out.println("-----------------------------------------------------------------------");
      System.out.printf("Entradas individuales:           %6d\n", numeroEntradas);
      System.out.printf("Precio por entrada individual:    %4.2f€\n", precioEntrada);
      System.out.printf("Total:                           %4.2f€\n", total);
      }
    double descuento = 0;
    double aPagar = 0;
    if (tarjetaDescuento == 's' || tarjetaDescuento == 'S'){
      descuento = total * 0.10;
      aPagar = total - descuento;
      System.out.printf("Descuento:                        %4.2f€\n", descuento);
      System.out.printf("A pagar:                         %4.2f€\n", aPagar);
      }else{
        descuento = 0;
        aPagar = total - descuento;
        System.out.printf("Descuento:                        %4.2f€\n", descuento);
        System.out.printf("A pagar:                         %4.2f€\n", aPagar);
        }
    
    
    
    
    
    
    
    
	
  
		
		
    
  } 
}
