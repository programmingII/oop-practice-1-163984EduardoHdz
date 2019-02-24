/*
  @EduardO Hdz
 Dia: 16/02/19
 Hora de inicio: 18:40
 Hora que se termino: 18:52
 */

import java.util.Scanner; //La libreria que permite utilizar Scanner para la captura de datos

public class Programa22_BinToDec {
    public static void main(String[] args) {
        // TODO code application logic here
	
	Scanner in = new Scanner(System.in); //Creamos el Scanner para poderlo utilizarlo
	String x;
	System.out.println("Introduce el numero Binario a convertir a Decimal");
    x = in.nextLine();
	System.out.println("La conversion a Decimal es: \n"+ Integer.parseInt(x,2));
    }
    
}