import java.util.Scanner;

public class Caso19 {
	
	public static void main(String[]args) {
		
		Scanner sc = new Scanner (System.in);
				
		//lectura de datos
		System.out.print("lado 1: ");
		int n1 = sc.nextInt();
		System.out.print("lado 2: ");
		int n2 = sc.nextInt();
		System.out.print("lado 3: ");
		int n3 = sc.nextInt();
		
		int perimetro = n1+n2+n3;
		

		
		//Salida de datos
		System.out.println("------------");
		System.out.println("RESULTADOS");
		System.out.println("------------");
		System.out.println("Perimetro: "+ perimetro);
	
		
		
	}
}	