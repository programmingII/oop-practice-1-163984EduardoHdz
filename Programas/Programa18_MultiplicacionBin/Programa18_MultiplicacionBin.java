/*
  @EduardO Hdz
 Dia: 16/02/19
 Hora de inicio: 17:50
 Hora que se termino: 18:05
 */

import java.util.Scanner; //La libreria que permite utilizar Scanner para la captura de datos

public class Programa18_MultiplicacionBin {
    public static void main(String[] args) {
        // TODO code application logic here
	
	Scanner in = new Scanner(System.in); //Creamos el Scanner para poderlo utilizarlo
	String x,y;
	System.out.println("Introduce el primer numero binario");
	x = in.nextLine();
	System.out.println("Introduce el segundo numero binario");
	y = in.nextLine();
	System.out.println("El resultado de la multiplicacion entre estos dos binarios es: "+(Integer.toBinaryString(Integer.parseInt(x,2)*Integer.parseInt(y,2))));
	
    }
    
}