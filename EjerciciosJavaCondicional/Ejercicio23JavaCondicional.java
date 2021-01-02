import java.util.*;
/*
* Escribe un programa que calcule el precio final de un producto según su
base imponible (precio antes de impuestos), el tipo de IVA aplicado (general,
reducido o superreducido) y el código promocional. Los tipos de IVA general,
reducido y superreducido son del 21%, 10% y 4% respectivamente. Los códigos
promocionales pueden ser nopro, mitad, meno5 o 5porc que significan
respectivamente que no se aplica promoción, el precio se reduce a la mitad,
se descuentan 5 euros o se descuenta el 5%. El ejercicio se da por bueno si se
muestran los valores correctos, aunque los números no estén tabulados.*
* 
* @author Fernando Iván Sevilla Valderrama
*/
public class Ejercicio23JavaCondicional {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Introduzca la base imponible: ");
    double baseImponible = s.nextDouble();
    System.out.print("Introduzca el tipo de IVA (general, reducido o superreducido): ");
    String tipoIva = System.console().readLine();
    System.out.print("Introduzca el código promocional (nopro, mitad, meno5 o 5porc): ");
    String codigoPromocional = System.console().readLine();
    
    int porcentajeIva = 0;
    double ivaSinPrecio = 0;
    double precioConIva = 0;
    
    switch (tipoIva) {
      
      case "general":
      porcentajeIva = 21;
      ivaSinPrecio = baseImponible * 0.21;
      precioConIva = ivaSinPrecio + baseImponible;
      break;
      
      case "reducido":
      porcentajeIva = 10;
      ivaSinPrecio = baseImponible * 0.10;
      precioConIva = ivaSinPrecio + baseImponible;
      break;
      
      case "superreducido":
      porcentajeIva = 4;
      ivaSinPrecio = baseImponible * 0.04;
      precioConIva = ivaSinPrecio + baseImponible;
      
      break;
      
      default:
      
      }
      
      
      double descuento = 0;
      double total = 0;
      
      
    switch (codigoPromocional) {
      
      case "nopro":
      descuento = -0 - 0;
      total = precioConIva + descuento;
      break;
      
      case "mitad":
      descuento = 0 - (precioConIva / 2);
      total = precioConIva + descuento;
      break;
      
      case "meno5":
      descuento = - 5;
      total = precioConIva + descuento;
      break;
      
      case "5porc":
      descuento = 0 - (precioConIva * 0.05);
      total = precioConIva + descuento;
      break;
      
      default:
      
      }
      
      System.out.printf("Base imponible       %8.2f \n", baseImponible);
      System.out.printf("IVA (%2d%%)            %8.2f \n", porcentajeIva, ivaSinPrecio);
      System.out.printf("Precio con IVA       %8.2f \n", precioConIva);
      System.out.printf("Cód. promo. ("+codigoPromocional+"): %8.2f \n", descuento);
      System.out.printf("TOTAL                %8.2f \n", total);
      
      
  }
}
