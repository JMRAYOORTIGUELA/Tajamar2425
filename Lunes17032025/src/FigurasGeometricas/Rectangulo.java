package FigurasGeometricas;

public class Rectangulo implements Figura, Color {

	private  float lado1;
	private  float lado2;
	


	public Rectangulo(float lado1, float lado2) {
		super();
		this.lado1 = lado1;
		this.lado2 = lado2;
	}

	@Override
	public String color() {
		
		return "azul";
	}

	@Override
	public float area() {
		
		return this.lado1*this.lado2;
	}

	@Override
	public float perimetro() {
		
		return 2*(this.lado1+this.lado2);
	}

}
