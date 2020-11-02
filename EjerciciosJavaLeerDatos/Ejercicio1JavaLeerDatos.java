/*
* Realiza un programa que pida dos números y que luego muestre el resultado
de su multiplicación.
*
* @author Fernando Iván Sevilla Valderrama
*/
public class Ejercicio1JavaLeerDatos{
	public static void main(String[] args) {
		System.out.println("Bienvenido al programa que multiplica 2 números introducidos por el usuario.");
		
		String num;
		
		System.out.print("Introduzca el primer número: ");
		num = System.console().readLine();
		int num1;
		num1 = Integer.parseInt( num );
		
		System.out.print("Introduzca el segundo número: ");
		num = System.console().readLine();
		int num2;
		num2 = Integer.parseInt( num );
		
		int multiplicación = ( num1 * num2 );
		System.out.println("El resultado del la multiplación de " +num1+ " y " +num2+ " es: " +multiplicación);
		
	}
}
