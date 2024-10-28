package principal;

import java.util.Scanner;

public class ejer4 {

	static Scanner sc=new Scanner(System.in);
	
	
	public static void main(String[] args) {
		
		System.out.println("Dime un diaSemana ");
		int diaSemana = sc.nextInt();
				

		if (diaSemana == 1) {
			System.out.println("Lunes");
		} else if (diaSemana == 2) {
			System.out.println("Martes");

		} else if (diaSemana == 3) {
			System.out.println("Miércoles");

		} else if (diaSemana == 4) {
			System.out.println("Jueves");

		} else if (diaSemana == 5) {
			System.out.println("Viernes");

		} else if (diaSemana == 6) {
			System.out.println("Sábado");

		} else if (diaSemana == 7) {
			System.out.println("Domingo");

	}

		System.out.println("Final");
		
		
}
}
