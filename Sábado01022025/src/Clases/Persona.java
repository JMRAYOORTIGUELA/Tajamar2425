package Clases;

import java.util.Objects;

public class Persona implements Cloneable{
	
	
	
  @Override
	public Object clone()  {
		// TODO Auto-generated method stub
	  try {
		return super.clone();
	  }catch(CloneNotSupportedException e) {
		  System.out.println(e.getMessage());
	  }
	  return null;
	}
  
private String nombre;
  private int edad;
public Persona(String nombre, int edad) {
	super();
	this.nombre = nombre;
	this.edad = edad;
}
public String getNombre() {
	return nombre;
}



public void setNombre(String nombre) {
	this.nombre = nombre;
}
public int getEdad() {
	return edad;
}
public void setEdad(int edad) {
	this.edad = edad;
}
public String mensaje() {
	return "Persona";
}
@Override
public String toString() {
	return "Persona [nombre=" + nombre + ", edad=" + edad + "]";
}
  
}