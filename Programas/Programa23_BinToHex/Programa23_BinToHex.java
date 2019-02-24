/*
  @EduardO Hdz
 Dia: 16/02/19
 Hora de inicio: 19:30
 Hora que se termino: 19:50
 */

import java.util.Scanner; //La libreria que permite utilizar Scanner para la captura de datos

public class Programa23_BinToHex {
    public static void main(String[] args) {
        // TODO code application logic here
	
	Scanner in = new Scanner(System.in); //Creamos el Scanner para poderlo utilizarlo
	String x,y;
    int z;
	System.out.println("Introduce el numero Binario a convertir a Hexadecimal");
    x = in.nextLine();
    z = Integer.parseInt(x,2);
	System.out.println("La conversion a Decimal es: \n"+ Integer.toHexString(z));
    }
    
}