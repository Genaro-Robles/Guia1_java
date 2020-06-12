import java.util.Scanner;

public class Caso14 {
	
	public static void main(String[]args) {
		
		Scanner sc = new Scanner (System.in);
		
		//lectura de datos
		System.out.print("Numero: ");
		int n1 = sc.nextInt();
				
		
		//Procesamiento
		
		int sumatoria=(n1*(n1+1))/2;

		
		
		//Salida de datos
		System.out.println("------------");
		System.out.println("RESULTADOS");
		System.out.println("------------");
		System.out.println("Area: "+ sumatoria);


	}
}