package Principal;

import java.util.ArrayList;

import Clases.Libro;
import Clases.Persona;

public class InicioArrayListPersona {
	
    public static void imprimir( ArrayList<Persona> li) {
    	
    	for( Persona p :li )System.out.println(p);
    	
    }

	public static void main(String[] args) {
		
	   ArrayList<Persona> lista=new ArrayList<Persona>();
	   

		lista.add(new Persona("Jose","Perez"));
		lista.add(new Persona("Ana","Lopez",34));
		lista.add(new Persona("Maria","Rayo",24));
		
		imprimir(lista);
		
	}

}
