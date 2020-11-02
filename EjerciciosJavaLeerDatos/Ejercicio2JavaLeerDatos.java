/*
* Realiza un conversor de euros a pesetas. La cantidad de euros que se quiere
convertir debe ser introducida por teclado.
*
* @author Fernando Iván Sevilla Valderrama
*/
public class Ejercicio2JavaLeerDatos {
	public static void main(String[] args) {
	
	System.out.println("Bienvenido al conversor de euros a pesetas.");
	
	String moneda;
	System.out.print("Introduzca la cantidad de euros que desea convertir a pesetas: ");
	moneda = System.console().readLine();
	
	int monedaEuro = Integer.parseInt ( moneda );
	
	double conversion = ( (double) monedaEuro * 166.386 ); //1 euro = 166.286 pesetas
	
	System.out.println( +monedaEuro+ " euros son: " +conversion+ " pesetas.");
	}
}
