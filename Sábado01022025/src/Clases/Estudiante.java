package Clases;

public class Estudiante extends Persona{
  private int greditos;

public Estudiante(String nombre, int edad, int greditos) {
	super(nombre, edad);
	this.greditos = greditos;
}

public int getGreditos() {
	return greditos;
}

public void setGreditos(int greditos) {
	this.greditos = greditos;
}
public String mensaje() {
	return "Estudiante";
}
@Override
public String toString() {
	return "Estudiante [greditos=" + greditos + "]"+super.toString();
}
  
  
  
  
}
