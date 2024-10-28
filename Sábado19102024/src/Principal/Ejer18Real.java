package Principal;

import java.util.Scanner;

public class Ejer18Real {
	static Scanner sc=new Scanner(System.in);
	
	
	public static void main(String[] args) {
		
		System.out.print("Dime el caracter de relleno");
		int n=sc.nextInt();
		int c=0;
		
		if( n<10) {
			c=n;
		}else if (n>=10 && n<100) {
			c=n/10;
		}else if (n>=100 && n<1000) {
			c=n/100;
		}else if (n>=1000 && n<10000) {
			c=n/1000;
		}else if (n>=10000) {
			c=n/10000;
		}
  System.out.println("El primer digito es "+c);
	}

}
