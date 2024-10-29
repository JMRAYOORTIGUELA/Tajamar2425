package Principal;

import java.util.Scanner;

public class Ejer15Hoja3 {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
     		System.out.print("Indique la base ");
			double base = Double.valueOf(sc.nextLine());
			
			System.out.print("Indique la potencia ");
			int potencia = Integer.valueOf(sc.nextLine());
			
            
            for(int i=1;i<=potencia;i++)
            System.out.printf("%.2f^%d=%.2f\n",base,i,Math.pow(base, i));
            
		
            	}
}
