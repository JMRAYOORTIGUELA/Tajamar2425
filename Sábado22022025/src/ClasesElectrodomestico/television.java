package ClasesElectrodomestico;

public class television extends electrodomestico {
	
   private final static int RESOLUCION_DEFAULT=20;
   private final static boolean SINTONIZADORTDT_DEFAULT=false;
	
   private int resolucion;
   private boolean sintonizadorTDT ;
   
   public television() {
		super();
		this.resolucion=RESOLUCION_DEFAULT;
		this.sintonizadorTDT=SINTONIZADORTDT_DEFAULT;
	}
	
	public television(double precio_base, double peso) {
		super(precio_base,peso);
		this.resolucion=RESOLUCION_DEFAULT;
		this.sintonizadorTDT=SINTONIZADORTDT_DEFAULT;
	
	}
	public television(double precio_base, String color, char consumo_energetico, double peso) {
		super(precio_base, color, consumo_energetico, peso);
		this.resolucion=RESOLUCION_DEFAULT;
		this.sintonizadorTDT=SINTONIZADORTDT_DEFAULT;
	}

	public int getResolucion() {
		return resolucion;
	}

	public boolean isSintonizadorTDT() {
		return sintonizadorTDT;
	}
	public double precioFinal() {
		double t=super.precioFinal();
	    if (this.resolucion>40)   t +=0.3*this.precio_base;   //t *=1.30; 
	    if (this.sintonizadorTDT) t +=50;
		return t;
	}

	@Override
	public String toString() {
		
		return "television [ precio_base=" + precio_base + ", color=" + color + ", consumo_energetico="
		+ consumo_energetico + ", peso=" + peso +" resolucion=" + resolucion + "sintonizadorTDT=" + sintonizadorTDT +"]";
	}
	
}
