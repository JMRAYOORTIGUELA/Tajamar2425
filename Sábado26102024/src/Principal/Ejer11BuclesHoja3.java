package Principal;

import java.util.Scanner;

public class Ejer11BuclesHoja3 {

	 
	static Scanner sc=new Scanner(System.in);

	public static void main(String[] args) {
	System.out.println("Dime el numero ");	
    double numero=Double.valueOf(sc.nextLine());
		
    for(int i=(int)numero;i<(int)numero+5;i++) {
    	System.out.printf("%d %.0f %.0f\n",i,Math.pow(i, 2),Math.pow(i, 3));
    }
    
		
	    
	
	}

}
