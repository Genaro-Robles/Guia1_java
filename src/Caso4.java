import java.util.Scanner;

public class Caso4 {
	
	public static void main(String[]args) {
		
		Scanner sc = new Scanner (System.in);
		
		//lectura de datos
		System.out.print("Número 1: ");
		float num1 = sc.nextFloat();
		
		System.out.print("Número 2: ");
		float num2 = sc.nextFloat();
		
		//Procesamiento
		
		float suma =  num1 + num2;
		float resta =  num1 - num2;
		float producto =  num1 * num2;
		float division =  num1 / num2;
		float resto =  num1 % num2;
		
		//Salida de datos
		System.out.println("------------");
		System.out.println("RESULTADOS");
		System.out.println("------------");
		System.out.println("Suma: "+suma);
		System.out.println("Resta: "+resta);
		System.out.println("Producto: "+producto);
		System.out.println("Division: "+division);
		System.out.println("resto: "+resto);
	}
}
