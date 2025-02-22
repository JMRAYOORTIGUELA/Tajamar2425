package ClasesElectrodomestico;

public class lavadora extends electrodomestico {
	
	private final static double CARGA_DEFAULT=5; 
    //atributo solo lavadora. Los demás atributos los hereda de electromestico.
	private double carga;

	public lavadora() {
		super();
		this.carga=CARGA_DEFAULT;
	}
	
	public lavadora(double precio_base, double peso) {
		super(precio_base,peso);
		this.carga=CARGA_DEFAULT;
	}

	public lavadora(double precio_base, String color, char consumo_energetico, double peso, double carga) {
		super(precio_base, color, consumo_energetico, peso);
		this.carga = carga;
	}

	public double getCarga() {
		return carga;
	}
	public double precioFinal() {
		double t=super.precioFinal();
		if (this.carga>30) t +=50;
		return t;
	}

	@Override
	public String toString() {
		return "lavadora [carga=" + carga + " precio_base=" + precio_base + ", color=" + color + ", consumo_energetico="
				+ consumo_energetico + ", peso=" + peso +"]";
	}
	
   
   
}
