/*
  @EduardO Hdz
 Hora de inicio: 21:48
 Hora que se termino: 21:51
 */
import java.util.Scanner;

public class Programa6_capturayoper {
  
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
      
        System.out.print("Introduce el 1er numero: ");
  	    float num1 = in.nextFloat();
   
 	    System.out.print("Introduce el 2do numero: ");
  	    float num2 = in.nextFloat();
   
 	    System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
        System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
        System.out.println(num1 + " x " + num2 + " = " + (num1 * num2));
        System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
        System.out.println(num1 + " % " + num2 + " = " + (num1 % num2)); 
    }

  }