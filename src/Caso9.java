import java.util.Scanner;

public class Caso9 {
	
	public static void main(String[]args) {
		
		Scanner sc = new Scanner (System.in);
		
		//lectura de datos
		System.out.print("Lado A: ");
		int n1 = sc.nextInt();
		System.out.print("Lado B: ");
		int n2 = sc.nextInt();
		
			
		//Procesamiento
		
		int area = n1*n2;
		int perimetro = (n1+n2)*2;

		
		
		//Salida de datos
		System.out.println("------------");
		System.out.println("RESULTADOS");
		System.out.println("------------");
		System.out.println("Area: "+ area);
		System.out.println("Perimetro: "+ perimetro);


	}
}