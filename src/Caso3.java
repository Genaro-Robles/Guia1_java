import java.util.Scanner;

public class Caso3 {

	public static void main(String[] args) {
		//instancia de la clase Scanner
		Scanner sc = new Scanner(System.in);	
		
		//Declarar y asignar un valor a la variable
		float n1= 0, n2=0;
		
		//Lectura de Datos
		System.out.print("Ingrese un numero: ");
		n1 = sc.nextFloat();
		System.out.print("Ingrese un segundo numero: ");
		n2 = sc.nextFloat();
		//Salida de Resultados
		System.out.println("Número ingresado 1: "+n1);
		System.out.println("Número ingresado 2: "+n2);
	}

}