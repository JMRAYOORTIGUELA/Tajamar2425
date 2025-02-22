package Principal;

import Clases.Coche;

public class InicioCoche {

	public static void main(String[] args) {
		
		System.out.println(Coche.getKilometrosTotales());
		
		Coche c1=new Coche("mercedes","k200");
		c1.recorrer(200);
		
		Coche c2=new Coche("opel","kadet");
		c2.recorrer(45);
		
		System.out.println(Coche.getKilometrosTotales());
		
		System.out.println(c1.getKilometrosTotales());
		
		System.out.println(c2.getKilometrosTotales());
		
		
		
		System.out.println(c1.getKilometraje());
		System.out.println(c2.getKilometraje());
		
		System.out.println(Coche.getNCoches());
		System.out.println(c1.getNCoches());
		System.out.println(c2.getNCoches());
		
		
		c1.set
		

	}

}
