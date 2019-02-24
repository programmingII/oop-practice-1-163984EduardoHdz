/*
  @EduardO Hdz
 Dia: 07/02/19
 Hora de inicio: 12:19
 Hora que se termino: 12:29
 */

import java.util.Scanner; //La libreria que permite utilizar Scanner para la captura de datos

public class Programa13_areayperimetroRec {
    public static void main(String[] args) {
        // TODO code application logic here
	Scanner in = new Scanner(System.in); //Creamos el Scanner para poderlo utilizarlo
	
	System.out.print("Introduce el ancho: ");                                                           //imprimimos un texto para que introduzca el ancho
  	    float ancho = in.nextFloat();                                                                   //Capturamos el ancho
	System.out.print("Introduce la altura: ");                                                          //imprimimos un texto para que introduzca la altura
  	    float altura = in.nextFloat();                                                                  //Capturamos la altura
        System.out.println("El area es " +ancho+ " * " +altura+ " es: " +(ancho * altura));                 //Se manda a imprimir la multiplicacion de ancho * altura
	System.out.println("El perimetro es 2 (" +ancho+ " * " +altura+ ") es: " +(2 * ( ancho * altura ) ) ); //Se manda a imprimir la multiplicacion de (ancho * altura) * 2
    }
    
}