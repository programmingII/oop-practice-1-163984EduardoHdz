/*
  @EduardO Hdz
 Dia: 02/24/19
 Hora de inicio: 19:41
 Hora que se termino: 22:00
 */
import java.util.Scanner;
public class Programa41_ASCII{ 
  
    public static void main(String[] args) { 
       Scanner in = new Scanner(System.in);
       System.out.println("Introduce un caracter :");
       String cadena = in.nextLine();
       int x=cadena.charAt(0);
      String n=Integer.toBinaryString(x);
      System.out.println("El equivalente a ascii seria "+x);
    }
}