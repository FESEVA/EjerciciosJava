/*
* Realiza un conversor de pesetas a euros. La cantidad de euros que se quiere
convertir debe ser introducida por teclado.
*
* @author Fernando Iván Sevilla Valderrama
*/
public class Ejercicio3JavaLeerDatos {
	public static void main(String[] args) {
	
	System.out.println("Bienvenido al conversor de pesetas a euros.");
	
	String moneda;
	System.out.print("Introduzca la cantidad de pesetas que desea convertir a euros: ");
	moneda = System.console().readLine();
	
	int monedaPeseta = Integer.parseInt ( moneda );
	
	double conversion = ( (double) monedaPeseta / 166.386 ); //1 euro = 166.286 pesetas
	
	System.out.println( +monedaPeseta+ " pesetas son: " +conversion+ " euros.");
	}
}
