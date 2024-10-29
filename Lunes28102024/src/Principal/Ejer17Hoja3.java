package Principal;

import java.util.Scanner;

public class Ejer17Hoja3 {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
     		System.out.print("Indique la base ");
			int n = Integer.valueOf(sc.nextLine());
		
			if (n<0) {
				System.out.println("El nº tiene que ser positivo");
			}else {
				for(int i=1;i<=100;i++)System.out.printf("%d %d\n",i,n+i);
			}
			
			
	}	
}
