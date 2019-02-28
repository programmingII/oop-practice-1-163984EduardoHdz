/*
  @EduardO Hdz
 Dia: 02/24/19
 Hora de inicio: 14:10
 Hora que se termino: 14:28
 */
import java.util.Scanner; 

public class Programa36_DisEnt2Puntos{ 
  
    public static void main(String[] args) { 
  	
  	Scanner in = new Scanner(System.in); 
    System.out.println("Introduce la latitude de la coordenada 1: ");
    	double lat1 = in.nextDouble();
    System.out.println("Introduce la longitude de la coordenada 1: ");
    	double lon1 = in.nextDouble();
    System.out.println("Introduce la latitude de la coordenada 2: ");
    	double lat2 = in.nextDouble();
    System.out.println("Introduce la longitude de la coordenada 2: ");
    	double lon2 = in.nextDouble();
	System.out.print("La distancia entre dos puntos es: " + dis_Entre_LatLon(lat1, lon1, lat2, lon2) + " km\n");
  }
  public static double dis_Entre_LatLon(double lat1, double lon1, double lat2, double lon2) {
        lat1 = Math.toRadians(lat1);
        lon1 = Math.toRadians(lon1);
        lat2 = Math.toRadians(lat2);
        lon2 = Math.toRadians(lon2);

        double RadioTierra = 6371.01;
        return RadioTierra * Math.acos(Math.sin(lat1)*Math.sin(lat2) + Math.cos(lat1)*Math.cos(lat2)*Math.cos(lon1 - lon2));
    }
    }