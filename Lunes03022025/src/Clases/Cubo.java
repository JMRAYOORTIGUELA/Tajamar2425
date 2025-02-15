package Clases;

public class Cubo extends Cuadrado {

	public Cubo(double lado1) {
		super(lado1);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double perimetro() {
		return 12*this.lado1;
	}

	@Override
	public double area() {
		return 6*Math.pow(this.lado1, 2);
	}
	
	public double volumen() {
		return Math.pow(this.lado1, 3);
	}

	@Override
	public String toString() {
		return "Cubo lado="+this.lado1;
	}

	
}
