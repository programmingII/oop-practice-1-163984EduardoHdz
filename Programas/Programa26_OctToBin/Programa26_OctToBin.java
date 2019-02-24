/*
  @EduardO Hdz
 Dia: 16/02/19
 Hora de inicio: 20:30
 Hora que se termino: 20:40
 */

import java.util.Scanner; //La libreria que permite utilizar Scanner para la captura de datos

public class Programa26_OctToBin {
    public static void main(String[] args) {
        // TODO code application logic here
	
	Scanner in = new Scanner(System.in); //Creamos el Scanner para poderlo utilizarlo
	String x,y;
    int z;
	System.out.println("Introduce el numero Octal a convertir a Binario");
    x = in.nextLine();
    z = Integer.parseInt(x,8); 
	System.out.println("La conversion a Binario es: \n"+ Integer.toBinaryString(z));
    }
    
}