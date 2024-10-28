package Principal;

import java.util.Scanner;

public class Ej10 {

	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		
		
		
		  System.out.print("Dime el numero"); 
		  int numero=sc.nextInt();
		  
		  String cadena=String.valueOf(Math.abs(numero));
		  
		  System.out.println(cadena.substring(0,1));
		 
		
	    

	}

}
