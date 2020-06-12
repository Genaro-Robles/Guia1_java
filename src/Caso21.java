import java.util.Scanner;

public class Caso21 {
	
	public static void main(String[]args) {
		
		Scanner sc = new Scanner (System.in);
				
		//lectura de datos
		System.out.print("Valor gasto: ");
		float n1 = sc.nextFloat();
				
		float decremento = n1-(n1*0.12f);
		

		
		//Salida de datos
		System.out.println("------------");
		System.out.println("RESULTADOS");
		System.out.println("------------");
		System.out.println("Decremento (12%): "+ decremento);
	
		
		
	}
}	