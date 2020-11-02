import java.util.Scanner;
/*
* Escribe un programa que calcule el total de una factura a partir de la base
  imponible (precio sin IVA). 
*
* @author Fernando Iván Sevilla Valderrama
*/
public class Ejercicio7JavaLeerDatos {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Bienvenido al programa que muestra una factura, según la cantidad de determinados productos elegidos por el usuario.");
		
		System.out.print("Introduzca la cantidad de tomate que desea comprar: ");
		int tomate = s.nextInt();
		
		System.out.print("Introduzca la cantidad de macarrones que desea comprar: ");
		int macarrones = s.nextInt();
		
		System.out.print("Introduzca la cantidad de queso que desea comprar: ");
		int queso = s.nextInt();
	
		double prTomate = 1;
		double prMacarrones = 0.50;
		double prQueso = 2;
	
		System.out.println("╔══════════╦════════════╦═══════════════╦═════════════════════╗");
		System.out.println("║ Cantidad ║  Producto  ║ Precio Unidad ║Precio por cantidad  ║");
		System.out.println("╠══════════╬════════════╬═══════════════╬═════════════════════╣");
		System.out.printf("║       %3d║%-10s  ║         %3.2f €║              %5.2f €║     \n", + tomate, "Tomate", + prTomate, ( tomate * prTomate ));
		System.out.println("╠══════════╬════════════╬═══════════════╬═════════════════════╣");
		System.out.printf("║       %3d║%-10s  ║         %3.2f €║              %5.2f €║     \n", + macarrones, "Macarrones", + prMacarrones, ( macarrones * prMacarrones ));
		System.out.println("╠══════════╬════════════╬═══════════════╬═════════════════════╣");
		System.out.printf("║       %3d║%-10s  ║         %3.2f €║              %5.2f €║     \n", + queso, "Queso", + prQueso, ( queso * prQueso ));
		System.out.println("╚══════════╩════════════╩═══════════════╩═════════════════════╝");
		
		
		double ivaSolo = ( ( prTomate * tomate ) + ( prMacarrones * macarrones ) + ( prQueso * queso ) ) * 0.21;
		double precioSinIva = ( ( prTomate * tomate ) + ( prMacarrones * macarrones ) + ( prQueso * queso ) );
		double precioConIva = ( precioSinIva + ivaSolo );
		
		System.out.println("  ╔═══════════╦════════════════╦═══════════════════════════╗");
		System.out.println("  ║ IVA TOTAL ║ Precio SIN IVA ║  Precio CON IVA INCLUIDO  ║");
		System.out.println("  ╠═══════════╬════════════════╬═══════════════════════════╣");
		System.out.printf("  ║  %5.2f €  ║     %5.2f €    ║         %7.2f €         ║\n", + ivaSolo, + precioSinIva, +precioConIva);
		System.out.println("  ╚═══════════╩════════════════╩═══════════════════════════╝");
	
	}
}
