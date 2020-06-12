import java.util.Scanner;

public class Caso22 {
	
	public static void main(String[]args) {
		
		Scanner sc = new Scanner (System.in);
				
		//lectura de datos
		System.out.print("Nombre: ");
		String nom = sc.nextLine();
		System.out.print("Nota 1(20%): ");
		float n1 = sc.nextFloat();
		System.out.print("Nota 2(30%): ");
		float n2 = sc.nextFloat();
		System.out.print("Nota 3(50%): ");
		float n3 = sc.nextFloat();
				
		float notaF = n1*0.2f+n2*0.3f+n3*0.5f;
		

		
		//Salida de datos
		System.out.println("------------");
		System.out.println("RESULTADOS");
		System.out.println("------------");
		System.out.println("La nota final de "+nom+" es "+notaF);
	
		
		
	}
}	