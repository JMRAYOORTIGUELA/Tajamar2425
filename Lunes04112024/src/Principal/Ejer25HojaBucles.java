package Principal;

import java.util.Scanner;

public class Ejer25HojaBucles {
	static Scanner sc = new Scanner(System.in);
	

	public static int reverso(int n) {
	int numero=n,reverso=0;	
		
	while(numero>0) {	
		reverso=(reverso*10)+(numero%10);
		numero /=10;
	}	
	
	return reverso;
	
	}

	

	public static void main(String[] args) {
	    System.out.print("Dime la altura de la piramide ");
	    int n=Integer.valueOf(sc.nextLine());
	    System.out.println(reverso(n));
		
		
	}

}
    