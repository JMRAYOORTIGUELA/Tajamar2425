package Clases;

import java.time.LocalDate;

public class CCuentaAhorro extends CCuenta {
  
	private double cuotaMantenimiento;


	public CCuentaAhorro(String nombre, String cuenta, double saldo, double tipoDeInterés, double cuotaMantenimiento) {
		
		super(nombre, cuenta, saldo, tipoDeInterés);
		
		this.cuotaMantenimiento = cuotaMantenimiento;
	}

	public double getCuotaMantenimiento() {
		return cuotaMantenimiento;
	}

	public void setCuotaMantenimiento(double cuotaMantenimiento) {
		this.cuotaMantenimiento = cuotaMantenimiento;
	}


	@Override
	public String toString() {
		
		return "CCuenta [nombre=" + nombre + ", cuenta=" + cuenta + ", saldo=" + saldo + ", tipoDeInterés="
		+ tipoDeInterés + " cuotaMantenimiento=" + cuotaMantenimiento+ "]";
	}

	@Override
	public void comisiones() {
		LocalDate hoy=LocalDate.now();
		if (hoy.getDayOfMonth()==1)reintegro(this.cuotaMantenimiento);

	}

	@Override
	public double intereses() {
		LocalDate hoy=LocalDate.now();
		if (hoy.getDayOfMonth()!=1)return 0.0;
		
		return this.saldo*this.tipoDeInterés/1200;
      
	}

}
