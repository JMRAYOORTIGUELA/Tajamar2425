package Servicios;

import java.time.LocalDate;

public class TrabajoPintura extends Servicio {

	private double superficie;
	private double preciopintura;
	
	
	public TrabajoPintura(String trabajador, LocalDate fechainicio, String cliente, double superficie,
			double preciopintura) {
		super(trabajador, fechainicio, cliente);
		this.superficie = superficie;
		this.preciopintura = preciopintura;
	}

	public double getSuperficie() {
		return superficie;
	}

	public void setSuperficie(double superficie) {
		this.superficie = superficie;
	}

	public double getPreciopintura() {
		return preciopintura;
	}

	public void setPreciopintura(double preciopintura) {
		this.preciopintura = preciopintura;
	}

	@Override
	public double costeMaterial() {
		return (this.superficie/7.8)*this.preciopintura;
	}

	@Override
	public double costeManoObra() {
		return (this.superficie/10)*9.5;
	}

	@Override
	public double costeTotal() {
		double total=this.costeMaterial()+this.costeManoObra();
		if (this.superficie<50) total=total*1.15;
		return total;
	}

	@Override
	public String detalleServicio() {
       String cadena="TRABAJO DE PINTURA\n";
       cadena +="Cliente: "+this.cliente+"\n";
       cadena +="Fecha Inicio: "+this.fechainicio+"\n";
       cadena +="-----------------------------------\n";
       cadena +="Pintor: "+this.trabajador+"\n";
       cadena +="Coste Material: "+this.costeMaterial()+"\n";
       cadena +="Coste Mano Obra: "+this.costeManoObra()+"\n";
       cadena +="Coste Adicional: "+(this.costeTotal()-this.costeManoObra()-this.costeMaterial())+"\n";
       cadena +="TOTAL: "+this.costeTotal()+"\n";
       cadena +="-----------------------------------\n";
		return cadena;
	}

}
