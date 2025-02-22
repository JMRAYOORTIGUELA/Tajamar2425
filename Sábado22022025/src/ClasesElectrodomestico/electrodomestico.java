package ClasesElectrodomestico;

public class electrodomestico {
    //constantes
	protected final static double PRECIO_BASE_DEFAULT=100;
	protected final static String COLOR_DEFAULT="BLANCO";
	protected final static char CONSUMO_ENERGETICO_DEFAULT='F';
	protected final static double PESO_DEFAULT=5;
	protected final static String colores[]= {"BLANCO","NEGRO","AZUL","GRIS"};
	
	//Atributos de las instancias
	protected double precio_base;
    protected String color;
    protected char consumo_energetico;
    protected double peso;
    
	public electrodomestico(double precio_base, String color, char consumo_energetico, double peso) {
		super();
		this.precio_base = precio_base;
		this.color = comprobarColor(color);
		this.consumo_energetico = comprobarConsumoEnergetico(consumo_energetico);
		this.peso = peso;
	}

	public electrodomestico(double precio_base, double peso) {
		/*
		 * super(); this.precio_base = precio_base; this.peso = peso;
		 * 
		 * this.color = COLOR_DEFAULT; this.consumo_energetico =
		 * CONSUMO_ENERGETICO_DEFAULT;
		 */
		
		this(precio_base,COLOR_DEFAULT,CONSUMO_ENERGETICO_DEFAULT,peso);
		
	}
	public electrodomestico() {
		this(PRECIO_BASE_DEFAULT,COLOR_DEFAULT,CONSUMO_ENERGETICO_DEFAULT,PESO_DEFAULT);
	}
	
	private String comprobarColor(String color) {
		for(int i=0;i<colores.length;i++) {
			if (color.compareToIgnoreCase(colores[i])==0) {
				return colores[i];
			}
		}
		return COLOR_DEFAULT;
		
	}
	private char comprobarConsumoEnergetico(char letra) {
		if (letra>=65 && letra<=70 ||letra>=97 && letra<=102) return Character.toUpperCase(letra);
		return CONSUMO_ENERGETICO_DEFAULT;
		
	}
	
	public double precioFinal() {
		int tb[]= {100,80,60,50,30,10};
		double total=this.precio_base;

		total +=tb[this.consumo_energetico-'A'];
		
		if (this.peso>=0 && this.peso<=19) {
			total +=10;
		}else if (this.peso>=20 && this.peso<=49) {
			total +=50;
		}else if (this.peso>=50 && this.peso<=79) {
			total +=80;
		}else if (this.peso>=80 && this.peso<=100) {
			total +=100;
		}
		return total;
	}

	@Override
	public String toString() {
		return "electrodomestico [precio_base=" + precio_base + ", color=" + color + ", consumo_energetico="
				+ consumo_energetico + ", peso=" + peso + "]";
	}
	
    
     
}
