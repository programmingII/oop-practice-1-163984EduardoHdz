/*
  @EduardO Hdz
 Dia: 02/24/19
 Hora de inicio: 13:53
 Hora que se termino: 13:58
 */
import java.util.Scanner; 

public class Programa35_AreaPol { 
  
    public static void main(String[] args) { 
  	
  	Scanner in = new Scanner(System.in); 
     System.out.print("Introduce de cuantos lados es el poligono: ");
        int lados = in.nextInt();
	System.out.print("Introduce el valor del lado del hexagono: ");
        double largo = in.nextDouble();
    System.out.print("El area del poligono es: " + PolArea(lados,largo)+"\n");
    }
  	public static double PolArea(int lados,double largo) {
        return (lados*(largo*largo))/(4*Math.tan(Math.PI/lados));
    }

  }