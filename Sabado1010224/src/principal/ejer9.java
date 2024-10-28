package principal;

import java.util.Scanner;

public class ejer9 {
	static Scanner sc = new Scanner(System.in);
	
	
	
	public static void main(String[] args) {
		System.out.println("Dime el valor de altura ");
		
		double altura=sc.nextDouble();
		
		final double g=9.81;
		
		double tiempo=Math.sqrt(    (2*altura)/g);
		
		System.out.println(tiempo);
		
		
		
		
		
		

	}

}
