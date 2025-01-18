package Principal;

import Clases.Persona;

public class Inicio {

	public static void main(String[] args) {

		Persona p1=new Persona("jose",30,"H");
		Persona p2=new Persona("ANA",22,"50691319D","M",56,180);
		 
		
		p1.setPeso(85.5);
		p1.setAltura(189);
		System.out.println(p1);
		
		System.out.println(p1.calcularIMC());
	
		System.out.println(p1.esMayorDeEdad());
		
		
		System.out.println(p2);
		System.out.println(p2.calcularIMC());
		
		System.out.println(p2.esMayorDeEdad());

	}

}
