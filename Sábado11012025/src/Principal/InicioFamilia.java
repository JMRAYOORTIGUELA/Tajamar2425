package Principal;

import Clases.Familia;
import Clases.Persona;

public class InicioFamilia {

	public static void main(String[] args) {
	
		Familia f1=new Familia(
				new Persona("juan","perez",45),
				new Persona("ana","ruiz",25)
				);
		f1.AñadirHijo(new Persona("ana","perez ruiz"));
		f1.AñadirHijo(new Persona("pepe","perez ruiz"));
		
		
		
		//f1.setPadre(null);
		f1.getPadre().setEdad(55);
		
		System.out.println(f1);
		

	}

}
