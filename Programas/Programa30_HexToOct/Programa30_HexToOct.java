/*
  @EduardO Hdz
 Dia: 21/02/19
 Hora de inicio: 12:38
 Hora que se termino: 12:41
 */

import java.util.Scanner; //La libreria que permite utilizar Scanner para la captura de datos

public class Programa30_HexToOct {
    public static void main(String[] args) {
        // TODO code application logic here
	
	Scanner in = new Scanner(System.in); //Creamos el Scanner para poderlo utilizarlo
	String x,y;
       int z;
	System.out.println("Introduce el numero Hexadecimal a convertir a Octal");
    x = in.nextLine();
    z = Integer.parseInt(x,16); 
	System.out.println("La conversion a Binario es: \n"+ Integer.toOctalString(z));
    }
    
}