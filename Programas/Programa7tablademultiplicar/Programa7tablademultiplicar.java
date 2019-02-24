/*
  @EduardO Hdz
 Hora de inicio: 22:03
 Hora que se termino: 22:06
 */
import java.util.Scanner;

public class Programa7tablademultiplicar {
  
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
      
        System.out.print("Introduce el numero que quieres la tabla de multiplicar ");
  	    int num1 = in.nextInt();
   		
      	for(int i = 1; i<= 10 ; i++)
        {
          
          System.out.println(num1 + " x " + i + " = " + (num1 * i));
          
        }
    }

  }