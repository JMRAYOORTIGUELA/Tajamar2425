package Principal;

import java.util.Scanner;

public class MaximosMinimos {
	
//Pedir por pantalla 5 numeros.Indicar cual es el máximo y el mínimo de todos ellos.
// Los mumeros introducidos [10,50]	
	
	static Scanner sc=new Scanner(System.in);
	
	public static void main(String[] args) {
	int numero;
	int maximo=0,minimo=51;
	
		for(int i=1;i<=5;i++) {
	        System.out.print("Introducir el numero "+i+" ");	
	        numero=Integer.valueOf(sc.nextLine());
	        if (numero>maximo)maximo=numero;
	        if (numero<minimo)minimo=numero;
		}
		
		System.out.printf("Maximo=%d Minimo=%d",maximo,minimo);

	}

}
