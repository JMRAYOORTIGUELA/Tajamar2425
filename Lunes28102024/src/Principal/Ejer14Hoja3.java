package Principal;

import java.util.Scanner;

public class Ejer14Hoja3 {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
     		System.out.print("Indique la base ");
			int base = Integer.valueOf(sc.nextLine());
			
			System.out.print("Indique la potencia ");
			int potencia = Integer.valueOf(sc.nextLine());
			
            int resultado=1;
            for(int i=1;i<=potencia;i++)resultado *=base;
            
		
            System.out.printf("%d^%d=%d",base,potencia,resultado);
	}
}
