/*
  @EduardO Hdz
 Dia: 07/02/19
 Hora de inicio: 12:45
 Hora que se termino: 12:55
 */

import java.util.Scanner; //libreria para poder invocar Scanner (para la captura de datos por teclado)

public class Programa15_swapVariables {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); //Aqui inicializamos el Scanner para poder capturar datos.
	
	System.out.println("Introduce la 1era variable: "); //imprimimos un texto para la 1era variable
		int variable1 = in.nextInt();               //Capturamos la primera variable
	System.out.println("Introduce la 2da variable: "); //imprimimos un texto para la 2da variable
		int variable2 = in.nextInt();               //Capturamos la segunda variable
	System.out.println("La primera variable es igual a " +variable1+ "\nLa segunda variable es igual a " +variable2); //mostramos los valores iniciales antes de cambiarlos
	int temp;                                            //creamos la variable temp para almacenar temporalmente un dato
	temp = variable1;                                    //almacenamos el valor de variable1 en temp
	variable1 = variable2;                               //igualamos el valor de variable2 en la variable1
	variable2 = temp;                                    //le asignamos a la variable2 el valor almacenado en temp que era originalmente de la variable1
	System.out.println("Ahora la primera variable es igual a " +variable1+ "\nY la segunda variable es igual a " +variable2);   //mostramos los resultados una vez intercambiado los valores originales
    }
    
}