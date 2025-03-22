package Supermercado;

import java.time.LocalDate;

public class Cereales implements EsAlimento{

	private String marca;
	private String tipoCereal;
	private double precio;
	private LocalDate caducidad;
	
	public Cereales(String marca,String tipoCereal,double precio) {
		this.marca=marca;
		this.tipoCereal=tipoCereal;
		this.precio=precio;
	}
		
	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getTipoCereal() {
		return tipoCereal;
	}

	public void setTipoCereal(String tipoCereal) {
		this.tipoCereal = tipoCereal;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	@Override
	public void setCaducidad(LocalDate fc) {
		this.caducidad=fc;
	}

	@Override
	public LocalDate getCaducidad() {
		return this.caducidad;
	}

	@Override
	public int getCalorias() {
		if (tipoCereal.equalsIgnoreCase("espelta")) {
			return 5;
		}else if(tipoCereal.equalsIgnoreCase("maiz")) {
			return 8;
		}else if (tipoCereal.equalsIgnoreCase("trigo")) {
			return 12;
		}else {
			return 15;
		}
	}

	@Override
	public String toString() {
		return "Cereales [marca=" + marca + ", tipoCereal=" + tipoCereal + ", precio=" + precio + ", caducidad="
				+ caducidad + "]";
	}
    
}
