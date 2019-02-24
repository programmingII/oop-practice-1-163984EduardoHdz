/*
  @EduardO Hdz
 Dia: 02/14/19
 Hora de inicio: 12:15
 Hora que se termino: 12:18
 */
import java.util.Scanner; //Se llama a la libreria para poder utilizar Scanner

public class Programa17_SumadeBinarios { //inicialiciamos la clase Programa17_SumadeBinarios
  
    public static void main(String[] args) { // inicializamos main 
        long binary1, binary2; // declaramos dos variables long
  	int i = 0, remainder = 0; //inicializamos dos variables enteras 
  	int[] sum = new int[20]; //creamos un arreglo de 20 entera
  	Scanner in = new Scanner(System.in); //Inicializamos el objeto Scanner

  	System.out.print("Input first binary number: "); //Se imprime un aviso para capturar el primer dato binario
  		binary1 = in.nextLong();  //Se recibe un dato long y se le asigna a banary1
  	System.out.print("Input second binary number: "); //Se imprime un aviso para capturar el segundo dato binario
  		binary2 = in.nextLong(); //Se recibe un dato long y se le asigna a banary2

  	while (binary1 != 0 || binary2 != 0) //Se crea un ciclo while con las condiciones que de que banary1 y binary2 tienen que ser diferentes a 0
  	{
   		sum[i++] = (int)((binary1 % 10 + binary2 % 10 + remainder) % 2); //Se le asignaa sum[] el residuo de la suma de (binary1, binary2 aplicandole mod 10 mas remainder) aplicando mod 2.
   		remainder = (int)((binary1 % 10 + binary2 % 10 + remainder) / 2); //Se le asignaa sum[] el cociente de la suma de (binary1, binary2 aplicandole mod 10 mas remainder) aplicando la division a 2.
   		binary1 = binary1 / 10; //Se va reduciendo un digito 
   		binary2 = binary2 / 10; //Se va reduciendo un digito
  	}
  	if (remainder != 0) //Se crea el if para cuando quede el cociente 1 en remainder para poderlo asignar al arreglo sum
	{ 
   		sum[i++] = remainder; //Se asigna el remainder a sum[]
  	}
 	 --i; //Se resta 1 al valor i para que en el arreglo quede en la ultima posicion con valor valido en el arreglo sum
  	System.out.print("Sum of two binary numbers: "); //se manda a imprimir un msj al usuario
  	while (i >= 0) //se crea un while con la sentencia 1 mayor o igual a 0
	{
   		System.out.print(sum[i--]); //manda a imprimir el resultado
  	}
   	System.out.print("\n");  //salto de linea
    }

  }