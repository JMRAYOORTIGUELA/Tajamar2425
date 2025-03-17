package Facturas;

public class Main {

	public static void main(String[] args) {
		Factura a=new Factura();
		a.asignarValor(250);
		
		System.out.println("El precio sin IVA es "+a.sinIva());
		System.out.println("El precio con IVA es "+a.conIva());
		System.out.println("Rebaja del 20%");
		a.rebaja(20);
		
		System.out.println("El precio sin IVA es "+a.sinIva());
		System.out.println("El precio con IVA es "+a.conIva());
	}

}
