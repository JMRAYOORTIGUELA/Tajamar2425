package Clases;

import java.util.Objects;

public class Persona {
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
@Override
public int hashCode() {
	return Objects.hash(edad, nombre);
}


@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Persona other = (Persona) obj;
	return edad == other.edad && Objects.equals(nombre, other.nombre);
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