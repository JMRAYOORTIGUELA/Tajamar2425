package Clases;

public class Coche {
    
	//constate static compartida por todas las instancias de coche.
	//Es un atributo de la clase
	protected static final  String COLOR_DEFECTO="BLANCO";

	//atributo de la clase
	private static int kilometrosTotales=0;
	private static int ncoches=0;
	
	//metodos de la clase
	public static int getKilometrosTotales() {
	   return 	kilometrosTotales;
	}
	public static int getNCoches() {
		return ncoches;
	}
	
   private String marca;
   private String modelo;
   private int kilometraje;
   private String color;
	
   public Coche(String marca,String modelo) {
	   this.marca=marca;
	   this.modelo=modelo;
	   this.kilometraje=0;
	   this.ncoches++;
	   this.color=COLOR_DEFECTO;
   }
   public Coche(String marca,String modelo,String color) {
	   this.marca=marca;
	   this.modelo=modelo;
	   this.kilometraje=0;
	   this.ncoches++;
	   this.color=color;
   }
   
   public String getMarca() {
	return marca;
}

public void setMarca(String marca) {
	this.marca = marca;
}

public String getModelo() {
	return modelo;
}

public void setModelo(String modelo) {
	this.modelo = modelo;
}

public int getKilometraje() {
	return kilometraje;
}

public void setKilometraje(int kilometraje) {
	this.kilometraje = kilometraje;
}




public void recorrer(int kilometros) {
	   this.kilometraje +=kilometros;
	   kilometrosTotales +=kilometros;
	   
   }

@Override
public String toString() {
	return "Coche [marca=" + marca + ", modelo=" + modelo + ", kilometraje=" + kilometraje + "]";
}
   
}
