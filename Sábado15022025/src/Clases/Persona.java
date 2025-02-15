package Clases;

public class Persona {
    private String nombre;
    private Sexo sexo;
    
	public Persona(String nombre, Sexo sexo) {
		super();
		this.nombre = nombre;
		this.sexo = sexo;
	}
	public Persona(String nombre) {
		super();
		this.nombre = nombre;
		this.sexo = Sexo.MUJER;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Sexo getSexo() {
		return sexo;
	}
	public void setSexo(Sexo sexo) {
		this.sexo = sexo;
	}
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", sexo=" + sexo + "]";
	}
    
    
    
    
}
