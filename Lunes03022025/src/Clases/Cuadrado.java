package Clases;

public class Cuadrado extends FigurasGeometricas {

	
	public Cuadrado(double lado1) {
		super(lado1);
	}

	@Override
	public double perimetro() {
		
		return 4*this.lado1;
	}

	@Override
	public double area() {
		
		return Math.pow(this.lado1, 2);
	}

	@Override
	public String toString() {
		return "Cuadrado lado="+this.lado1;
	}
	

}
