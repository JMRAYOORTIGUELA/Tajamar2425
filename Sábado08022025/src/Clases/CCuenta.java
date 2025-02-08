package Clases;

public abstract class CCuenta {
   protected String nombre;
   protected String cuenta;
   protected double saldo;
   protected double tipoDeInterés;
   

public CCuenta(String nombre, String cuenta, double saldo, double tipoDeInterés) {
	super();
	this.nombre = nombre;
	this.cuenta = cuenta;
	this.saldo = saldo;
	this.tipoDeInterés = tipoDeInterés;
}
public CCuenta(String nombre, String cuenta,  double tipoDeInterés) {
	super();
	this.nombre = nombre;
	this.cuenta = cuenta;
	this.saldo = 0;
	this.tipoDeInterés = tipoDeInterés;
}
public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public String getCuenta() {
	return cuenta;
}
public void setCuenta(String cuenta) {
	this.cuenta = cuenta;
}
public double getSaldo() {
	return saldo;
}
public void setSaldo(double saldo) {
	this.saldo = saldo;
}
public double getTipoDeInterés() {
	return tipoDeInterés;
}
public void setTipoDeInterés(double tipoDeInterés) {
	this.tipoDeInterés = tipoDeInterés;
}
public void ingreso(double euros) {
	this.saldo +=euros;
}
public void reintegro(double euros) {
	if (euros<=this.saldo) {
		this.saldo -=euros;
	}else {
		System.out.println("Imposible.No tienes saldo");
	}
}	
	public abstract void comisiones();
	public abstract double intereses();
	@Override
	public String toString() {
		return "CCuenta [nombre=" + nombre + ", cuenta=" + cuenta + ", saldo=" + saldo + ", tipoDeInterés="
				+ tipoDeInterés + "]";
	}

	
	
	
}
