package Clases;

public class Hija extends Padre {
	private String nombre_hija;
	private int Edad;
	
	
	
public Hija(String padre,String nombrehija,int edad) {
	super(padre);
	this.nombre_hija=nombrehija;
	this.Edad=edad;
}

@Override
public void mostrarInfo() {
    System.out.println(Edad+" "+nombre_hija+this.nombre);
	//super.mostrarInfo();
}

     
   
}
