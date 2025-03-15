package JuegoRuletaRusa;

import java.util.Scanner;

public class Inicio {
    
	public static Scanner sc=new Scanner(System.in);
	
	public static void main(String[] args) {
		
		System.out.print("Dime el numero de jugadores (1-6)");
		int njugadores=sc.nextInt();
		Juego ruletarusa=new Juego(njugadores);

		while(!ruletarusa.finjuego()) {
			ruletarusa.ronda();
		}
	}

}
