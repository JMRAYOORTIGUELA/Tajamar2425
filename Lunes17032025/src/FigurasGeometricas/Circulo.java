package FigurasGeometricas;

public class Circulo implements Figura,Color {

	private float diametro;
	
	
	
	public Circulo(float diametro) {
		super();
		this.diametro = diametro;
	}

	@Override
	public float area() {
		
		return PI*(float)Math.pow(this.diametro/2,2);
	}

	@Override
	public float perimetro() {
		
		return 2*PI*(this.diametro/2);
	}

	@Override
	public String color() {
		// TODO Auto-generated method stub
		return COLOR_DEFAULT;
	}

	

	

}
