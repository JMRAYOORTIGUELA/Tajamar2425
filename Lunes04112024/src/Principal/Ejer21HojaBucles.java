package Principal;

import java.util.Scanner;

public class Ejer21HojaBucles {
	static Scanner sc = new Scanner(System.in);
	

	public static void main(String[] args) {
	    int numero,c=0,sumaimpares=0,contarimpares=0,mayor=-1;
		
		while (true) {
			System.out.print("Dime el siguiente numero ");
			numero=Integer.valueOf(sc.nextLine());
			if (numero<0)break;
			c++;
			if (numero%2!=0) {
				sumaimpares +=numero;
				contarimpares++;
			}else {
				if (numero>mayor)mayor=numero;
			}
		}
        System.out.printf("Cuantos numeros=%d Media Impares=%.2f Mayor pares=%d",c,(double)sumaimpares/contarimpares,mayor);		
		
		
		
	}

}
    