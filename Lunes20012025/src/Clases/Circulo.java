package Clases;

public class Circulo {
    private double radio;
    
    public Circulo() {
    	this.radio=10;
    }
    
    public Circulo(double r) {
    	this.radio=r;
    }

	public double getRadio() {
		return radio;
	}

	public void setRadio(double radio) {
		this.radio = radio;
	}
	public double perimetro() {
		return 2*Math.PI*this.radio;
	}
	public double area() {
		return Math.PI*Math.pow(this.radio,2);
	}

	@Override
	public String toString() {
		return "Circulo [radio=" + radio + "]";
	}
    
}
