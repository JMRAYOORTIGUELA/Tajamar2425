package Supermercado;

import java.time.LocalDate;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		Detergente det1=new Detergente("limpiamas",2.5);
		det1.setVolumen(33);
		det1.setDescuento(2);
		det1.setTipoEnvase("Botella de plástico pequeña");
		System.out.println(det1);
		
		Cereales cer1=new Cereales("crunchy","Espelta",3);
		cer1.setCaducidad(LocalDate.of(2022, 8, 2));
		System.out.println("Calorias "+cer1.getCalorias());
		System.out.println(cer1);
		
		Vino vin1=new Vino("cune","tinto",12,8);
		vin1.setVolumen(330);
		vin1.setTipoEnvase("botella de cristal");
		vin1.setCaducidad(LocalDate.of(2026, 10, 2));
		vin1.setDescuento(5);
		System.out.println(vin1);
		
		ArrayList<EsAlimento> lista=new ArrayList<>();
		lista.add(cer1);
		lista.add(vin1);
		
		int total=0;
		for (EsAlimento item : lista) total +=item.getCalorias();
		
		System.out.println("Total calorias "+total);
		
		

	}

}
