package Clases;

import java.util.ArrayList;

public class Familia {
     private Persona Padre;
     private Persona Madre;
     private ArrayList<Persona> Hijos=new ArrayList<Persona>();
     
     public Familia(Persona p,Persona m) {
    	 Padre=p;
    	 Madre=m;
     }
     
     public Familia(Persona p,Persona m,ArrayList<Persona> r) {
    	 Padre=p;
    	 Madre=m;
    	 Hijos=r;
     }

	public Persona getPadre() {
		return Padre;
	}

	public void setPadre(Persona padre) {
		Padre = padre;
	}

	public Persona getMadre() {
		return Madre;
	}

	public void setMadre(Persona madre) {
		Madre = madre;
	}
     
	public ArrayList<Persona> ObtenerHijos(){
		return Hijos; 
	}
	public void AñadirHijo(Persona p) {
		Hijos.add(p);
	}
     
	@Override
	public String toString() {
		String cadena="Padre="+Padre+" Madre="+Madre;
		
		cadena +="\n";
		
		for (Persona b : Hijos) {
			cadena +=b+"\n";
		}
		return cadena;
	}
	
     
     
}
