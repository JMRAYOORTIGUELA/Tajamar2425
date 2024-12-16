package Principal;

import java.time.LocalDate;
import java.time.YearMonth;

public class Fechas5 {

	public static void main(String[] args) {
		YearMonth f=YearMonth.of(2024,2);
		LocalDate fecha;
		
		
		for(int i=1;i<=31;i++) {
			try {
				fecha=f.atDay(i);
				System.out.println(fecha);
			}catch(Exception e) {
		               	break;			
			}
		}
		
		

	}

}
