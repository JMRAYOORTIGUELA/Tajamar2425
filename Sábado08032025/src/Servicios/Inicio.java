package Servicios;

import java.time.LocalDate;
import java.util.ArrayList;

public class Inicio {
	
	public static void imprimir(ArrayList<Servicio> lista ) {
		for (Servicio servicio : lista) {
			System.out.println(servicio);
		}
	}
	public static void total(ArrayList<Servicio> lista ) {
		double total=0;
		for (Servicio servicio : lista) {
			total +=servicio.costeTotal();
		}
		System.out.printf("El total facturado es %10.2f \n",total);
	}
	public static void totalManoObra(ArrayList<Servicio> lista ) {
		double total=0;
		for (Servicio servicio : lista) {
			total +=servicio.costeManoObra();
		}
		System.out.printf("El total de los salarios es %10.2f \n",total);
	}

	public static void main(String[] args) {
		ArrayList<Servicio> PEPE=new ArrayList<Servicio>();

		PEPE.add(new TrabajoPintura("pepe",LocalDate.of(200, 1, 10),"empresa A",100,20));
		PEPE.add(new RevisionAlarma("juan",LocalDate.of(200, 1, 10),"empresa B",4));
		
		
		imprimir(PEPE);
		total(PEPE);
		totalManoObra(PEPE);
	}

}
