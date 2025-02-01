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
            int n1=10;
            int n2=n1;
		
		Persona ana=new Persona("ana",40);
		Persona ana2=new Persona("ana",40);
        Persona ana3=ana2;
		
        ana2.setNombre("ana luisa");
        
				
        System.out.println(ana2);
        System.out.println(ana3);

		
			}	
	

}
