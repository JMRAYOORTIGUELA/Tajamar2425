package Principal;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Fechas3 {
  /*
	Symbol  Meaning                     Presentation      Examples
	  ------  -------                     ------------      -------
	   G       era                         text              AD; Anno Domini; A
	   u       year                        year              2004; 04
	   y       year-of-era                 year              2004; 04
	   D       day-of-year                 number            189
	   M/L     month-of-year               number/text       7; 07; Jul; July; J
	   d       day-of-month                number            10
	   Q/q     quarter-of-year             number/text       3; 03; Q3; 3rd quarter
	   Y       week-based-year             year              1996; 96
	   w       week-of-week-based-year     number            27
	   W       week-of-month               number            4
	   E       day-of-week                 text              Tue; Tuesday; T
	   e/c     localized day-of-week       number/text       2; 02; Tue; Tuesday; T
	   F       week-of-month               number            3
	   a       am-pm-of-day                text              PM
	   h       clock-hour-of-am-pm (1-12)  number            12
	   K       hour-of-am-pm (0-11)        number            0
	   k       clock-hour-of-am-pm (1-24)  number            0
	   H       hour-of-day (0-23)          number            0
	   m       minute-of-hour              number            30
	   s       second-of-minute            number            55
	   S       fraction-of-second          fraction          978
	   A       milli-of-day                number            1234
	   n       nano-of-second              number            987654321
	   N       nano-of-day                 number            1234000000
	   V       time-zone ID                zone-id           America/Los_Angeles; Z; -08:30
	   z       time-zone name              zone-name         Pacific Standard Time; PST
	   O       localized zone-offset       offset-O          GMT+8; GMT+08:00; UTC-08:00;
	   X       zone-offset 'Z' for zero    offset-X          Z; -08; -0830; -08:30; -083015; -08:30:15;
	   x       zone-offset                 offset-x          +0000; -08; -0830; -08:30; -083015; -08:30:15;
	   Z       zone-offset                 offset-Z          +0000; -0800; -08:00;
	*/
	
	public static String FechaHoraPer(String patron,LocalDate fecha,Locale lo) {
		DateTimeFormatter f=DateTimeFormatter.ofPattern(patron, lo);
		return fecha.format(f);
	}
	public static String FechaHoraPer(String patron,LocalDate fecha) {
		DateTimeFormatter f=DateTimeFormatter.ofPattern(patron);
		return fecha.format(f);
	}
	
	
	public static void mes(LocalDate f) {
		f=f.plusMonths(1).minusDays(1);  //El último día del mes
		while(f.getDayOfWeek()!=DayOfWeek.FRIDAY) {
			f=f.minusDays(1);
		}
		
		//System.out.println(f.getDayOfMonth()+"/"+f.getMonthValue()+"/"+f.getYear());
		
		//System.out.println(FechaHoraPer("MMMM dd-M-yyyy",f,Locale.of("ES")));
		System.out.println(FechaHoraPer("MMMM dd-M-yyyy",f));
		
	}
	
	
	public static void main(String[] args) {
		// En mi empresa se paga el último viernes de cada mes.
		//Indicar en cada uno de los meses del año la fecha de pago.
        LocalDate fecha;
		int anno=LocalDate.now().getYear();
		for(int i=1;i<=12;i++) {
			fecha=LocalDate.of(anno, i, 1);
			mes(fecha);
		}
		
		
		
	}

}
