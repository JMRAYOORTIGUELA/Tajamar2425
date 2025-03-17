package Herencia_Interfaces;

public class Estudiante implements EstudianteInterface{
    private String nombre;
    private String apellidos;
    private String escuela;
    private int coeficienteIntelectual;
    
    
    
    
	public Estudiante(String nombre, String apellidos, String escuela) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.escuela = escuela;
	}

	@Override
	public int compuTotalInteligencia() {
		// TODO Auto-generated method stub
		return this.NIVEL;
	}

	@Override
	public String getNombre() {
		
		return this.nombre+','+this.apellidos;
	}

	@Override
	public String encontrarEscuela() {
		// TODO Auto-generated method stub
		return this.escuela;
	}

}
