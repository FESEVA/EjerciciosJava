/*
* Escribe un programa que calcule el total de una factura a partir de la base
  imponible (precio sin IVA). La base imponible estará almacenada en una
	variable.
*
* @author Fernando Iván Sevilla Valderrama
*/
public class Ejercicio6JavaVariables {
	public static void main(String[] args) {
	
		int tomate = 3;
		int macarrones = 1;
		int queso = 2;
	
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
