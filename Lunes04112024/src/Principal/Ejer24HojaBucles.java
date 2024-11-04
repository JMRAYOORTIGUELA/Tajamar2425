package Principal;

import java.util.Scanner;

public class Ejer24HojaBucles {
	static Scanner sc = new Scanner(System.in);
	

	public static void haciaarriba(int n) {
		String cadena;
		for(int i=n;i>=1;i--) {
			cadena=" ".repeat(i-1);
			for(int j=1;j<=n-i+1;j++) cadena +=String.valueOf(j);
			for(int j=n-i;j>=1;j--) cadena +=String.valueOf(j);
			System.out.println(cadena);
		}
		
	}
	

	public static void main(String[] args) {
	    System.out.print("Dime la altura de la piramide ");
	    int n=Integer.valueOf(sc.nextLine());
	    haciaarriba(n);
		
		
	}

}
    