package Principal;

import java.util.Scanner;

public class Ejer16Hoja3 {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
     		System.out.print("Indique la base ");
			int n = Integer.valueOf(sc.nextLine());
			boolean primo=true;
			
			for (int i=2;i<=n-1;i++) {
				if (n%i==0) {
					primo=false;
					break;
				}
		
           	}
			String cadena=  primo ? "Primo" :"No primo";
					
			System.out.printf("El nº=%d %s",n, cadena);
	}	
}
