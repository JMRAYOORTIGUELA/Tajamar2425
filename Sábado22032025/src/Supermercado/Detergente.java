package Supermercado;

public class Detergente implements EsLiquido,ConDescuento {

	 private String marca;
	 private double precio;
	 private double volumen;
	 private String tipoEnvase;
	 private double descuento;
	
	public Detergente(String marca, double precio) {
		super();
		this.marca = marca;
		this.precio = precio;
	}
	
	public String getMarca() {		return marca;	}
	public void setMarca(String marca) {this.marca = marca;}
	public double getPrecio() {	return precio;}
	public void setPrecio(double precio) {this.precio = precio;	}

	@Override
	public void setVolumen(double v) {	this.volumen=v;	}
	@Override
	public double getVolumen() {return this.volumen;	}
	@Override
	public void setTipoEnvase(String env) {	this.tipoEnvase=env;}
	@Override
	public String getTipoEnvase() {	return this.tipoEnvase;	}
	@Override
	public void setDescuento(double des) {	this.descuento=des;	}
	@Override
	public double getDescuento() {		return this.descuento;	}
	@Override
	public double getPrecioDescuento() {return this.getPrecioDescuento();	}

	@Override
	public String toString() {
		return "Detergente [marca=" + marca + ", precio=" + precio + ", volumen=" + volumen + ", tipoEnvase="
				+ tipoEnvase + ", descuento=" + descuento + "]";
	}
	
}
