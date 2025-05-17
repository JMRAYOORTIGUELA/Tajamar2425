package Ejercicio1;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;

public class InicioHashMap {
   static Scanner sc=new Scanner(System.in);
	/*********************************************************************************************************/
	public static void alta(HashMap<String,Articulo> li) {
		String codigo=null;
		
		while(true) {
			System.out.print("Dime el codigo ");codigo=sc.nextLine();
			if (existe(li,codigo)==null) break;
			System.out.println("El "+codigo+" ya existe.");
			
		};
		
		System.out.print("Dime la descripción ");String descripcion=sc.nextLine();
		System.out.print("Precio compra ");double precio_compra=Double.valueOf(sc.nextLine());
		System.out.print("Precio venta ");double precio_venta=Double.valueOf(sc.nextLine());
		System.out.print("Stock ");int stock=Integer.valueOf(sc.nextLine());
		
      li.put(codigo,new Articulo(codigo,descripcion,precio_compra,precio_venta,stock));
	}
	/*********************************************************************************************************/
	public static void baja(HashMap<String,Articulo> li) {
		String codigo=null;
		
		while(true) {
			System.out.print("Dime el codigo ");codigo=sc.nextLine();
			if (existe(li,codigo)!=null) break;
			
				System.out.print("El codigo no existe");
		};
		li.remove(codigo);
	}
	/*********************************************************************************************************/
	public static String existe(HashMap<String,Articulo> li,String codigo) {
		  if (li.containsKey(codigo)) return codigo;
		return null;
	}
	/*********************************************************************************************************/
	public static void modificar(HashMap<String,Articulo> li) {
		String codigo=null,new_codigo=null,descripcion=null, precio_venta=null,precio_compra=null,stock=null;
		int i=0;
		
		while(true) {
			System.out.print("Dime el codigo ");codigo=sc.nextLine();
			codigo=existe(li,codigo);
			if (codigo!=null)break;
			System.out.println("El "+codigo+" no existe.");
		};
		
		Articulo art=li.get(codigo);
		
		   System.out.println("Código: " + art.getCodigo());
           System.out.print("Nuevo código: ");new_codigo = sc.nextLine();
           if (!new_codigo.equals("")) art.setCodigo(new_codigo);
           
           
           System.out.println("Descripción: " + art.getDescripcion());
           System.out.print("Nueva descripción: "); descripcion = sc.nextLine();
           if (!descripcion.equals(""))  art.setDescripcion(descripcion);
          
           
           System.out.println("Precio de compra: " + art.getPrecio_compra());
           System.out.print("Nuevo precio de compra: ");precio_compra = sc.nextLine();
           if (!precio_compra.equals("")) art.setPrecio_compra(Double.parseDouble(precio_compra));
           
           System.out.println("Precio de venta: " + art.getPrecio_venta());
           System.out.print("Nuevo precio de venta: ");precio_venta = sc.nextLine();
           if (!precio_venta.equals("")) art.setPrecio_venta(Double.parseDouble(precio_venta));

           System.out.println("Stock: " + art.getStock());
           System.out.print("Nuevo stock: ");stock = sc.nextLine();
           if (!stock.equals("")) art.setStock(Integer.parseInt(stock));
           
           li.put(codigo, art);
		
	}
	/*********************************************************************************************************/
	public static void entrada_mercancia(HashMap<String,Articulo> li) {
		String codigo=null,new_codigo=null;
		
		while(true) {
			System.out.print("Dime el codigo ");new_codigo=sc.nextLine();
		    codigo=existe(li,new_codigo);
			if (codigo!=null)break;
			System.out.println("El "+new_codigo+" no existe.");
		};
         Articulo art=li.get(codigo);
         System.out.print("Introduzca el número de unidades que entran: ");
         int stock = Integer.valueOf(sc.nextLine());
         art.setStock(stock + art.getStock());
         System.out.println("La mercancía ha entrado en el almacén.");
         li.put(codigo, art);
		
	}
	/*********************************************************************************************************/
	public static void salida_mercancia(HashMap<String,Articulo> li) {
		String codigo=null,new_codigo=null;
		
		while(true) {
			System.out.print("Dime el codigo ");new_codigo=sc.nextLine();
		    codigo=existe(li,new_codigo);
			if (codigo!=null)break;
			System.out.println("El "+new_codigo+" no existe.");
		};
         Articulo art=li.get(codigo);
         System.out.print("Introduzca el número de unidades que entran: ");
         int stock = Integer.valueOf(sc.nextLine());
         if ( art.getStock()-stock>0) {
        	 art.setStock( art.getStock()-stock);
        	 li.put(codigo, art);
         }else {
        	  System.out.println("Lo siento, no se pueden sacar tantas unidades.");
         }
		
	}
	/**
	 * @throws IOException 
	 * @throws InterruptedException *******************************************************************************************************/
	
	public static void main(String[] args) throws InterruptedException, IOException {
		HashMap<String,Articulo> lista=new HashMap<String,Articulo>();
		int op;
		String basura=null;
		String opciones[]= {"1. Listado","2. Alta","3. Baja","4. Modificación","5. Entrada de mercancía","6. Salida de mercancía","7. Salir"};

		do {
		op=Biblioteca.menu(opciones, sc);
		switch(op) {
		case 1: // listar
			for (Entry<String, Articulo> item : lista.entrySet()) System.out.println(item.getValue());
			break; 
		case 2: //alta
			alta(lista);
			break;
		case 3: //baja
			baja(lista);
			break;
		case 4: //modificacion
			modificar(lista);
			break;
		case 5: //entrada_mercancia
			entrada_mercancia(lista);
			break;
		case 6: //salida_mercancia
			salida_mercancia(lista);
			break;		
		}
		if (op!=opciones.length) {
			System.out.print("Presione una tecla para continuar ");
			basura=sc.nextLine();
			new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();
		}
		}while(op!=opciones.length);
		System.out.println("Se termino la aplicación");
	}

}
