package Principal;

import java.util.Scanner;

public class Ejer12 {
	static Scanner sc=new Scanner(System.in);
	
	public static void main(String[] args) {
       int aciertos=0;
       
       System.out.print("1.-¿Java es un lenguaje compilado? (S/N)--->");
       String respuesta=sc.nextLine();
       
       if (respuesta.equals("S")) aciertos++;
       
       System.out.print("2.-¿Python es un lenguaje compilado? (S/N)--->");
       respuesta=sc.nextLine();
       if (respuesta.equals("N")) aciertos++;
       
       System.out.println("3.-¿Que tipo de dato en Java nos sirve para almacenar valores con decimales?--->");
		System.out.println("a)int\nb)double\nc)Boolean"  );
		respuesta=sc.nextLine();
		if (respuesta.equals("b")) aciertos++;
		System.out.println("EL numero de aciertos es "+aciertos);

	}

}
