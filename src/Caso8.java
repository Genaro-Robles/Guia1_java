import java.util.Scanner;

public class Caso8 {
	
	public static void main(String[]args) {
		
		Scanner sc = new Scanner (System.in);
		
		//lectura de datos
		System.out.print("Lado del cuadrado: ");
		int n1 = sc.nextInt();
		
			
		//Procesamiento
		
		int area = (int) Math.pow(n1, 2);
		int perimetro = n1*4;

		
		
		//Salida de datos
		System.out.println("------------");
		System.out.println("RESULTADOS");
		System.out.println("------------");
		System.out.println("Area: "+ area);
		System.out.println("Perimetro: "+ perimetro);


	}
}