package Principal;

import java.util.Scanner;

public class Ejer23HojaBucles {
	static Scanner sc = new Scanner(System.in);
	
	public static boolean isPrimo(int n) {
		//Un nº primo es el que divisible entre 1 y el mismo
		
		for(int i=2;i<n;i++) {
			if (n%i==0) return false;
		}
		
		return true;
		
		
	}

	public static void main(String[] args) {
	
		for(int i=2;i<=100;i++) {
			if (isPrimo(i))System.out.println(i);
		}
		
		
	}

}
    