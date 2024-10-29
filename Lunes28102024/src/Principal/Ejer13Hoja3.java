package Principal;

import java.util.Scanner;

public class Ejer13Hoja3 {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int n,cp=0,cn=0,cc=0;

		for (int i = 1; i <= 10; i++) {

			System.out.print("Indique el nº "+i+"");
			n = Integer.valueOf(sc.nextLine());
			
            if (n<0) {
            	cn++;
            }else if(n>0) {
            	cp++;
            }else {
            	cc++;
            }
		}
		System.out.printf("nº positivos=%d nº negativos=%d nº ceros=%d",cp,cn,cc);
		
	}
}
