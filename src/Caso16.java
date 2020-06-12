import java.util.Scanner;
import java.text.DecimalFormat;

public class Caso16 {
	
	public static void main(String[]args) {
		
		Scanner sc = new Scanner (System.in);
		DecimalFormat df = new DecimalFormat("#.00");
		
		//lectura de datos
		System.out.print("Horas trabajadas: ");
		float n1 = sc.nextFloat();
		System.out.print("Tarifa por hora: ");
		float n2 = sc.nextFloat();
		
		float pago = n1*n2;
		float bono = pago*0.05f;
		float total = pago + bono;

		
		//Salida de datos
		System.out.println("------------");
		System.out.println("RESULTADOS");
		System.out.println("------------");
		System.out.println("Sueldo: "+ df.format(pago));
		System.out.println("Bono: "+ df.format(bono));
		System.out.println("Total(soles): "+ df.format(total));
		System.out.println("Total(dolares): "+ df.format(total/3.24f));
		
		
	}
}