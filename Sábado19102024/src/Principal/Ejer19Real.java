package Principal;

import java.util.Scanner;

public class Ejer19Real {
	static Scanner sc=new Scanner(System.in);
	
	
	public static void main(String[] args) {
		
		System.out.print("Dime el caracter de relleno");
		int n=sc.nextInt();
		int c=0;
		
		if( n<10) {
			c=1;
		}else if (n>=10 && n<100) {
			c=2;
		}else if (n>=100 && n<1000) {
			c=3;
		}else if (n>=1000 && n<10000) {
			c=4;
		}else if (n>=10000) {
			c=5;
		}
  System.out.println("El primer digito es "+c);
	}

}
