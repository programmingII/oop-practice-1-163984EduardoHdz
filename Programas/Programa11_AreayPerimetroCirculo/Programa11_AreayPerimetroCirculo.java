/*
  @EduardO Hdz
 Hora de inicio: 22:47
 Hora que se termino: 22:53
 */
import java.lang.Math;
import java.util.Scanner;

public class Programa11_AreayPerimetroCirculo {
  
    public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      
        System.out.print("Introduce el radio: ");
  	    float radio = in.nextFloat();
        
        System.out.println("Perimetro del circulo: "+ (2 * Math.PI * radio));
        System.out.println("Area del circulo: "+ (Math.PI * (radio * radio)));
    }

  }