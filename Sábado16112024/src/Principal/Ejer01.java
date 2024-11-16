package Principal;

import java.util.Iterator;

public class Ejer01 {
	
	public static int alea(int li, int ls) {

		return (int) (Math.random() * (ls - li + 1)) + li;
	}

	public static void rellenar(int m[]) {
		//los vectores o matrices siempre se pasan por referncia
		//De tal manera que cualquier modificación de los valores se estan haciendo en la matriz
		//que le invoca.
		
		for (int i = 0; i < m.length; i++) {
		   m[i]=alea(0,10);	
		}
	}
	public static void prueba(int n) {
		//n se pasa por valor
		n=500;
	}
	public static void media(int m[]) {
		int suma=0;
		for (int i = 0; i < m.length; i++) suma +=m[i];
		
		System.out.printf("Media=%.2f",(double)suma/m.length);
	}
	public static void notas1(int m[]) {
		int sp=0,ap=0,bi=0,no=0,so=0;
		
		for (int i = 0; i < m.length; i++) {
			if (m[i]<5) {
				sp++;
			}else if(m[i]<6) {
				ap++;
			}else if(m[i]<7) {
				bi++;
			}else if(m[i]<9) {
				no++;
			}else if(m[i]<=10) {
				so++;
			}
		}
     System.out.println("\nSuspensos "+sp);		
     System.out.println("Aprobados "+ap);		
     System.out.println("Bienes "+bi);		
     System.out.println("Notables "+no);		
     System.out.println("Sobresalientes "+so);		
	}
	public static void notas2(int m[]) {
		int notas[]=new int[5];
		String v[]= {"Suspensos","Aprobados","Bienes","Notables","Sobresalientes"};
		
		for (int i = 0; i < m.length; i++) {
			if (m[i]<5) {
				notas[0]++;
			}else if(m[i]<6) {
				notas[1]++;
			}else if(m[i]<7) {
				notas[2]++;
			}else if(m[i]<9) {
				notas[3]++;
			}else if(m[i]<=10) {
				notas[4]++;
			}
		}
     		for (int i = 0; i < v.length; i++) System.out.println( v[i]+" "+notas[i]     );
	
	}
	
	public static void main(String[] args) {
		int tb[]=new int[10];
		rellenar(tb);
		
		for (int i = 0; i < tb.length; i++)	System.out.println(i+" "+tb[i]);
		
		int numero=10;
		prueba(numero);
		System.out.println(numero);
		//Crear un método al cual le pasamos como parámetro un vector de enteros
		// Que nos muestre la media aritmética de las notas.
		media(tb);
		//Crear un método al cual le pasamos como parámetro un vector de enteros
		//Imprimir el nºSuspensos,nºAprobados,nºBienes,nºNotables,nºSobresalientes
		notas1(tb);
		notas2(tb);

	}

}
