package Principal;

import java.util.Scanner;

public class Ejer20HojaBucles {
	static Scanner sc = new Scanner(System.in);
	public static void piramideVacia(int n) {
		
		System.out.println(" ".repeat(n-1)+"*");
		
		for (int i = n-1; i > 1; i--) {
			System.out.println(" ".repeat(i - 1) +"*" 
		     +" ".repeat(2*(n-i-1)+1)
		     +"*");
		}
		System.out.println("*".repeat(2*n-1));
		
		
	}

	public static void main(String[] args) {
		System.out.print("Dime la altura de mi piramide ");
		piramideVacia(Integer.valueOf(sc.nextLine()));
	}

}
    