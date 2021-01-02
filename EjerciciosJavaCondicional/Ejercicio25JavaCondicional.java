import java.util.*;
/*
* La tienda online BanderaDeEspaña.es vende banderas personalizadas de la
máxima calidad y nos ha pedido hacer un configurador que calcule el precio
según el alto y el ancho. El precio base de una bandera es de un céntimo de
euro el centímetro cuadrado. Si la queremos con un escudo bordado, el precio
se incrementa en 2.50 € independientemente del tamaño. Los gastos de envío
son 3.25 €. El IVA ya está incluido en todas las tarifas.
*
* @author Fernando Iván Sevilla Valderramalo
*/
public class Ejercicio25JavaCondicional {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Introduzca la altura de la bandera en cm: ");
    double alturaBandera = s.nextInt();
		System.out.println("Ahora introduzca la anchura: ");
    double anchuraBandera = s.nextInt();
		System.out.println("¿Quiere escudo bordado? (s/n): ");
    char escudoBordado = s.next(".").charAt(0);
    
    double centimetrosCuadrados = alturaBandera * anchuraBandera;
    double precioCentimetrosCuadrados = centimetrosCuadrados / 100;
    double precioEscudo = 0;
    if (alturaBandera > 0 && anchuraBandera > 0 && escudoBordado == 's'|| escudoBordado == 'n'){
      System.out.println("Gracias. Aquí tiene el desglose de su compra.");
      System.out.printf("Bandera de %8.2f cm²:  %8.2f€.\n",centimetrosCuadrados, precioCentimetrosCuadrados );
      
        if (escudoBordado == 's'){
          precioEscudo = 2.50;
            System.out.printf("Con escudo:               %8.2f€\n",precioEscudo);
          }else{
            precioEscudo = 0;
             
              System.out.printf("Sin escudo:               %8.2f€\n",precioEscudo);
          }
          double gastosDeEnvio = 3.25;
          double total = gastosDeEnvio + precioEscudo + precioCentimetrosCuadrados;
          
      System.out.printf("Gastos de envio:          %8.2f€\n",gastosDeEnvio);
      System.out.printf("TOTAL:                    %8.2f€\n",total);
      }else{
       System.out.println("Error, introduzca los parámetros de manera correcta.");
        }
    
    
		
		
  } 
}
