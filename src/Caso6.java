import java.util.Scanner;

public class Caso6 {
	
	public static void main(String[]args) {
		
		Scanner sc = new Scanner (System.in);
				
		//Procesamiento
		
		float op1= (float) Math.pow(5, 3);
		float op2= (float) Math.pow(81, 1/2.0);
		float op3=(float) Math.pow(125, 1/3.0);
		float op4=(float) Math.pow(256, 1/4.0)+(float) Math.pow(25, 1/2.0);

		
		
		//Salida de datos
		System.out.println("------------");
		System.out.println("RESULTADOS");
		System.out.println("------------");
		System.out.println("operacion 1: "+ op1);
		System.out.println("operacion 1: "+ op2);
		System.out.println("operacion 1: "+ op3);
		System.out.println("operacion 1: "+ op4);


	}
}