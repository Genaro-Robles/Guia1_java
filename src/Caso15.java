import java.util.Scanner;
import java.text.DecimalFormat;

public class Caso15 {
	
	public static void main(String[]args) {
		
		Scanner sc = new Scanner (System.in);
		DecimalFormat df = new DecimalFormat("#.00");
		
		//lectura de datos
		System.out.print("cantidad: ");
		float n1 = sc.nextFloat();
		System.out.print("precio: ");
		float n2 = sc.nextFloat();
		
		float importe = n1*n2;

		
		//Salida de datos
		System.out.println("------------");
		System.out.println("RESULTADOS");
		System.out.println("------------");
		System.out.println("Importe(soles): "+ df.format(importe));
		System.out.println("Importe(dolares): "+ df.format(importe/3.24f));
		System.out.println("Importe(euros): "+ df.format(importe/3.75f));
		

	}
}