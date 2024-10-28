package principal;

import java.util.Scanner;

public class ejer5 {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("Dime la hora(0-24");
		int hora = sc.nextInt();

		if (hora >= 6 && hora <= 12) {
			System.out.println("Buenos días");
		} else if (hora >= 13 && hora <= 20) {
			System.out.println("Buenos tardes");

		} else if (    (hora >= 21 && hora <= 24) || (hora < 5)   ) {

			System.out.println("Buenos Noches");
		}

	}

}
