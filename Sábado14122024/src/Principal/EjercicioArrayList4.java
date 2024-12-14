package Principal;

import java.util.ArrayList;

public class EjercicioArrayList4 {

	public static void imprimir(ArrayList<Double> di) {
		for (int i = 0; i < di.size(); i++) System.out.println(i+" "+di.get(i));
	}
	public static void borrar(double n,ArrayList<Double> li) {
		
		while(li.remove(n)) {}
	}
	
	public static void main(String[] args) {
		ArrayList<Double> lista=new ArrayList<Double>();
		lista.add(12.45);
		lista.add(10.00);
		lista.add(12.45);
		lista.add(20.00);
		lista.add(12.45);
		lista.add(12.45);
		lista.add(12.45);
		lista.add(12.45);
		lista.add(12.45);
		lista.add(12.45);

		
		System.out.println("Impresión antes de borrar");
		imprimir(lista);
		
		System.out.println("Impresión después de borrar");
		borrar(12.45,lista);
		imprimir(lista);
		

	
	}

}
