package Principal;

import java.util.ArrayList;

import Clases.Estudiante;
import Clases.Persona;

public class inicioPersona {

	public static void imprimir(ArrayList<Persona> li) {
		for (Persona p : li) {
			System.out.println(p.mensaje()+" "+p);
		}
	}
	
	public static void main(String[] args) {

		
     Persona p1=new Persona("ana",42);
     Persona p2=new Persona(p1.getNombre(),p1.getEdad());
     Persona p3=(Persona)p1.clone();
     
 

     System.out.println(p1+" "+p1.hashCode());
     System.out.println(p2+" "+p2.hashCode());
     System.out.println(p3+" "+p3.hashCode());
     
     if (p1.equals(p2)) {
    	 System.out.println("Somos iguales");
     }else {
    	 System.out.println("Somos distintos");
     }

	}

}
