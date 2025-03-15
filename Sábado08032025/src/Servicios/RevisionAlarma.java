package Servicios;

import java.time.LocalDate;

public class RevisionAlarma extends Servicio {
	private int nalarmas;
   
	
	public RevisionAlarma(String trabajador, LocalDate fechainicio, String cliente, int nalarmas) {
		super(trabajador, fechainicio, cliente);
		this.nalarmas = nalarmas;
	}

	public int getNalarmas() {
		return nalarmas;
	}

	public void setNalarmas(int nalarmas) {
		this.nalarmas = nalarmas;
	}

	@Override
	public double costeMaterial() {
			return 0;
	}

	@Override
	public double costeManoObra() {
		// TODO Auto-generated method stub
		return (this.nalarmas/3)*40;
	}

	@Override
	public double costeTotal() {
		// TODO Auto-generated method stub
		return this.costeManoObra();
	}

	@Override
	public String detalleServicio() {
		 String cadena="REVISIÓN PERIÓDICA ALARMAS CONTRAINCENDIOS\n";
	       cadena +="Cliente: "+this.cliente+"\n";
	       cadena +="Fecha revision: "+this.fechainicio+"\n";
	       cadena +="-----------------------------------\n";
	       cadena +="TOTAL: "+this.costeTotal()+"\n";
	       cadena +="-----------------------------------\n";
			return cadena;
	}

}
