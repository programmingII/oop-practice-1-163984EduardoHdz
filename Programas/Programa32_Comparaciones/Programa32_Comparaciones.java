/*
  @EduardO Hdz
 Dia: 21/02/19
 Hora de inicio: 13:08
 Hora que se termino: 12:18
 */

import java.util.Scanner;

public class Programa32_Comparaciones {
    public static void main(String[] args) {
        // TODO code application logic here
	
      Scanner in = new Scanner (System.in);
      int x,y;
      System.out.println("Favor de introducir el primer valor entero a comparar");
      x = in.nextInt();
      System.out.println("Favor de introducir el segundo valor entero a comparar");
      y = in.nextInt();
      if(x == y)
      {
        System.out.println(x+" == "+y);
        System.out.println(x+" <= "+y);
        System.out.println(x+" >= "+y);
      }
      else
      {
        System.out.println(x+" != "+y);
        if(x < y)
        {
        	System.out.println(x+" <  " +y);
        	System.out.println(x+" <= "+y); 
          
        }
        else
        {
         	System.out.println(x+" >  " +y);
        	System.out.println(x+" >= "+y); 
        }
      }
        
    }
    
}