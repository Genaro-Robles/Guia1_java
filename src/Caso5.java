import java.util.Scanner;

public class Caso5 {
	
	public static void main(String[]args) {
		
		Scanner sc = new Scanner (System.in);
		
		//lectura de datos
		System.out.print("N�mero 1: ");
		float n1 = sc.nextFloat();
		
		System.out.print("N�mero 2: ");
		float n2 = sc.nextFloat();
		
		//Procesamiento
		
		float prom =  (n1 + n2)/2;
		float op1 =  n1 + (n1*0.2f);
		float op2 =  n2 - (n2*0.3f); //CAST -> hacer conversion de datos
		
		
		//Salida de datos
		System.out.println("------------");
		System.out.println("RESULTADOS");
		System.out.println("------------");
		System.out.println("Promedio: "+prom);
		System.out.println("Operacion 1(aumento 20%): "+op1);
		System.out.println("Operacion 2:(disminuci�n 30%) "+op2);
	}
}
