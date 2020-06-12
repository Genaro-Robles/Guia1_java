import java.util.Scanner;

public class Caso24 {
	
	public static void main(String[]args) {
		
		Scanner sc = new Scanner (System.in);
				
		//lectura de datos
		System.out.print("Numero 1: ");
		float n1 = sc.nextFloat();
		System.out.print("Numero 2: ");
		float n2 = sc.nextFloat();
		System.out.print("Numero 3: ");
		float n3 = sc.nextFloat();
				
		float op1 = n1/5+n2*0.2f;
		float op2 = (n3+(n3*0.6f))/2;
		float op3 = n1+n2+n3-(n1+n2+n3)*0.08f;
		

		
		//Salida de datos
		System.out.println("------------");
		System.out.println("RESULTADOS");
		System.out.println("------------");
		System.out.println("Operacion 1: "+op1);
		System.out.println("Operacion 2: "+op2);
		System.out.println("Operacion 3: "+op3);
			
	}
}	