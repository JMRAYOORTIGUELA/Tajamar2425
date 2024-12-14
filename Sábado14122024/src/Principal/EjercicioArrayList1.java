package Principal;

import java.util.ArrayList;


public class EjercicioArrayList1 {

	/*
	 * int size()
	 * boolean add(E elemento) 
	 * void add(int posicion, E elemento)
	 * E set(int posicion, E elemento) 
	 * E get(int posicion) 
	 * boolean contains(E elemento) 
	 * int indexOf(E elemento) 
	 * Iterator<E> * iterator() 
	 *  
	 * void clear()
	 * boolean equals(Object x) 
	 * boolean isEmpty() 
	 * E remove(int posicion) 
	 * boolean remove(E elemento)  
	 */
   public static int alea(int li,int ls) {
	   return (int)(Math.random()*(ls-li+1))+li;
   }
   public static void imprimir(ArrayList<Integer> li) {
	   
	   for (int i = 0; i < li.size(); i++) {
		System.out.printf("[%d]=%d\n",i,li.get(i));
	}
   }
	
	
	public static void main(String[] args) {
		//Obtener un List de 10 posiciones con numeros aleatorios únicos entre 0 y 25
		int numero;
		ArrayList<Integer> lista=new ArrayList<Integer>();
		
		for(int i=1;i<=10;i++) {
			
           while(true) {			
			numero=alea(0,25);
			if (!lista.contains(numero)) {
				lista.add(numero);
				break;
			}
           }	
			
		}
		
		imprimir(lista);
		
		
		

	}

}
