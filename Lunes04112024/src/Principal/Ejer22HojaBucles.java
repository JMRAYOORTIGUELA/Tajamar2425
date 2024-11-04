package Principal;

import java.util.Scanner;

public class Ejer22HojaBucles {
	static Scanner sc = new Scanner(System.in);
	

	public static void main(String[] args) {
	int suma=0,c=0,numero;
	
	    do {
           System.out.print("Dime el siguiente numero");
           numero=Integer.valueOf(sc.nextLine());
           suma +=numero;
           c++;
	    }while(suma<100); 
		
	    if (suma>100) {
	    	suma -=numero;
	    	c--;
	    }
		
	    System.out.printf("suma=%d contador=%d media=%.2f",suma,c,(double)suma/c);
		
		
		
	}

}
    