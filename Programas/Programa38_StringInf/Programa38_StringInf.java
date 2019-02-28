/*
  @EduardO Hdz
 Dia: 02/24/19
 Hora de inicio: 14:50
 Hora que se termino: 15:08
 */
import java.util.Scanner; 

public class Programa38_StringInf{ 
  
    public static void main(String[] args) { 
  	
    Scanner in = new Scanner(System.in); 
    System.out.print("introduce una cadena de texto: ");
        String letras = in.nextLine();
    count(letras);
    }
  
    public static void count(String x){
		char[] ch = x.toCharArray();
		int letras = 0;
		int espacios = 0;
		int numeros = 0;
		int otros = 0;
		for(int i = 0; i < x.length(); i++){
			if(Character.isLetter(ch[i])){
				letras ++ ;
			}
			else if(Character.isDigit(ch[i])){
				numeros ++ ;
			}
			else if(Character.isSpaceChar(ch[i])){
				espacios ++ ;
			}
			else{
				otros ++;
			}
		}
		System.out.println("El string es : "+x);
		System.out.println("letras: " + letras);
		System.out.println("espacios: " + espacios);
		System.out.println("numberos: " + numeros);
		System.out.println("otros: " + otros);

}
}