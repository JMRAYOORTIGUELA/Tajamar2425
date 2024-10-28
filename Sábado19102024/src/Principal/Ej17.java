package Principal;

import java.util.Scanner;

public class Ej17 {

	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.print("Dime el caracter de relleno");
		int numero=sc.nextInt();
		
		int numero1=(numero/10)*10;
		
		System.out.println(numero-numero1);
		

	}

}
