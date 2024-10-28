package Principal;

import java.util.Scanner;

public class Ejer21 {
	   static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.print("Dime la primera nota ");
		int nota1= Integer.valueOf(sc.nextLine());
		System.out.print("Dime la segunda nota ");
		int nota2=Integer.valueOf(sc.nextLine());
		
		double media= (double)(nota1+nota2)/2;
		
		if (media>=5) {
			System.out.println("Tu nota media="+media);
		}else {
			System.out.print("¿Resultado de la recuperación (Apto/No apto) ? ");
			String respuesta=sc.nextLine();
			if (respuesta.toUpperCase().equals("APTO")) {
				System.out.println("Tu nota media=5");
			}else {
				System.out.println("NO APTO");
			}
		}

		
		
	}

}
