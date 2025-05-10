package Ejercicio1;

import java.util.ArrayList;
import java.util.Scanner;

public class Inicio {
   static Scanner sc=new Scanner(System.in);
	
	public static void alta(ArrayList<Articulo> li) {
		System.out.print("Dime el codigo ");String codigo=sc.nextLine();
		System.out.print("Dime la descripción ");String descripcion=sc.nextLine();
		System.out.print("Precio compra ");double precio_compra=Double.valueOf(sc.nextLine());
		System.out.print("Precio venta ");double precio_venta=Double.valueOf(sc.nextLine());
		System.out.print("Stock ");int stock=Integer.valueOf(sc.nextLine());
		
      li.add(new Articulo(codigo,descripcion,precio_compra,precio_venta,stock));
	}
	public static void baja(ArrayList<Articulo> li) {
		System.out.print("Dime el codigo ");String codigo=sc.nextLine();

	     for(int i=0;i<li.size();i++) {
	    	 if (codigo.equals(li.get(i).getCodigo())){
	    		 li.remove(i);
	    		 System.out.println("Elemento eliminado");
	    		 return;
	    	 }
	     }
	     System.out.println(codigo+" no existe.");
	}
	public static boolean existe(ArrayList<Articulo> li,String codigo) {
		for (Articulo item : li) {
			if (codigo.equals(item.getCodigo())) return true;
		}
		return false;
	}
	public static void main(String[] args) {
		ArrayList<Articulo> lista=new ArrayList<Articulo>();
		int op;
		String opciones[]= {"1. Listado",
				"2. Alta",
				"3. Baja",
				"4. Modificación",
				"5. Entrada de mercancía",
				"6. Salida de mercancía",
				"7. Salir"
		};

		do {
		op=Biblioteca.menu(opciones, sc);
		switch(op) {
		case 1: // listar
			for (Articulo item : lista) System.out.println(item);
			break; 
		case 2: //alta
			alta(lista);
			break;
		case 3: //baja
			baja(lista);
		}
		
		System.out.println(op);
		}while(op!=opciones.length);

	}

}
