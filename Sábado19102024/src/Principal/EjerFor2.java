package Principal;

import java.util.Scanner;

public class EjerFor2 {
	
	static Scanner sc=new Scanner(System.in);
	
	
	
	public static void main(String[] args) {
	System.out.print("Dime el numero ");
	double numero=sc.nextDouble();
	
	
	   for(int i=1;i<=10;i++) {
		   System.out.printf("%10.2f * %2d= %10.2f\n",numero,i,numero*i);
	   }

	}

}
