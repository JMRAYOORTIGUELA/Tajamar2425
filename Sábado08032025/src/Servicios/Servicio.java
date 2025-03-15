package Servicios;

import java.time.LocalDate;

public abstract class Servicio {
       protected String trabajador;
       protected LocalDate fechainicio;
       protected String cliente;
	public Servicio(String trabajador, LocalDate fechainicio, String cliente) {
		super();
		this.trabajador = trabajador;
		this.fechainicio = fechainicio;
		this.cliente = cliente;
	}
	public String getTrabajador() {
		return trabajador;
	}
	public void setTrabajador(String trabajador) {
		this.trabajador = trabajador;
	}
	public LocalDate getFechainicio() {
		return fechainicio;
	}
	public void setFechainicio(LocalDate fechainicio) {
		this.fechainicio = fechainicio;
	}
	public String getCliente() {
		return cliente;
	}
	public void setCliente(String cliente) {
		this.cliente = cliente;
	}
	@Override
	public String toString() {
		return "Servicio [trabajador=" + trabajador + ", fechainicio=" + fechainicio + ", cliente=" + cliente + "]";
	}
    public abstract double costeMaterial();   
    public abstract double costeManoObra();
    public abstract double costeTotal();
    public abstract String detalleServicio();
    
       
}
