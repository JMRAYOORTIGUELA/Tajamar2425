package Principal;

import java.util.Scanner;

public class Ejer19Hoja3 {
	static Scanner sc = new Scanner(System.in);
	/***************************************************************/
	public static void haciaabajo(int n) {
		for (int i = 1; i <= n; i++) {
			System.out.println(" ".repeat(i - 1) +
					"*".repeat(n - i) + "*" + "*".repeat(n - i));
		}
	}
	/***************************************************************/
	public static void haciaarriba(int n) {
		for (int i = n; i >= 1; i--) {
			System.out.println(" ".repeat(i - 1) + 
					"*".repeat(n - i) + "*" + "*".repeat(n - i));
		}
	}

	/***************************************************************/
	public static void haciaDerecha(int n) {
		for(int i=1;i<=n;i++)System.out.println("*".repeat(i));
		for(int i=n-1;i>=1;i--)System.out.println("*".repeat(i));
	}
	/***************************************************************/
	public static void haciaIzquierda(int n) {
		for(int i=1;i<=n;i++) System.out.println(" ".repeat(n-i)+"*".repeat(i));
		for(int i=n-1;i>=1;i--)System.out.println(" ".repeat(n-i)+"*".repeat(i));
	}
	/***************************************************************/
	
	
	public static void main(String[] args) {
		int op;
		String basura;
		System.out.print("Dime la altura de mi piramide ");
		int altura=Integer.valueOf(sc.nextLine());
		
		do {
			System.out.println("1.-Hacia arriba");
			System.out.println("2.-Hacia abajo");
			System.out.println("3.-Izquierda");
			System.out.println("4.-Derecha");
			System.out.println("5.-Salir");
			System.out.print("\tDime la opción a realizar");
			op=Integer.valueOf(sc.nextLine());
			switch(op) {
			case 1: //arriba
				haciaarriba(altura);
				break;
			case 2: //abajo
				haciaabajo(altura);
				break;	
			case 3: //Izquierda
				haciaIzquierda(altura);
				break;	
			case 4: //Derecha
				haciaDerecha(altura);
				break;		
			}
			if (op!=5) {
			System.out.print("Presione una tecla para continuar ");
			basura=sc.nextLine();
			}
			
		}while(op!=5);

	}
	/***************************************************************/
}
