package Principal;

import java.util.Scanner;

public class Ejer02HojaMatrices {
  
	static Scanner sc=new Scanner(System.in);
   
	
	public static void imprimir(int m[][]) {
		for(int i=0;i<m.length;i++) {
			for(int j=0;j<m[i].length;j++) {
				System.out.printf("%3d",m[i][j]);
			}
			System.out.println();
			
		}
	}
	public static void rellenar(int m[][]) {

		for(int i=0;i<m.length;i++) {
			for(int j=0;j<m[i].length;j++) {
			  System.out.printf("[%d][%d] ",i,j);	
			  m[i][j]=Integer.valueOf(sc.nextLine());
			}
		}
	}
	
	public static void main(String[] args) {
	int matriz[][]=new int[4][5];
	rellenar(matriz);
	imprimir(matriz);
	
	}

}
