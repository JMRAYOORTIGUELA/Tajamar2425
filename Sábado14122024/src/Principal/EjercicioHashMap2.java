package Principal;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Map.Entry;

public class EjercicioHashMap2 {
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
	
	public static void imprimir(HashMap<String,String> di) {
	
	for(Entry<String,String> p:	di.entrySet()) {
		System.out.printf("%s----ingles---->%s\n",p.getKey(),p.getValue());
	}
	}

	public static void main(String[] args) {
		String respuesta,palabra,word;

		HashMap<String,String> diccionario=new HashMap<String,String>();

	     do {
	    	 System.out.print("¿Palabra en castellano ?");
	    	 palabra=sc.nextLine();
	    	 if (diccionario.containsKey(palabra)) {
	    		 System.out.println("La traducción en ingles es "+diccionario.get(palabra));
	    	 }else {
	    		 System.out.print("¿Dime su traducción en ingles ?");
		    	 word=sc.nextLine();
		    	 diccionario.put(palabra, word);
	    	 }
	    	 
	    	 System.out.print("¿Quiere añadir otra palabra?");
	    	 respuesta=sc.nextLine();
	     }while(!respuesta.equals("NO"));
		
	     imprimir(diccionario);
	     
	}

}
