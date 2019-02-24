/*
  @EduardO Hdz
 Hora de inicio: 23:08
 Hora que se termino: 23:11
 */
import java.util.Scanner;

public class Programa12_Promedio3numeros {
  
    public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      
        System.out.print("Introduce el 1er numero: ");
  	    float PrimerN = in.nextFloat();
        System.out.print("Introduce el 2do numero: ");
  	    float SegundoN = in.nextFloat();
        System.out.print("Introduce el 3er numero: ");
  	    float TercerN = in.nextFloat();
        
        System.out.println("El promedio de los 3 numeros es: "+ ((PrimerN+SegundoN+TercerN)/3));
        
    }

  }