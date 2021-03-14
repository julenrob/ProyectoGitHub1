

import java.util.*;

public class Comptador {

	static int Comptador (int x, int y){
		Scanner entrada = new Scanner (System.in);
		int num, c = 0;
		if (x>=0 && y>=0){
			System.out.println("Escriu un numero: ");
			num = entrada.nextInt();
			if (num>=x && num<=y){
				System.out.println("\nNumero en el rang.");
				c++;	
				
			}else{
				System.out.println("\nNumero fora del rang.");
				
			}
		}else{
					c=-1;
			}
			entrada.close();
			return c;
		}
}