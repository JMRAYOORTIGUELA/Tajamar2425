package Principal;

import java.util.HashMap;
import java.util.Map.Entry;

public class EjercicioHashMap1 {
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
	
	
	public static void main(String[] args) {
		HashMap<String,Double> alumnos=new HashMap<String,Double>();
		alumnos.put("PEREZ", 1.80);
		alumnos.put("RUIZ", 1.85);
		alumnos.put("LOPEZ", 1.72);
		alumnos.put("MARTIN", 1.60);
		alumnos.put("MARTIN", 1.75);

		for(String clave:alumnos.keySet()) {
			System.out.println(clave+" "+alumnos.get(clave));
		}
		
		System.out.println("\n======================\n");
		for(Double v:alumnos.values()) {
			System.out.println(v);
		}
		
		alumnos.remove("MARTIN");
		
		System.out.println("\n======================\n");
		for(Entry<String,Double> item:      alumnos.entrySet()) {
			System.out.printf("clave=%s valor=%.2f\n",item.getKey(),item.getValue());
		}
		

		System.out.println(alumnos.containsKey("RUIZ"));
		System.out.println(alumnos.containsValue(1.80));
		
		
	}

}
