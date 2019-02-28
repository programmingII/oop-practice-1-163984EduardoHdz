/*
  @EduardO Hdz
 Dia: 02/24/19
 Hora de inicio: 13:24
 Hora que se termino: 13:42
 */
import java.util.Scanner; 

public class Programa34_AreaHex { 
  
    public static void main(String[] args) { 
  	
  	Scanner in = new Scanner(System.in); 
	System.out.print("Introduce el valor del lado del hexagono: ");
        double largo = in.nextDouble();
        System.out.print("El area del hexagono es: " + hexArea(largo)+"\n");
    }
  	public static double hexArea(double largo) {
        return (6*(largo*largo))/(4*Math.tan(Math.PI/6));
    }

  }