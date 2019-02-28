/*
  @EduardO Hdz
 Dia: 02/24/19
 Hora de inicio: 13:14
 Hora que se termino: 13:23
 */
import java.util.Scanner; 

public class Programa33_SumadeDigInt { 
  
    public static void main(String[] args) { 
  	int i = 0, remainder = 0, x; 
  	int[] sum = new int[20]; 
  	Scanner in = new Scanner(System.in); 

  	System.out.print("Introduce un numero entero: "); 
  		x = in.nextInt();  
      
  	while (x != 0) 
  	{
   		sum[i++] = (int)((x % 10 + remainder) % 10); 
   		remainder = (int)((x % 10 + remainder) / 10); 
   		x = x / 10;  
  	}
  	if (remainder != 0) 
	{ 
   		sum[i++] = remainder; 
  	}
 	 --i; 
  	System.out.print("La suma de los digitos del numero entero es: ");
  	while (i >= 0) 
	{
   	  remainder = sum[i--] + remainder;
      //System.out.print(sum[i--]); 
  	}
   	System.out.print(remainder+"\n");  
    }

  }