/*
  @EduardO Hdz
 Dia: 02/24/19
 Hora de inicio: 18:49
 Hora que se termino: 18:53
 */
import java.nio.charset.Charset;
public class Programa40_LisCarEsp{ 
  
    public static void main(String[] args) { 
    	System.out.println("Lista de conjuntos de caracteres disponibles: ");  
    for (String str : Charset.availableCharsets().keySet()) {
      System.out.println(str);
    }
}
}