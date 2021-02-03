/**
 * 
 */
package ejerciciosArraysJava;

/**
 * @author FESEVA
 *
 */
public class Ejercicio21ArraysJava {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int [] arrayAleatorio	= new int [15];
	int [] arrayCincuerizado	= new int [15];
		System.out.println("Array original:");
		int incremento = 0;
		for (int i = 0; i < arrayAleatorio.length; i++) {
			arrayAleatorio[i] = (int) (Math.random()*501);
			System.out.print(arrayAleatorio[i]+" ");
		}
	
		for (int i = 0; i < arrayCincuerizado.length; i++) {
			if(arrayAleatorio[i] % 5 == 0) {
				
				arrayCincuerizado[i]= arrayAleatorio[i];
			}else{
				incremento = 0;
				
				while(arrayAleatorio[i] % 5 != 0) {
					arrayAleatorio[i] += incremento;
					incremento = 0;
					incremento++;
				}
				
				//DA PROBLEMAS CUANDO EL NUMERO ACABA EN 1, 3, 6 y 8.
//				do {
//					
//				}while(arrayAleatorio[i] % 5 != 0);
				
				arrayCincuerizado[i]= arrayAleatorio[i];
				
			}
			
			
		}
		System.out.println("");
		System.out.println("Array cincuerizado:");
		for (int i = 0; i < arrayCincuerizado.length; i++) {
			System.out.print(arrayCincuerizado[i]+" ");
		}
	
		
	}
}
