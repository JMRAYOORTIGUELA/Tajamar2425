package Principal;

import java.util.Scanner;

public class Ejer12Hoja3 {
	
	static Scanner sc=new Scanner(System.in);

	public static void main(String[] args) {
		
		System.out.print("Indique el nº ");
		int n=Integer.valueOf(sc.nextLine());
		
		switch(n) {
		case 1:
			System.out.println("0");
			break;
		case 2:
			System.out.println("0 1");
			break;
		default:
			System.out.print("0 1");
			int a=0,b=1,aux;
			while (n>2) {
				aux=a;
				a=b;
				b=aux+b;
				System.out.print(" "+b);
				n--;
			}
		}
		
		System.out.println();

	}

}
