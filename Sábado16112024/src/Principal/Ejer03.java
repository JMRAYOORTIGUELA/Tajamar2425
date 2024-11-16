package Principal;

import java.util.Iterator;

public class Ejer03 {
	
	public static int alea(int li, int ls) {

		return (int) (Math.random() * (ls - li + 1)) + li;
	}
	public static void rellenar(int m[][]) {
		for(int i=0;i<m.length;i++) {
			for(int j=0;j<m[i].length;j++) {
				m[i][j]=alea(0,10);
			}
		}
	}
	public static void imprimir(int m[][]) {
		
		for(int i=0;i<m.length;i++) {
			for(int j=0;j<m[i].length;j++) {
			    System.out.printf("%3d", m[i][j]);
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {

		int notas[][]=new int[10][5];
		rellenar(notas);
		imprimir(notas);

	
		

	}

}
