package Clases;

import java.time.LocalDate;

public class CCuentaCorrienteConIn extends CCuentaCorriente {

	public CCuentaCorrienteConIn(String nombre, String cuenta, double saldo, double tipoDeInterés,
			double importePorTrans, int transExentas) {
		super(nombre, cuenta, saldo, tipoDeInterés, importePorTrans, transExentas);
	}

	@Override
	public double intereses() {
       LocalDate hoy=LocalDate.now();
       
       if (hoy.getDayOfMonth()!=1 ||this.saldo<3000)return 0.0;
       

	   double interesesProducidos =saldo*this.tipoDeInterés/1200;
       ingreso(interesesProducidos);
       
       this.transacciones--;
       
	   return interesesProducidos;	
	}

}
