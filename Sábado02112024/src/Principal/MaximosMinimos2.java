package Principal;

import java.util.Scanner;

public class MaximosMinimos2 {
	
//Pedir por pantalla 5 numeros.Indicar cual es el máximo y el mínimo de todos ellos.
	
	static Scanner sc=new Scanner(System.in);
	
	public static void main(String[] args) {
	int numero;

    System.out.print("Introducir el numero 1 ");	
    numero=Integer.valueOf(sc.nextLine());
    
    int maximo=numero,minimo=numero;
    
		for(int i=2;i<=5;i++) {
	        System.out.print("Introducir el numero "+i+" ");	
	        numero=Integer.valueOf(sc.nextLine());
	        
	        /*if (numero>maximo) {
	        	maximo=numero;
	        }else if(numero<minimo) {
	        	minimo=numero;
	        }*/
	        if (numero>maximo)maximo=numero;
	        if (numero<minimo)minimo=numero;
	        
		}
		
		System.out.printf("Maximo=%d Minimo=%d",maximo,minimo);

	}

}
