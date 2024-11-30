package Principal;

import java.util.Scanner;

public class Ejercicio03 {

	
	static Scanner sc=new Scanner(System.in);
	
	public static int alea(int li,int ls) {
		
		return (int)(Math.random()*(ls-li+1))+li;
	}
public static void rellenar(int m[]) {
		
		for (int i = 0; i < m.length; i++) {
		      m[i]=alea(0,20);	
		}
	}
	public static void imprimir(int m[]) {
		System.out.println();
		for (int i = 0; i < m.length; i++) {
		      System.out.printf("%3d", m[i]);	
		}
		System.out.println();
		for (int i = 0; i < m.length; i++) {
		      System.out.printf("%3d", i);	
		}
		System.out.println();

	}
	public static void sustituir(int m[]) {
		
		for (int i = 0; i < m.length; i++) {
				//while(m[i]%5!=0)m[i]++;
				
				
				if(m[i]%5!=0) m[i]=( (m[i]/5)+1)*5;
				
				
		}
	}
	
	public static void main(String[] args) {
		/*
		 * Escribe un programa que rellene un array de 15 elementos con números enteros
		 * comprendidos entre 100 y 500 (ambos incluidos). A continuación, se mostrará el
		 * array “cincuerizado”, según el siguiente criterio: si el número que hay en
		 * una posición del array es múltiplo de 5, se deja igual, y si no, se cambia
		 * por el siguiente múltiplo de 5 que exista a partir de él.
			 */
		int tb[]=new int[15];
		rellenar(tb);
		
		imprimir(tb);
		sustituir(tb);
		imprimir(tb);
		
		
		
        
	}

}
