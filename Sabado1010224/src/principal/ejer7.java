package principal;

import java.util.Scanner;

public class ejer7 {

	static Scanner sc = new Scanner(System.in);
	
	
	public static void main(String[] args) {

		System.out.print("Dime el valor de a ");
		int a=sc.nextInt();
		
		System.out.print("Dime el valor de b ");
		int b=sc.nextInt();
		
		
      if (a!=0) {
      System.out.println(    (double)-b/a      );
      }else{
    	System.out.println("La ecuacion no tiene valor en el mundo real");  
      }
		

	}

}
