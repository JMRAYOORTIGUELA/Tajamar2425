package Principal;

import java.util.Scanner;

public class Ejer10BuclesHoja2 {

	 
	static Scanner sc=new Scanner(System.in);

	public static void main(String[] args) {
     int suma=0,c=0,numero;
    
    while(true) {
       System.out.print("Indique el siguiente numero.Si es negativo terminara el proceso ");
       numero=Integer.valueOf(sc.nextLine());	
       if (numero<0)break;
       suma +=numero;
       c++;
    }
    System.out.printf("suma=%d nº=%d media=%.2f",suma,c,(double)suma/c);	
 
	
		
	    
	
	}

}
