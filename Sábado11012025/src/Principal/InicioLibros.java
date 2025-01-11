package Principal;

import Clases.Libro;

public class InicioLibros {

	public static void main(String[] args) {
		
		Libro l1=new Libro("111", "Programacion Java","Perez Dominguez", 2024);
		Libro l2=new Libro("222", "Programacion C#","Lopez Martin");
		
		l1.setAñoPublicacion(2025);
		
		System.out.println(l1);
		System.out.println(l2);
		
		
		
		

	}

}
