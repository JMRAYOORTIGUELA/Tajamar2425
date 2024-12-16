package Principal;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.MonthDay;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Locale;

public class Fechas4 {
	public static String FechaHoraPer(String patron,LocalDate fecha,Locale lo) {
		DateTimeFormatter f=DateTimeFormatter.ofPattern(patron, lo);
		return fecha.format(f);
	}
	public static void main(String[] args) {
		ArrayList<LocalDate> festivos=new ArrayList<LocalDate>();
		MonthDay[] fiestas = new MonthDay[8];
		fiestas[0] = MonthDay.of(1, 1);
		fiestas[1] = MonthDay.of(5, 1);
		fiestas[2] = MonthDay.of(8, 15);
		fiestas[3] = MonthDay.of(10, 12);
		fiestas[4] = MonthDay.of(11, 1);
		fiestas[5] = MonthDay.of(12, 6);
		fiestas[6] = MonthDay.of(12, 8);
		fiestas[7] = MonthDay.of(12, 25);


		int año;
		LocalDate diaTest;
		for (año = 2014; año < 2030; año++) {
			for (MonthDay test : fiestas) {
				diaTest = test.atYear(año);
				if (diaTest.getDayOfWeek() == DayOfWeek.SATURDAY || diaTest.getDayOfWeek() == DayOfWeek.SUNDAY) {
					festivos.add(diaTest);
				}
			}
			System.out.println("En " + año + " hay " + festivos.size() + " dia(s) festivo(s) sábado o domingo");
			for(LocalDate f:festivos)System.out.println(FechaHoraPer("EEEE dd-MMMM-yyyy",f,Locale.of("ES")));
			festivos.clear();
		}

	}

}
