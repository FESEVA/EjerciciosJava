import java.util.*;
/*
* Realiza un minicuestionario con 10 preguntas tipo test sobre las asignaturas que se imparten en el curso. Cada pregunta acertada sumará un punto. El programa mostrará al final la calificación obtenida. 
* Pásale el minicuestionario a tus compañeros y pídeles que lo hagan para ver qué tal andan de conocimientos en las diferentes asignaturas del curso.
*
* @author Fernando Iván Sevilla Valderrama
*/
public class Ejercicio12JavaCondicional {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Bienvenido al minicuestionario tipo test.");
   
    System.out.println("Es un cuestionario de 10 preguntas y por cada pregunta acertada se obtendrá un punto.");
    System.out.println("Comencemos...");
    System.out.println("");
    String respuesta;
    int contador = 0;
    
    System.out.println("1. ¿Cual es el lenguaje que entiende las bases de datos?");
      respuesta = System.console().readLine();
    if ("SQL".equals(respuesta) || "sql".equals(respuesta) || "Sql".equals(respuesta)){
      contador++;
      System.out.println("\033[32m Enhorabuena, respuesta correcta. \033[39;49m");
      }else {
        System.out.println("\033[31m Respuesta incorrecta. \033[39;49m");       
        }
    
    System.out.println("2. ¿Cómo se incrementa una variable llamada 'n1' en Java?");
      respuesta = System.console().readLine();
    if ("++".equals(respuesta) || "n1++".equals(respuesta)){
      contador++;
      System.out.println("\033[32m Enhorabuena, respuesta correcta. \033[39;49m");
      }else {
        System.out.println("\033[31m Respuesta incorrecta. \033[39;49m");       
        }
        
    System.out.println("3. ¿Párametro para visibility en LM para ocultar objeto?");
      respuesta = System.console().readLine();
    if ("hidden".equals(respuesta) || "Hidden".equals(respuesta)){
      contador++;
      System.out.println("\033[32m Enhorabuena, respuesta correcta. \033[39;49m");
      }else {
        System.out.println("\033[31m Respuesta incorrecta. \033[39;49m");       
        }
        
    System.out.println("4. ¿Cual es memoria volátil de un ordenador?");
      respuesta = System.console().readLine();
    if ("RAM".equals(respuesta) || "Ram".equals(respuesta) || "ram".equals(respuesta)){
      contador++;
      System.out.println("\033[32m Enhorabuena, respuesta correcta. \033[39;49m");
      }else {
        System.out.println("\033[31m Respuesta incorrecta. \033[39;49m");       
        }
        
    System.out.println("5. ¿Que Métrica se utiliza en España?");
      respuesta = System.console().readLine();
    if ("V3".equals(respuesta) || "v3".equals(respuesta) || "Métrica v3".equals(respuesta) || "Métrica V3".equals(respuesta) || "métrica V3".equals(respuesta) || "metrica V3".equals(respuesta) || "métrica v3".equals(respuesta) || "Metrica V3".equals(respuesta)){
      contador++;
      System.out.println("\033[32m Enhorabuena, respuesta correcta. \033[39;49m");
      }else {
        System.out.println("\033[31m Respuesta incorrecta. \033[39;49m");       
        }
        
    System.out.println("6. ¿Cual es la plataforma para subir contenido de programación que se usa en clase?");
      respuesta = System.console().readLine();
    if ("GitHub".equals(respuesta) || "Github".equals(respuesta) || "github".equals(respuesta)){
      contador++;
      System.out.println("\033[32m Enhorabuena, respuesta correcta. \033[39;49m");
      }else {
        System.out.println("\033[31m Respuesta incorrecta. \033[39;49m");       
        }
        
    System.out.println("7. ¿Como se le llama a los programas creados para programar?");
      respuesta = System.console().readLine();
    if ("IDE".equals(respuesta) || "Ide".equals(respuesta) || "ide".equals(respuesta)){
      contador++;
      System.out.println("\033[32m Enhorabuena, respuesta correcta. \033[39;49m");
      }else {
        System.out.println("\033[31m Respuesta incorrecta. \033[39;49m");       
        }
        
    System.out.println("8. ¿Que es más rápido un HDD o un SSD?");
      respuesta = System.console().readLine();
    if ("SSD".equals(respuesta) || "ssd".equals(respuesta)){
      contador++;
      System.out.println("\033[32m Enhorabuena, respuesta correcta. \033[39;49m");
      }else {
        System.out.println("\033[31m Respuesta incorrecta. \033[39;49m");       
        }
        
    System.out.println("9. ¿Como se dice Clave Primaria en inglés?");
      respuesta = System.console().readLine();
    if ("Primary Key".equals(respuesta) || "Primary key".equals(respuesta) || "primary key".equals(respuesta)){
      contador++;
      System.out.println("\033[32m Enhorabuena, respuesta correcta. \033[39;49m");
      }else {
        System.out.println("\033[31m Respuesta incorrecta. \033[39;49m");       
        }
        
    System.out.println("10. ¿Como se dice Máquina Virtual en inglés?");
      respuesta = System.console().readLine();
    if ("Virtual Machine".equals(respuesta) || "Virtual machine".equals(respuesta) || "virtual machine".equals(respuesta)){
      contador++;
      System.out.println("\033[32m Enhorabuena, respuesta correcta. \033[39;49m");
      }else {
        System.out.println("\033[31m Respuesta incorrecta. \033[39;49m");       
        }
    
       System.out.println("\033[93m Has obtenido un total de "+contador+" puntos. \033[39;49m");
     
      }
    }


