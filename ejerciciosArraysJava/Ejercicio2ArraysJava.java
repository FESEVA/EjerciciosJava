/**
 * 
 */
package ejerciciosArraysJava;


/**
 * @author FESEVA
 *
 */
public class Ejercicio2ArraysJava {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char [] simbolo = new char[10];
	
		simbolo[0] = 'a';
		simbolo[1] = 'x';
		simbolo[4] = '@';
		simbolo[6] = ' ';
		simbolo[7] = '+';
		simbolo[8] = 'Q';
	
	int contador = 0;

		do {
			System.out.println(simbolo[contador]);
			contador++;
		} while (contador <10);
		
	}
}
