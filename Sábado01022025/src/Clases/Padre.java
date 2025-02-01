package Clases;

public class Padre {
	protected String nombre;

	public Padre(String ca) {
		this.nombre = ca;
		System.out.println(nombre);
	}

   public void mostrarInfo() { 
	   System.out.println("Padre: " + nombre);
   }

}
