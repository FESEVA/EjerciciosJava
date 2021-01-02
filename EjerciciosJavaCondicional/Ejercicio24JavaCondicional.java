import java.util.*;
/*
* Escribe un programa que genere la nómina (bien desglosada) de un empleado
según las siguientes condiciones:
• Se pregunta el cargo del empleado (1 - Prog. junior, 2 - Prog. senior, 3 - Jefe
de proyecto), los días que ha estado de viaje visitando clientes durante el
mes y su estado civil (1 - Soltero, 2 - Casado).
• El sueldo base según el cargo es de 950, 1200 y 1600 euros según
si se trata de un prog. junior, un prog. senior o un jefe de proyecto
respectivamente.
• Por cada día de viaje visitando clientes se pagan 30 euros extra en
concepto de dietas. Al sueldo neto hay que restarle el IRPF, que será de
un 25% en caso de estar soltero y un 20% en caso de estar casado.
*
*  @author Fernando Iván Sevilla Valderrama
*/
public class Ejercicio24JavaCondicional {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("1 - Programador Junior");
		System.out.println("2 - Programador Senior");
		System.out.println("3 - Jefe de Proyecto");
		System.out.print("Introduzca el cargo del empleado (1 - 3): ");
    int cargoEmpleado = s.nextInt();
		System.out.print("¿Cuantos días ha estado de viaje visitando clientes? ");
    int diasViajes = s.nextInt();
		System.out.print("Introduzca su estado civil (1 - Soltero, 2 - Casado): ");
    int estadoCivil = s.nextInt();
    
    
    double sueldoBase = 0;
    switch (cargoEmpleado){
      
      case 1:
      sueldoBase = 950;
      break;
      
      case 2:
      sueldoBase = 1200;
      break;
      
      case 3:
      sueldoBase = 1600;
      break;
      
      default:
    
      }
      
      double sueldoViajes = 30 * diasViajes;
      
      double sueldoBruto = sueldoViajes + sueldoBase;
      
      double descuentoIrpf = 0;
      double sueldoNeto = 0;
      int numeroIrpf = 0;
      
      if (estadoCivil == 1){
         descuentoIrpf = 0 - (sueldoBruto * 0.25);
         sueldoNeto = sueldoBruto + descuentoIrpf;
         numeroIrpf = 25;
        }else{
          descuentoIrpf = 0 - (sueldoBruto * 0.20);
          sueldoNeto = sueldoBruto + descuentoIrpf;
          numeroIrpf = 20;
          }
  System.out.println("");
    System.out.println("----------------------------------");
    System.out.printf("| Sueldo base            %5.2f |\n", sueldoBase);
    System.out.printf("| Dietas ( %2d viajes )     %5.2f |\n",diasViajes, sueldoViajes );
    System.out.println("|--------------------------------|");
    System.out.printf("| Sueldo bruto           %5.2f |\n", sueldoBruto);
    System.out.printf("| Retención IRPF (%2d%%)   %5.2f |\n", numeroIrpf, descuentoIrpf);
    System.out.println("|--------------------------------|");
    System.out.printf("| Sueldo neto            %5.2f |\n", sueldoNeto);
    System.out.println("----------------------------------");
  
  
  
  } 
}
