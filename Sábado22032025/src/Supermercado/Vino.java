package Supermercado;

import java.time.LocalDate;

public class Vino implements EsLiquido,EsAlimento,ConDescuento {
 private String marca;
 private String tipoVino;
 private double grados;
 private double precio;
 private double volumen;
 private String tipoEnvase;
 private LocalDate caducidad;
 private double descuento;
 
public Vino(String marca, String tipoVino, double grados, double precio) {
	super();
	this.marca = marca;
	this.tipoVino = tipoVino;
	this.grados = grados;
	this.precio = precio;
}

public String getMarca() {
	return marca;
}

public void setMarca(String marca) {
	this.marca = marca;
}

public String getTipoVino() {
	return tipoVino;
}

public void setTipoVino(String tipoVino) {
	this.tipoVino = tipoVino;
}

public double getGrados() {
	return grados;
}

public void setGrados(double grados) {
	this.grados = grados;
}

public double getPrecio() {
	return precio;
}

public void setPrecio(double precio) {
	this.precio = precio;
}

@Override
public void setDescuento(double des) {
	this.descuento=des;
	
}

@Override
public double getDescuento() {
	return this.descuento;
}

@Override
public double getPrecioDescuento() {
	return precio*(1-(this.descuento/100));   
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
	return (int)(this.grados*10);
}

@Override
public void setVolumen(double v) {
	this.volumen=v;
}

@Override
public double getVolumen() {
	return this.volumen;
}

@Override
public void setTipoEnvase(String env) {
	this.tipoEnvase=env;
	
}

@Override
public String getTipoEnvase() {
	return this.tipoEnvase;
}

@Override
public String toString() {
	return "Vino [marca=" + marca + ", tipoVino=" + tipoVino + ", grados=" + grados + ", precio=" + precio
			+ ", volumen=" + volumen + ", tipoEnvase=" + tipoEnvase + ", caducidad=" + caducidad + ", descuento="
			+ descuento + "]";
}
 
 
 
}
