package Principal;

import java.util.Scanner;

public class Ejer18Hoja3 {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
     		System.out.print("Indique el primer número ");
			int n1 = Integer.valueOf(sc.nextLine());
			
			System.out.print("Indique el segundo número ");
			int n2 = Integer.valueOf(sc.nextLine());
			int menor,mayor;
			
			if (n1==n2) {
				System.out.println("Los numero tienen que ser distintos.");
			}else {
				if (n1>n2) {
					mayor=n1;
					menor=n2;
				}else {
					mayor=n2;
					menor=n1;
				}
				
				for(int i=menor;i<=mayor; i+=7)
					System.out.println(i);
				
			}
	}	
}
