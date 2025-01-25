package Principal;

import Clases.Cuadrado;

public class InicioCuadrado {

	public static void main(String[] args) {
		Cuadrado c1=new Cuadrado();
		
		c1.ModificarLado(  Math.pow(c1.ObtenerLado(),2)      );
		
		System.out.println(c1);

	}

}
