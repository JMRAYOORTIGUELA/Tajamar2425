package Principal;

import java.util.Scanner;

public class Ejercicio01 {

	static Scanner sc=new Scanner(System.in);
	
	public static int alea(int li,int ls) {
		
		return (int)(Math.random()*(ls-li+1))+li;
	}
	public static void rellenar(int m[][]) {
		
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				m[i][j]=alea(0,50);
			}
			
		}
	}
public static void imprimir(int m[][]) {
		
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				System.out.printf("%3d", m[i][j]);
			}
			System.out.println();
		}
	}
public static void diagonalPrincipal(int m[][]) {
	System.out.println();
	for (int i = 0; i < m.length; i++) {
		System.out.printf("%3d", m[i][i]);
	}
	System.out.println();
}
public static void diagonalInversa(int m[][]) {
	int c=m[0].length-1;
	System.out.println();
	for (int i = 0; i < m.length; i++) {
		System.out.printf("%3d", m[i][c-i]);
	}
	System.out.println();
}

	public static void main(String[] args) {
	  System.out.print("Indique el nº filas ");	
      int n=Integer.valueOf(sc.nextLine());
        int tb[][]=new int[n][n];
      rellenar(tb);
      imprimir(tb);
      diagonalPrincipal(tb);
      diagonalInversa(tb);

	}

}
