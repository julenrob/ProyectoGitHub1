import java.util.*;

public class UsoComptador {
	
	public static void main (String[] args){
		
		Scanner entrada = new  Scanner(System.in);
		Comptador UsarContador = new Comptador();
		
		System.out.println("Dime el numero menor del rango: ");
		int x = entrada.nextInt();
		
		System.out.println("Dime el numero mayor del rango: ");
		int y = entrada.nextInt();
		
		int resultado = (UsarContador.Comptador(x, y));
		
		if ( resultado == -1 ) {
			System.out.println("Error, valor introducido incorrecto.");
		} else {
			System.out.println("Resultado: " + resultado);

		}
		
		
		entrada.close();
	}
	
}