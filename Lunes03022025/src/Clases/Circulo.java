package Clases;

public class Circulo extends FigurasGeometricas {
	
	public Circulo(double lado1) {
		super(lado1);
	}

	@Override
	public double perimetro() {

		return 2*Math.PI*this.lado1;
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return Math.PI*Math.pow(this.lado1, 2);
	}

	@Override
	public String toString() {
		return "Circulo radio="+this.lado1;
	}

	
	
	
}
