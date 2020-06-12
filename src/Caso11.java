import java.util.Scanner;

public class Caso11 {
	
	public static void main(String[]args) {
		
		Scanner sc = new Scanner (System.in);
		
		//lectura de datos
		System.out.print("Nombre: ");
		String n1 = sc.nextLine();

		
		//Salida de datos
		System.out.println("------------");
		System.out.println("RESULTADOS");
		System.out.println("------------");
		System.out.println("#Caracteres: "+ n1.length());
		

	}
}