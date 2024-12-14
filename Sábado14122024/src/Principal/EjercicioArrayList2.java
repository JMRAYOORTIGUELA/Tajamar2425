package Principal;

import java.util.ArrayList;
import java.util.Scanner;

public class EjercicioArrayList2 {

	static Scanner sc=new Scanner(System.in);
	
	public static void imprimir(ArrayList<String> di) {
		for (int i = 0; i < di.size(); i++) System.out.println(i+" "+di.get(i));
	}
	
	public static void main(String[] args) {
		String cadena;
		ArrayList<String> diccionario=new ArrayList<String>();
		
		for(int i=1;i<=5;i++) {
			
			while(true) {
				System.out.print("Indique la palabra a añadir ");
				cadena=sc.nextLine();
				if (!diccionario.contains(cadena)) {
					diccionario.add(cadena);
					break;
				}else {
					System.out.println("Esta palabra ya existe dentro del diccionario.");
				}
			}
			
		}
		imprimir(diccionario);
		diccionario.remove(1);  //Elimina la posicion 1 del ArrayList
		diccionario.remove("blanco"); //Elimina el primer blanco que encuentre.
		imprimir(diccionario);
		
	}

}
