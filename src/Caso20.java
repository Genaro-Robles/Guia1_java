import java.util.Scanner;

public class Caso20 {
	
	public static void main(String[]args) {
		
		Scanner sc = new Scanner (System.in);
				
		//lectura de datos
		System.out.print("Precio venta: ");
		float n1 = sc.nextFloat();
				
		float incremento = n1+(n1*0.42f);
		

		
		//Salida de datos
		System.out.println("------------");
		System.out.println("RESULTADOS");
		System.out.println("------------");
		System.out.println("Incremento (42%): "+ incremento);
	
		
		
	}
}	