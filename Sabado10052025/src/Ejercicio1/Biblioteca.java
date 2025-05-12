package Ejercicio1;

import java.util.Scanner;

public class Biblioteca {

	public static int menu(String op[],Scanner sc) {
		int n=0;
		
		do {
			for (String item : op) 	System.out.println(item);
			System.out.print("Eliga una opción ");
			n=Integer.valueOf(sc.nextLine());
		
		}while(n<1||n>op.length);
		return n;
	}
	
	
}
