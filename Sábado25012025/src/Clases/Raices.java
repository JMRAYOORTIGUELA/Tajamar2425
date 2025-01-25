package Clases;

public class Raices {
	private double a;
	private double b;
	private double c;
	
	public Raices() {}
	public Raices(double pa,double pb,double pc) {
		this.a=pa;
		this.b=pb;
		this.c=pc;
	}
	
	public double getA() {
		return a;
	}
	public void setA(double a) {
		this.a = a;
	}
	public double getB() {
		return b;
	}
	public void setB(double b) {
		this.b = b;
	}
	public double getC() {
		return c;
	}
	public void setC(double c) {
		this.c = c;
	}
	@Override
	public String toString() {
		return "Raices [a=" + a + ", b=" + b + ", c=" + c + "]";
	}
    private void obtenerRaices() {
    	double r1= (-b+Math.sqrt(getDiscriminante()))/(2*a);
    	double r2= (-b-Math.sqrt(getDiscriminante()))/(2*a);
    	System.out.printf("Raiz 1º=%.2f\n",r1);
    	System.out.printf("Raiz 2º=%.2f\n",r2);

    }
    private void obtenerRaiz() {
    	double r1=(-b)/(2*a);
    	System.out.printf("Raiz Unica=%.2f\n",r1);
    }
    private double getDiscriminante() {
    	return Math.pow(b, 2)-(4*a*c);
    }
    private boolean tieneRaices() {
    	return getDiscriminante()>0;
    }
    private boolean tieneRaiz() {
    	return getDiscriminante()==0;
    }
    public void calcular() {
    	if (tieneRaices()) {
    		obtenerRaices();
    	}else if(tieneRaiz()) {
    		obtenerRaiz();
    	}else {
    		System.out.println("No tiene soluciones");
    	}
    	
    }
}
