package Principal;

public class Incidencia {
	private int codigo;
	private String estado;
	private int puesto;
	private String problema;
	private String resolucion;
	
	private static int contadorCodigos=1;
	private static int pendiente=0;
	
	public Incidencia(int puesto,String problema) {
		this.puesto=puesto;
		this.problema=problema;
		this.estado="pendiente";
		this.codigo=contadorCodigos++;
		pendiente++;
	}
	public void resuelve(String resolucion) {
		this.resolucion=resolucion;
		this.estado="resuelto";
		pendiente--;
	}
	@Override
	public String toString() {
		String cadena=estado.equals("resuelto") ? "-" +resolucion :"" ;
		return "Incidencia [codigo=" + codigo + ", estado=" + estado + ", puesto=" + puesto + ", problema=" + problema
				+ ", resolucion=" + cadena +"]";
	}

	public static int getPendientes() {
		return pendiente;
	}
}
