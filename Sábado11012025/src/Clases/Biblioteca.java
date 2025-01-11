package Clases;

import java.util.ArrayList;

public class Biblioteca {

	private String Nombre;
	private String Direccion;
	private ArrayList<Libro> libros=new ArrayList<Libro>();
	
	public Biblioteca(String nombre, String direccion) {
		super();
		Nombre = nombre;
		Direccion = direccion;
	}

	public Biblioteca(String nombre, String direccion, ArrayList<Libro> libros) {
		super();
		Nombre = nombre;
		Direccion = direccion;
		this.libros = libros;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public String getDireccion() {
		return Direccion;
	}

	public void setDireccion(String direccion) {
		Direccion = direccion;
	}
	
	public ArrayList<Libro> ObtenerLibros(){
		return libros;
	}
	public void AñadirLibro(Libro b) {
		libros.add(b);
	}

	@Override
	public String toString() {
		String cadena="Biblioteca [Nombre=" + Nombre + ", Direccion=" + Direccion + "]";
		
		cadena +="\n";
		
		for (Libro b : libros) {
			cadena +=b+"\n";
		}
		return cadena;
	}
	
	
	
	
	
	
}
