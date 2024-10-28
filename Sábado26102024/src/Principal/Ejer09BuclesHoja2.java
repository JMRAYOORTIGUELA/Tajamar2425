package Principal;

import java.util.Scanner;

public class Ejer09BuclesHoja2 {

	 
	static Scanner sc=new Scanner(System.in);

	public static void main(String[] args) {
	System.out.print("Dime el numero ");
	int numero=Integer.valueOf(sc.nextLine());
	int digitos=0;
	int guardado=numero;
    
    while(true) {
         numero /=10;
         digitos++;
         if (numero==0)break;
    }
	
    System.out.printf("El numero=%d tiene %d digitos",guardado,digitos);
	
	
		
	    
	
	}

}
