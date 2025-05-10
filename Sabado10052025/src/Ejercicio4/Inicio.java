package Ejercicio4;

public class Inicio {

	public static int alea(int li,int ls) {
		return (int)(Math.random()*(ls-li+1))+li;
	}
	public static void rellenar(int m[][]) {
		for(int i=0;i<m.length;i++) {
			for(int j=0;j<m[i].length;j++) {
				m[i][j]=alea(140,210);
			}
		}
		
		
	}
	public static void imprimir(String p[],int m[][]) {
		int suma,maximo,minimo;
		
		
		System.out.printf("%65s\n", "MED  MAX  MIN");
		for (int i = 0; i < m.length; i++) {
			System.out.printf("%-9s", p[i]);
			suma = 0;
			maximo = 130;
			minimo = 220;
			for (int j = 0; j < m[i].length; j++) {
				System.out.printf("%4d", m[i][j]);
				suma += m[i][j];
				maximo = m[i][j] > maximo ? m[i][j] : maximo;
				minimo = m[i][j] < minimo ? m[i][j] : minimo;
			}
			System.out.printf(" |%4d %4d %4d\n", suma / m[i].length, maximo, minimo);
		}
	}
	public static void main(String[] args) {
		String pais[] = {"España", "Rusia", "Japón", "Australia"};
		int alturas[][]=new int[4][10];
		
		rellenar(alturas);
		imprimir(pais,alturas);
		

	}

}
