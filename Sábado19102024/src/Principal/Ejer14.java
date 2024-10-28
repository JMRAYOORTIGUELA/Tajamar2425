package Principal;

import java.util.Scanner;

public class Ejer14 {
	static Scanner sc=new Scanner(System.in);
	
	public static void main(String[] args) {
		
		System.out.print("Dime el numero");
		int a=sc.nextInt();
		
		if (a%2==0) {
			System.out.println("par");
		}
		
		if( a%5==0) {
			System.out.println("Divisible entre 5");
		}
		
	
	}

}
