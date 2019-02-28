/*
  @EduardO Hdz
 Dia: 02/24/19
 Hora de inicio: 15:10
 Hora que se termino: 15:33
 */

public class Programa39_3sinrep{ 
  
    public static void main(String[] args) { 
    	int x = 0;
		for(int i = 1; i <= 4; i++){
			for(int j = 1; j <= 4; j++){
				for(int k = 1; k <= 4; k++){
					if(k != i && k != j && i != j){
						x++;
						System.out.println(i + "" + j + "" + k);
					}
				}
			}
		}
		System.out.println("Cantidad total de numeros de 3 digitos es " + x);
}
}