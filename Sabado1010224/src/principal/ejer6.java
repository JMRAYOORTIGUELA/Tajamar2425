package principal;

import java.util.Scanner;

public class ejer6 {

	static Scanner sc = new Scanner(System.in);
	
	
	public static void main(String[] args) {
		int salario;
		
		
		System.out.println("Dime el numero de horas ");
		int horas=sc.nextInt();
		
		if (horas<=40) {
			salario=horas*12;
		}else {
			salario=(40*12)+ ((horas-40)*19);
		}
		
		
		System.out.println("El salario a percibir="+salario);
	}

}
