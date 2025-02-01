package ClasesCine;

public class Espectador {
    private String nombre;
    private int edad;
    private double dinero;
	public Espectador(String nombre, int edad, double dinero) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.dinero = dinero;
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
	public double getDinero() {
		return dinero;
	}
	public void setDinero(double dinero) {
		this.dinero = dinero;
	}
	@Override
	public String toString() {
		return "Espectador [nombre=" + nombre + ", edad=" + edad + ", dinero=" + dinero + "]";
	}
    public boolean tieneDinero(double pre) {
    	return dinero>=pre;
    }
    public boolean tieneEdad(int ed) {
    	return edad>=ed;
    }
    public void paga(double di) {
    	this.dinero-=di;
    }
    
}

