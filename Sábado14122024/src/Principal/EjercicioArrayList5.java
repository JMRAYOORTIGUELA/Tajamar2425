package Principal;

import java.util.ArrayList;
import java.util.Scanner;

public class EjercicioArrayList5 {
	static Scanner sc=new Scanner(System.in);
	
	
	public static void imprimir(ArrayList<String> di) {
		for (int i = 0; i < di.size(); i++) System.out.println(i+" "+di.get(i));
	}
	
	public static void imprimir(ArrayList<String> ca,ArrayList<String> in) {
		for(int i=0;i<ca.size();i++) {
			System.out.printf("castellano %s ----> ingles %s\n",ca.get(i),in.get(i));
		}
	}

	
	public static void main(String[] args) {
		String respuesta,palabra,word;
		int n;
		ArrayList<String> castellano=new ArrayList<String>();
		ArrayList<String> ingles=new ArrayList<String>();

		
	     do {
	    	 System.out.print("¿Palabra en castellano ?");
	    	 palabra=sc.nextLine();
	    	 n=castellano.indexOf(palabra);
	    	 if (n>-1) {
	    		 System.out.println("La traducción en ingles es "+ingles.get(n));
	    	 }else {
	    		 System.out.print("¿Dime su traducción en ingles ?");
		    	 word=sc.nextLine();
		    	 castellano.add(palabra);
		    	 ingles.add(word);
	    	 }
	    	 
	    	 
	    	 
	    	 System.out.print("¿Quiere añadir otra palabra?");
	    	 respuesta=sc.nextLine();
	     }while(!respuesta.equals("NO"));
		
		
		imprimir(castellano,ingles);
		
		
		

	
	}

}
