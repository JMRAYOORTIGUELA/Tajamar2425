package Cartas;

public class Carta {
    private Numeracion numeracion;
    private Palos palo;
    
	public Carta(Numeracion numeracion, Palos palo) {
		super();
		this.numeracion = numeracion;
		this.palo = palo;
	}

	@Override
	public String toString() {
		return "Carta ( "+ numeracion + "," + palo + ")";
	}
    
    
    
    
}
