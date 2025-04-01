package JDBC.CLASES;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Empleado {

private Long id;
private String nombre;
private BigDecimal salario;
private LocalDateTime fecha;

public Empleado(Long id, String nombre, BigDecimal salario, LocalDateTime fecha) {
	super();
	this.id = id;
	this.nombre = nombre;
	this.salario = salario;
	this.fecha = fecha;
}
@Override
public String toString() {
	return "id=" + id + ", nombre=" + nombre + ", salario=" + salario + ", fecha=" + fecha.format(DateTimeFormatter.ofPattern("MM/dd/yyyy")) ;
}

}
