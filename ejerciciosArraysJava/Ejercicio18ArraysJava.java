/**
 * 
 */
package ejerciciosArraysJava;

/**
 * @author FESEVA
 *
 */
public class Ejercicio18ArraysJava {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] original = new int [10];
		
		System.out.println("");
		System.out.println("Array original:");
		System.out.printf("┌───────────┬───────────┬───────────┬───────────┬───────────┬───────────┬───────────┬───────────┬───────────┬───────────┬───────────┐\n"); 
		System.out.print("│  Índice   │"); 
		for (int i = 0; i < original.length; i++) {

			System.out.printf("     %-6d│",i); 
		}
		System.out.println("");
		System.out.println("├───────────┼───────────┼───────────┼───────────┼───────────┼───────────┼───────────┼───────────┼───────────┼───────────┼───────────┤");
		System.out.print("│   Valor   │");
		for (int i = 0; i < original.length; i++) {

			System.out.printf("    %-7s│",original[i] = (int)(Math.random()*201)); 
		}
		System.out.println("");
		System.out.println("└───────────┴───────────┴───────────┴───────────┴───────────┴───────────┴───────────┴───────────┴───────────┴───────────┴───────────┘");
	
int contadorMayor = 0;
int contadorMenor = 0;
		
		


		for (int i = 0; i < original.length; i++) {
			if (original[i] > 100 ) {
				contadorMayor++;
			}else {
				contadorMenor++;
			}
			
		}
		
		int [] arrayMayor = new int [contadorMayor];
		int [] arrayMenor = new int [contadorMenor];
		
		int mayor = 0;
		int menor = 0;
		
		for (int i = 0; i < original.length; i++) {
			
			if (original[i] > 100 ) {
				arrayMayor[mayor] = original[i];
				mayor++;
			}else {
				arrayMenor[menor] = original[i];
				menor++;
			}
			
			
		}
		
		
		//CALCULO
		
		int [] resultado = new int [10];
		
		mayor = 0;
		menor = 0;
		
		System.out.println("");
		boolean validator = false;
		
		for (int i = 0; i < resultado.length; i++) {
			
			if(validator == false ) {
				
				resultado[i] = arrayMayor[mayor];
				mayor++;
				validator = true;
				if(menor == arrayMenor.length) {
					validator = false;
				}
			}else if (validator == true) {
				resultado[i] = arrayMenor[menor];
				menor++;
				validator = false;
				if(mayor == arrayMayor.length) {
					validator = true;
				}
			}
			
			
		}
		
		
		
		
		
		//RESULTADO
		System.out.println("");
		
		
		

		System.out.println("Array resultado:");
		System.out.printf("┌───────────┬───────────┬───────────┬───────────┬───────────┬───────────┬───────────┬───────────┬───────────┬───────────┬───────────┐\n"); 
		System.out.print("│  Índice   │"); 
		for (int i = 0; i < resultado.length; i++) {

			System.out.printf("     %-6d│",i); 
		}
		System.out.println("");
		System.out.println("├───────────┼───────────┼───────────┼───────────┼───────────┼───────────┼───────────┼───────────┼───────────┼───────────┼───────────┤");
		System.out.print("│   Valor   │");
		for (int i = 0; i < resultado.length; i++) {

			System.out.printf("    %-7s│",resultado[i]); 
		}
		System.out.println("");
		System.out.println("└───────────┴───────────┴───────────┴───────────┴───────────┴───────────┴───────────┴───────────┴───────────┴───────────┴───────────┘");
	
		
		
	}
}
