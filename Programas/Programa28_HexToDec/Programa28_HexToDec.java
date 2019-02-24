/*
  @EduardO Hdz
 Dia: 21/02/19
 Hora de inicio: 12:29
 Hora que se termino: 12:32
 */

import java.util.Scanner; //La libreria que permite utilizar Scanner para la captura de datos

public class Programa28_HexToDec {
    public static void main(String[] args) {
        // TODO code application logic here
	
	Scanner in = new Scanner(System.in); //Creamos el Scanner para poderlo utilizarlo
	String x;
	System.out.println("Introduce el numero Hexadecimal a convertir a Decimal");
    x = in.nextLine();
	System.out.println("La conversion a Decimal es: \n"+ (Integer.parseInt(x,16)));
    }
    
}