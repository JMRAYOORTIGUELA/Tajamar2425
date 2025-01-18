package Principal;

import Clases.Persona;

public class Inicio {

	public static void main(String[] args) {
		
		Persona p0=new Persona();
		System.out.println(p0);
		
		
		Persona p1=new Persona("Jose","Perez",25);
		
		Persona p2=new Persona("Ana","Ruiz",35);
		
		Persona p3=new Persona("Maria","Perez");

		System.out.println(p2.getApellido());
		System.out.println(p2.getNombre());
		System.out.println(p2.getEdad());
		
		
		p2.setNombre("Ana Maria");
		p2.setApellido("Perez");
		p2.setEdad(44);
		
		System.out.println("\nUna vez modificado\n");
		System.out.println(p2.getApellido());
		System.out.println(p2.getNombre());
		System.out.println(p2.getEdad());
		
		
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
		
		
		

	}

}
