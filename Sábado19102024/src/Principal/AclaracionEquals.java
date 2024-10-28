package Principal;

import java.util.Scanner;

public class AclaracionEquals {

	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		
		System.out.print("Dime una palabra ");
		String palabra=sc.nextLine();
		
		System.out.println("La palabra en mayusculas es"+palabra.toUpperCase());
		System.out.println("La palabra en minuscula es"+palabra.toLowerCase());
		
		
		if (palabra.toLowerCase().equals("hola")){
			System.out.println("La palabra es hola");
		}else {
			System.out.println("La palabra es distinta de hola");
		}
	}

}
