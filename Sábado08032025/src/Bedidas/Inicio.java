package Bedidas;

public class Inicio {

	public static void main(String[] args) {
		
		Almacen Ruiz=new Almacen(3,4);
		
		Bebida a=new Bebida(10,23,"Cocacola");
		
		Ruiz.agregarBebida(a);
		
		Ruiz.agregarBebida(new AguaMineral(5,10,"Fanta","Guadarrama"));
		
		Ruiz.agregarBebida(new BebidaAzucarada(5,10,"Trina",5,true));
		
		
		//Ruiz.eliminarBebida(new Bebida(10,23,"Cocacola"));
		
		Ruiz.mostrarBebidas();
		System.out.println("Precio total de las Bebidas ="+Ruiz.PrecioTotalBebidas());
		
		System.out.println("Precio total de las Bebidas de marca Fanta "+Ruiz.PrecioTotalBebidas("fanta"));

		System.out.println("Precio total de las Bebidas de columna 1 "+Ruiz.PrecioTotalBebidas(1));
	}

}
