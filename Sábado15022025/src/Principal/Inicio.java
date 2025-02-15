package Principal;

import Clases.Sexo;

public class Inicio {
	
	public static void main(String[] args) {

		Sexo a=Sexo.HOMBRE;
		
		
		for (Sexo s : Sexo.values()) {
			System.out.println(s.toString()+" "+s.ordinal()+" "+s.name());
		}
		
		
		String cadena="MUJER";
		
		Sexo b=Sexo.valueOf(cadena);
		System.out.println();
		System.out.println(b.toString()+" "+b.ordinal()+" "+b.name());
		
		
	}
}
