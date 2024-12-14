package Principal;

import java.util.ArrayList;

public class EjercicioArrayList3 {

	public static void imprimir(ArrayList<String> di) {
		for (int i = 0; i < di.size(); i++) System.out.println(i+" "+di.get(i));
	}
	public static void borrar(String cadena,ArrayList<String> li) {
		
		while(li.remove(cadena)) {}
	}
	
	public static void main(String[] args) {
		ArrayList<String> lista=new ArrayList<String>();
		lista.add("uno");
		lista.add("dos");
		lista.add("uno");
		lista.add("tres");
		lista.add("uno");
		lista.add("cuatro");
		lista.add("uno");
		lista.add("cinco");
		lista.add("uno");
		
		System.out.println("Impresión antes de borrar");
		imprimir(lista);
		
		System.out.println("Impresión después de borrar");
		borrar("uno",lista);
		imprimir(lista);
		
		lista.clear();
		System.out.println(lista.size());
		System.out.println(lista.isEmpty());
     lista.equals("uno");	

	
	}

}
