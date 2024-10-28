package Principal;

import java.util.Scanner;

public class Ejer13 {
	static Scanner sc=new Scanner(System.in);
	
	public static void main(String[] args) {
		int aux;

		System.out.print("Dime el primer numero");
		int a=sc.nextInt();
		System.out.print("Dime el segundo numero");
		int b=sc.nextInt();
		System.out.print("Dime el primer numero");
		int c=sc.nextInt();
		//a=3 b=7 c=2
		if(a>b) {
			aux=a;  
			a=b;    
			b=aux;  
		}
		//a=3 b=7 c=2
	    if (b>c) {
	    	aux=b;
	    	b=c;
	    	c=aux;
	    }
	  //a=3 b=2 c=7
	    if(a>b) {
	    	aux=a;  
			a=b;    
			b=aux;  
	    }
	    //a=2 b=3 c=7
	    System.out.println(a+" "+b+" "+c);
	    
	    
	}

}
