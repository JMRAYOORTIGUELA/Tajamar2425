package Principal;

import java.util.Scanner;

public class Ejer11 {

	static Scanner sc=new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.print("Dime la hora");
		int hora=sc.nextInt();
		System.out.print("Dime los minutos");
		int minutos=sc.nextInt();
		
		int segundos=(hora*3600)+(minutos*60);
		int segundosDia=24*3600;
		int diferencia=segundosDia-segundos;
		
		System.out.printf("Hora=%2d Minutos=%2d Segundos hasta la media noche= %10d",hora,minutos,diferencia);
		

	}

}
