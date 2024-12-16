package Principal;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Fechas6 {
	public static String FechaHoraPer(String patron,LocalDateTime fecha,Locale lo) {
		DateTimeFormatter f=DateTimeFormatter.ofPattern(patron, lo);
		return fecha.format(f);
	}
	public static void main(String[] args) {
		LocalDateTime hoy=LocalDateTime.now();
		hoy=hoy.withDayOfMonth(20);
		System.out.println(hoy);
		

		LocalDateTime fecha=LocalDateTime.of(2024, 1,10,12,30,0);
		System.out.println(FechaHoraPer("dd-MM-yyyy H:m:s",fecha,Locale.of("ES")));
		
		LocalTime t1=LocalTime.now();
		System.out.println(t1);
		
		t1=t1.withHour(10).withMinute(45);
		System.out.println(t1);
		
		//LocalTime t2=LocalTime.of(12, 33, 20, 100);
		//System.out.println(t2);
		
		
		
		
		
		
	}

}
