package Principal;

import Clases.Biblioteca;
import Clases.Libro;

public class InicioBiblioteca {

	public static void main(String[] args) {
		
		Biblioteca retiro=new Biblioteca("RETIRO","Doctor Ezquerdo 33");
		
		retiro.AñadirLibro(new Libro("111","Prog Java","alberto"));
		retiro.AñadirLibro(new Libro("222","Prog C++","Perez",2025));
		retiro.AñadirLibro(new Libro("333","Prog mysql",null));
		
		System.out.println(retiro);
		
		
		
		
	}

}
