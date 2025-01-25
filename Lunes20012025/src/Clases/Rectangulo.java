package Clases;

public class Rectangulo {
	private double lado1=5;
	private double lado2=10;
	
	public Rectangulo() {}
	
	public Rectangulo(double la1,double la2) {
		this.lado1=la1;
		this.lado2=la2;
	}
	public Rectangulo(double la1) {
		this.lado1=la1;
	}

	public double getLado1() {
		return lado1;
	}

	public void setLado1(double lado1) {
		this.lado1 = lado1;
	}

	public double getLado2() {
		return lado2;
	}

	public void setLado2(double lado2) {
		this.lado2 = lado2;
	}
	public double perimetro() {return 2*(this.lado1+this.lado2);}
	
	public double area() {  return this.lado1*this.lado2; }

	@Override
	public String toString() {
		return "Rect (" + lado1 + "," + lado2 + ")";
	}
	

}
