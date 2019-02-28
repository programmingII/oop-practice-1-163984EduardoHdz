/*
  @EduardO Hdz
 Dia: 02/24/19
 Hora de inicio: 14:38
 Hora que se termino: 14:47
 */
import java.util.Scanner; 

public class Programa37_ReverseString{ 
  
    public static void main(String[] args) { 
  	
    Scanner in = new Scanner(System.in); 
    System.out.print("introduce una cadena de texto: ");
        char[] letras = in.nextLine().toCharArray();
    System.out.print("string inverso: ");
    for (int i = letras.length - 1; i >= 0; i--) {
        System.out.print(letras[i]);
    }
    System.out.print("\n");
}
}