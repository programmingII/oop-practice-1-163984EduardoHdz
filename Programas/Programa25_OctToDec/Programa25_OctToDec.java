/*
  @EduardO Hdz
 Dia: 16/02/19
 Hora de inicio: 19:52
 Hora que se termino: 19:55
 */

import java.util.Scanner; //La libreria que permite utilizar Scanner para la captura de datos

public class Programa25_OctToDec {
    public static void main(String[] args) {
        // TODO code application logic here
	
	Scanner in = new Scanner(System.in); //Creamos el Scanner para poderlo utilizarlo
	String x;
	System.out.println("Introduce el numero Octal a convertir a Decimal");
    	x = in.nextLine();
	System.out.println("La conversion a Decimal es: \n"+ (Integer.parseInt(x,8)));
    }
    
}