package Clases;

public class Persona {
	private String Nombre;
	private String Apellido;
	private int Edad;
	
	public Persona() {}
	
	public Persona(String n, String a, int e) {
		super();
		Nombre = n;
		Apellido = a;
		Edad = e;
	}

	public Persona(String nombre, String apellido) {
		super();
		Nombre = nombre;
		Apellido = apellido;
		Edad=0;
	}

	public String getApellido() {
		return Apellido;
	}

	public String getNombre() {
		return Nombre;
	}

	public int getEdad() {
		return Edad;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public void setApellido(String apellido) {
		Apellido = apellido;
	}

	public void setEdad(int edad) {
		Edad = edad;
	}

	@Override
	public String toString() {
		return "Persona("+Nombre+","+Apellido+","+Edad+")";
	}
		
	
	

}
