/*
  @EduardO Hdz
 Dia: 16/02/19
 Hora de inicio: 18:25
 Hora que se termino: 18:31
 */

import java.util.Scanner; //La libreria que permite utilizar Scanner para la captura de datos

public class Programa21_DecToOct {
    public static void main(String[] args) {
        // TODO code application logic here
	
	Scanner in = new Scanner(System.in); //Creamos el Scanner para poderlo utilizarlo
	String x;
	System.out.println("Introduce el numero decimal a convertir a Octal");
    x = in.nextLine();
	System.out.println("La conversion a octal es: \n"+Integer.toOctalString((Integer.parseInt(x))));
    }
    
}