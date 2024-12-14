package Principal;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Map.Entry;

public class EjercicioHashMap3 {
  /**
		void clear()
		boolean containsKey(Object clave)
		boolean containsValue(Object valor)
		boolean equals(Object x)
		V get(Object clave)
		boolean isEmpty()
		Set<K> keySet()
	
		V remove(Object clave)
		int size()
 */
	
	static Scanner sc=new Scanner(System.in);
	
	public static void imprimir(HashMap<String,ArrayList<String>> di) {
	
	for(Entry<String,ArrayList<String>> p:	di.entrySet()) {
		
		System.out.printf("FAMILIA %s\n",p.getKey());
		 
		for(String f:p.getValue()) System.out.println("\t"+f);	
	
	}
	}

	public static void main(String[] args) {

		HashMap<String,ArrayList<String>> familias=new HashMap<String,ArrayList<String>>();
		
		
		ArrayList<String> lopez=new ArrayList<String>();
		
		lopez.add("ANA");
		lopez.add("JUAN");
		lopez.add("MANUEL");
		
		ArrayList<String> perez=new ArrayList<String>();
		perez.add("ISABEL");
		perez.add("JUAN ANDRES");
		
		familias.put("LOPEZ",lopez );
		familias.put("PEREZ",perez );
		
		imprimir(familias);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		


	     
	}

}
