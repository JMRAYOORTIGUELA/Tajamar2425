package Clases;

import java.time.LocalDate;

public class CCuentaCorriente extends CCuenta {
	
    protected int transacciones;
    private double importePorTrans;
    private int transExentas;
	
	public CCuentaCorriente(String nombre, String cuenta, double saldo, double tipoDeInterés, double importePorTrans,
			int transExentas) {
		super(nombre, cuenta, saldo, tipoDeInterés);
		this.importePorTrans = importePorTrans;
		this.transExentas = transExentas;
		this.transacciones=0;
	}

	public double getImportePorTrans() {
		return importePorTrans;
	}

	public void setImportePorTrans(double importePorTrans) {
		if (this.importePorTrans>=0) {
		this.importePorTrans = importePorTrans;
		}else {
			System.out.println("No puede ser negativo ");
		}
	}

	public int getTransExentas() {
		return transExentas;
	}

	public void setTransExentas(int transExentas) {
		if (this.transExentas>=0) {
			this.transExentas = transExentas;
			}else {
				System.out.println("No puede ser negativo ");
			}
	}

	@Override
	public void ingreso(double euros) {
		super.ingreso(euros);
		this.transacciones++;
	}

	@Override
	public void reintegro(double euros) {
		super.reintegro(euros);
		this.transacciones++;
	}

	@Override
	public void comisiones() {
	   LocalDate hoy=LocalDate.now();
       if (hoy.getDayOfMonth()==1) {
    	   int n=this.transacciones-this.transExentas;
    	   if (n>0)reintegro(n*this.importePorTrans);
    	   this.transacciones=0;
       }
	}

	@Override
	public double intereses() {
		   LocalDate hoy=LocalDate.now();
		   double interesesProducidos=0;
	       if (hoy.getDayOfMonth()!=1)return 0.0;
	       //Hasta un saldo de 3000 euros 0.5% saldo. Y lo demás al tipo de interes de la cuenta
	       if( this.saldo<=3000) {
	    	   interesesProducidos=this.saldo*0.5/1200;
	       }else {
	    	   
	    	   interesesProducidos=3000*0.5/1200;
	    	   double resto=saldo-3000;
	    	   interesesProducidos +=resto*this.tipoDeInterés/1200;
	       }
	       ingreso(interesesProducidos);
	       this.transacciones--;
	       return interesesProducidos;
	}

	@Override
	public String toString() {
		return "CCuentaCorriente [transacciones=" + transacciones + ", importePorTrans=" + importePorTrans
				+ ", transExentas=" + transExentas + "]";
	}

}
