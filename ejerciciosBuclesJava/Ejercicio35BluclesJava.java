/**
 * 
 */
package ejerciciosBuclesJava;

import java.util.Scanner;

/**
 * @author FESEVA
 *
 */
public class Ejercicio35BluclesJava {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int altura = 0;
		do {
			System.out.print("Por favor, introduzca una altura impar mayor o igual a 3 de la X: ");
			 altura = s.nextInt();
			 if(altura <3 || altura%2 == 0){
				 System.out.println("Error, introduzca una altura impar mayor o igual a 3.");
			 }
			 
		}while(altura < 3 || altura %2 == 0);
		
		if(altura == 3){
			 System.out.println("* *");
			 System.out.println(" *");
			 System.out.println("* *");
		 }else {
		
		
		int anchura = altura;
		int seguidorAltura = altura;
		int seguidorAnchura = anchura;
		int contador = 0;
		
		
		
		//1 Line
		do {
			System.out.print("*");
			do {
				System.out.print(" ");
				contador++;
			} while (contador < (seguidorAnchura -2));
			System.out.println("*");
		} while (contador < (seguidorAnchura -2));
		contador = 0;
		//Cuerpo UP
		
		int espacioAntes = 1;
		int espacioIntermedio = (seguidorAnchura -2);
		int alturaMitad= (altura-3)/2;
		int contador2 = 0;
		do {
			do {
			System.out.print(" ");
			contador++;
		} while (contador<espacioAntes);
		espacioAntes++;
		contador = 0;
		
		do {
			System.out.print("*");
			espacioIntermedio = espacioIntermedio -2;
			do {
				System.out.print(" ");
				contador++;
			} while (contador<espacioIntermedio);
			System.out.println("*");
		} while (contador<espacioIntermedio);
		contador = 0;
		contador2++;
		} while (contador2<alturaMitad);
		contador2 = 0;
		
		//Punto Medio
		
		do {
			System.out.print(" ");
			contador++;
		} while (contador<(altura-1)/2);
		contador = 0;
		System.out.println("*");
		
		
		//Cuerpo DOWN
		
		
		espacioAntes = ((altura-1)/2)-1;
		espacioIntermedio = 1;
		
		do {
		do {
			System.out.print(" ");
			contador++;
			
		} while (contador< (espacioAntes));
		espacioAntes--;
		contador = 0;
		
		
		System.out.print("*");
		
		do {
			System.out.print(" ");
			contador++;
		} while (contador<espacioIntermedio);
		espacioIntermedio = espacioIntermedio + 2;
		
		contador = 0;
		contador2++;
		System.out.println("*");
		}while(contador2<alturaMitad);
		
		//Last Line
				do {
					System.out.print("*");
					do {
						System.out.print(" ");
						contador++;
					} while (contador < (seguidorAnchura -2));
					System.out.println("*");
				} while (contador < (seguidorAnchura -2));
				contador = 0;
				
		 }
//		do {
//			do {
//			
//			System.out.print("*");
//			do {
//				System.out.print(" ");
//			} while (contadorInterno < seguidorAnchura -2);
//			contadorInterno = 0;
//			contador++;
//			System.out.println("*");
//			
//		} while (contador<seguidorAnchura);
//			contador = 0;
//			contadorAltura++;
//			seguidorAnchura--;
//		} while (contadorAltura < (seguidorAltura -1)/2);
//		
	}

}
