package Principal;

import java.util.Scanner;

public class Ejer07BuclesHoja2 {

	 static Scanner sc=new Scanner(System.in);
	 
	public static void main(String[] args) {
      int secreto=1234,numero=0;
	
		for(int i=1;i<=4;i++) {
			System.out.print("Dime el numero secreto ");
			numero=Integer.valueOf(sc.nextLine());
			
			if (numero==secreto) {
				System.out.println("Enhorabuena ha acertado en el intento "+i);
				break;
			}
		}
       
		if (numero!=secreto)System.out.println( "Lo siento,no sabe la combinación");	
		
	    
	
	}

}
