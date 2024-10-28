package Principal;

import java.util.Scanner;

public class Ejer15 {

	static Scanner sc=new Scanner(System.in);
	
	public static void main(String[] args) {
	System.out.print("Dime el caracter de relleno");
	String a=sc.next();
	System.out.println("Dime el tipo de piramide");
	System.out.println("1.-Punta hacia arriba");
	System.out.println("2.-Punta hacia abajo");
	System.out.println("3.-Punta hacia la derecha");
	System.out.println("4.-Punta hacia la izquierda");
	int op=sc.nextInt();
		
    switch(op) {
    
    case 1:
		 System.out.println("  "+a);
		 System.out.println(" "+a+a+a);
		 System.out.println(a+a+a+a+a);
		 break;
    case 2:
	 
	     System.out.println(a+a+a+a+a);
	     System.out.println(" "+a+a+a);
	     System.out.println("  "+a);
	     break;
    case 3:
    	 System.out.println(a);
    	 System.out.println(a+" "+a);
    	 System.out.println(a+" "+a+" "+a);
    	 System.out.println(a+" "+a);
    	 System.out.println(a);
    	 break;
    case 4:
    	 System.out.println("    "+a);
    	 System.out.println("  "+a+" "+a);
    	 System.out.println(a+" "+a+" "+a);
    	 System.out.println("  "+a+" "+a);
    	 System.out.println("    "+a);
         break;
	 
	}

}
}
