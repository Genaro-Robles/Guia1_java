import java.util.Scanner;

public class Caso10 {
	
	public static void main(String[]args) {
		
		Scanner sc = new Scanner (System.in);
		
		//lectura de datos
		System.out.print("Radio: ");
		float n1 = sc.nextFloat();
				
		
		//Procesamiento
		
		float area = 3.1416f*(float) Math.pow(n1, 2);
		float perimetro = n1*2*3.1416f;

		
		
		//Salida de datos
		System.out.println("------------");
		System.out.println("RESULTADOS");
		System.out.println("------------");
		System.out.println("Area: "+ area);
		System.out.println("Perimetro: "+ perimetro);


	}
}