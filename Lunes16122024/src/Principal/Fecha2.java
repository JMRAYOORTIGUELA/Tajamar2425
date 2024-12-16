package Principal;

import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;

public class Fecha2 {

	public static void main(String[] args) {
		
		int anno=LocalDate.now().getYear();
		
		LocalDate fecha=LocalDate.of(anno, 5, 26);
		System.out.println(fecha.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.of("ES")));
		
		
		LocalDate fechaPedido=LocalDate.now();
		LocalDate fechaVencimiento=fechaPedido.plusMonths(3).plusWeeks(1);
		
		System.out.println("Fecha Pedido "+fechaPedido);
		System.out.println("Fecha Vencimiento "+fechaVencimiento);
		
		
		

	}

}
