import java.util.Scanner;
import java.text.DecimalFormat;

public class Caso18 {
	
	public static void main(String[]args) {
		
		Scanner sc = new Scanner (System.in);
		DecimalFormat df = new DecimalFormat("#.00");
		
		//lectura de datos
		System.out.print("base: ");
		int n1 = sc.nextInt();
		System.out.print("altura: ");
		int n2 = sc.nextInt();
		
		float area = (n1*n2)/2;
		

		
		//Salida de datos
		System.out.println("------------");
		System.out.println("RESULTADOS");
		System.out.println("------------");
		System.out.println("Area: "+ df.format(area));
	
		
		
	}
}	