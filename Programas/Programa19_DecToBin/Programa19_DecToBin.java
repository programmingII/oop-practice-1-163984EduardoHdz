/*
  @EduardO Hdz
 Dia: 16/02/19
 Hora de inicio: 18:10
 Hora que se termino: 18:15
 */

import java.util.Scanner; //La libreria que permite utilizar Scanner para la captura de datos

public class Programa19_DecToBin {
    public static void main(String[] args) {
        // TODO code application logic here
	
	Scanner in = new Scanner(System.in); //Creamos el Scanner para poderlo utilizarlo
	String x;
	System.out.println("Introduce el numero decimal a convertir a binario");
    x = in.nextLine();
	System.out.println("La conversion a binario es: \n"+Integer.toBinaryString((Integer.parseInt(x, 10))));
    }
    
}