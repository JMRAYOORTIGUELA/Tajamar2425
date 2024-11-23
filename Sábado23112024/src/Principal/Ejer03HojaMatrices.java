package Principal;

import java.util.Scanner;

public class Ejer03HojaMatrices {
  
	static Scanner sc=new Scanner(System.in);
   
	/*
	 * public static int alea(int li,int ls) { return
	 * (int)(Math.random()*(ls-li+1))+li; }
	 */
	
	/*
	 * public static void imprimir(int m[][]) { for(int i=0;i<m.length;i++) {
	 * for(int j=0;j<m[i].length;j++) { System.out.printf("%6d",m[i][j]); }
	 * System.out.println();
	 * 
	 * } }
	 */
	public static void imprimirResultados(int m[][]) {
		int suma;
		int sumaColumnas[]=new int[  m[0].length       ];
		
		
		for(int i=0;i<m.length;i++) {
		     	suma=0;
			for(int j=0;j<m[i].length;j++) {
				System.out.printf("%6d",m[i][j]);
				suma +=m[i][j];
				sumaColumnas[j]+=m[i][j];
			}
			System.out.printf("%6d\n", suma);
		}
		
		
		suma=0;
		for(int i=0;i<sumaColumnas.length;i++) {
			System.out.printf("%6d",sumaColumnas[i]);
			suma +=sumaColumnas[i];
		}
		System.out.printf("%6d",suma);
	}
	
	public static void rellenar(int m[][]) {
		for(int i=0;i<m.length;i++) {
			for(int j=0;j<m[i].length;j++) {
			  System.out.printf("[%d][%d] ",i,j);	
			  m[i][j]=Integer.valueOf(sc.nextLine());
			}
		}
	}
	/*
	 * public static void rellenarAleatorio(int m[][]) {
	 * 
	 * for(int i=0;i<m.length;i++) { for(int j=0;j<m[i].length;j++) {
	 * m[i][j]=alea(100,999); } } }
	 */
	
	public static void main(String[] args) {
	int matriz[][]=new int[4][5];
	rellenar(matriz);
	imprimirResultados(matriz);
	
	}

}
