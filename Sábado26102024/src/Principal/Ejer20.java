package Principal;

import java.util.Scanner;

public class Ejer20 {
    static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.print("Dime el numero ");
		int numero=sc.nextInt();
		boolean capicua=false;
		
		if(numero<10) {
			capicua=true;
		}else if( numero>=10 && numero<100) {   //dos cifras
 			//77
			if ((numero%10)==(numero/10))capicua=true; 
		}else if( numero>=100 && numero<1000) { //tres cifras
			//121
			if ((numero/100)==(numero%10)) capicua=true;
		}else if( numero>=1000 && numero<10000) { //cuatro cifras
			//1221
			if ((numero%10)==(numero/1000) && 
					((numero/100)%10==(numero/10)%10))capicua=true;
		     
		}else if(numero>=10000) {
			//12321
			if ( numero/10000==numero%10 &&
				(numero/1000)%10==(numero/10)%10
					)capicua=true;
		}
		
		System.out.println("El numero "+numero+" es "+capicua);

	}

}
