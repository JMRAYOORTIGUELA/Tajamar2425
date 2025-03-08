package Cartas;

public class Main {

	public static void main(String[] args) {
		
		Baraja spain=new Baraja();
		
		System.out.println("Hay "+spain.cartasDisponibles()+ " disponibles");

		for( Carta c:spain.darCartas(5))  System.out.println(c);	
	
		System.out.println("Hay "+spain.cartasDisponibles()+ " disponibles");
	
		for( Carta c:spain.darCartas(4))  System.out.println(c);	
		
		System.out.println("Hay "+spain.cartasDisponibles()+ " disponibles");
		
		spain.cartasMonton();
		System.out.println("Hay "+spain.cartasDisponibles()+ " disponibles");
	    spain.mostrarBaraja();
	}

}
