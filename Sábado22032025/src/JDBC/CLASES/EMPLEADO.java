package JDBC.CLASES;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class EMPLEADO {

	private Long id;
	private String nombre;
	private BigDecimal salario;
	private LocalDateTime fecha;
	public EMPLEADO(Long id, String nombre, BigDecimal salario, LocalDateTime fecha) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.salario = salario;
		this.fecha = fecha;
	}
	@Override
	public String toString() {
		return "EMPLEADO [id=" + id + ", nombre=" + nombre + ", salario=" + salario + ", fecha=" + fecha + "]";
	}
	
	
	
}
