import java.util.Scanner;

public class Caso23 {
	
	public static void main(String[]args) {
		
		Scanner sc = new Scanner (System.in);
				
		//lectura de datos
		System.out.print("Producto: ");
		String nom = sc.nextLine();
		System.out.print("Precio: ");
		float n1 = sc.nextFloat();
		System.out.print("Cantidad: ");
		float n2 = sc.nextFloat();
		
		float imp = n1*n2;
		float igv = imp*0.18f;
		float desc = imp*0.03f;
		float total = imp+igv-desc;

		
		//Salida de datos
		System.out.println("------------");
		System.out.println("RESULTADOS");
		System.out.println("------------");
		System.out.println("Importe: "+imp);
		System.out.println("IGV: "+igv);
		System.out.println("Descuento: "+desc);
		System.out.println("Total: "+total);
	
		
		
	}
}	