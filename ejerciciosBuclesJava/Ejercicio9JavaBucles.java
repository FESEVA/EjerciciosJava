import java.util.*;
/*
* Realiza un programa que nos diga cuántos dígitos tiene un número introducido
por teclado. Este ejercicio es equivalente a otro realizado anteriormente, con
la salvedad de que el anterior estaba limitado a números de 5 dígitos como
máximo. En esta ocasión, hay que realizar el ejercicio utilizando bucles; de
esta manera, la única limitación en el número de dígitos la establece el tipo de
dato que se utilice (int o long).

*
* @author Fernando Iván Sevilla Valderrama
*/
public class Ejercicio9JavaBucles {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
    int contador = 1;
    //long calculo = 0; 
    
   System.out.print("Introduzca un número: ");
   //long calculo = Math.abs(s.nextLong()); para valor absoluto.
   long calculo = s.nextLong();
   
   long calculoInicial = calculo;
   
   if (calculoInicial > (-10) && calculoInicial < 10){
     System.out.println("El "+calculoInicial+" tiene 1 cifra.");
     }
     else{
   
   
   do{
     calculo = calculo / 10;
      
     contador++;
     
     }while(calculo <= (-10) && calculo <= 0 || calculo >= 10 && calculo >= 0);{
       
       System.out.println("El "+calculoInicial+" tiene "+contador+" cifras.");
       }
  
  }
	}
}
