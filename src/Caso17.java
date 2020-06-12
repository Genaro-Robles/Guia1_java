import java.util.Scanner;
import java.text.DecimalFormat;

public class Caso17 {
	
	public static void main(String[]args) {
		
		Scanner sc = new Scanner (System.in);
		DecimalFormat df = new DecimalFormat("#.00");
		
		//lectura de datos
		System.out.print("Aprobados: ");
		int n1 = sc.nextInt();
		System.out.print("Desaprobados: ");
		int n2 = sc.nextInt();
		System.out.print("Retirados: ");
		int n3 = sc.nextInt();
		
		float total = n1+n2+n3;
		float por_apro = (n1*100)/total;
		float por_repro = (n2*100)/total;
		float por_reti = (n3*100)/total;

		
		//Salida de datos
		System.out.println("------------");
		System.out.println("RESULTADOS");
		System.out.println("------------");
		System.out.println("Aprobados: "+ df.format(por_apro)+"%");
		System.out.println("Desaprobados: "+ df.format(por_repro)+"%");
		System.out.println("Retirados: "+ df.format(por_reti)+"%");
		
		
		
	}
}	