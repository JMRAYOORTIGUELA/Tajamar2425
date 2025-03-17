package Facturas;

public class Factura implements Constantes, Variaciones {


	private double totalSinIva;
	
	public double sinIva() {
		return totalSinIva;
	}
	public double conIva() {
		return totalSinIva*(1+IVA);
	}
	
	@Override
	public void asignarValor(double x) {
      if (valorMinimo<x ) {
    	  this.totalSinIva=x;
      }else {
    	  this.totalSinIva=0;
      }
	}

	@Override
	public void rebaja(double t) {
		this.totalSinIva *=(1-t/100);

	}

}
