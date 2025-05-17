package Ejercicio1;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class InicioArrayList {
   static Scanner sc=new Scanner(System.in);
	/*********************************************************************************************************/
	public static void alta(ArrayList<Articulo> li) {
		String codigo=null;
		
		while(true) {
			System.out.print("Dime el codigo ");codigo=sc.nextLine();
			if (existe(li,codigo)>-1) {
				System.out.println("El "+codigo+" ya existe.");
			}else {
				break;
			}
		};
		
		System.out.print("Dime la descripción ");String descripcion=sc.nextLine();
		System.out.print("Precio compra ");double precio_compra=Double.valueOf(sc.nextLine());
		System.out.print("Precio venta ");double precio_venta=Double.valueOf(sc.nextLine());
		System.out.print("Stock ");int stock=Integer.valueOf(sc.nextLine());
		
      li.add(new Articulo(codigo,descripcion,precio_compra,precio_venta,stock));
	}
	/*********************************************************************************************************/
	public static void baja(ArrayList<Articulo> li) {
		System.out.print("Dime el codigo ");String codigo=sc.nextLine();

	     for(int i=0;i<li.size();i++) {
	    	 if (codigo.equals(li.get(i).getCodigo())){
	    		 li.remove(i);
	    		 System.out.println("Elemento eliminado");
	    		 return ;
	    	 }
	     }
	     System.out.println(codigo+" no existe.");
	}
	/*********************************************************************************************************/
	public static boolean existe_old(ArrayList<Articulo> li,String codigo) {
		for (Articulo item : li) {
			if (codigo.equals(item.getCodigo())) return true;
		}
		return false;
	}
	/*********************************************************************************************************/
	public static int existe(ArrayList<Articulo> li,String codigo) {
		
		   for(int i=0;i<li.size();i++) {
		    	 if (codigo.equals(li.get(i).getCodigo())) return i;
		     }
		return -1;
	}
	/*********************************************************************************************************/
	public static void modificar(ArrayList<Articulo> li) {
		String codigo=null,descripcion=null, precio_venta=null,precio_compra=null,stock=null;
		int i=0;
		
		while(true) {
			System.out.print("Dime el codigo ");codigo=sc.nextLine();
			i=existe(li,codigo);
			if (i>-1)break;
			System.out.println("El "+codigo+" no existe.");
		};
		
		   System.out.println("Código: " + li.get(i).getCodigo());
           System.out.print("Nuevo código: ");codigo = sc.nextLine();
           if (!codigo.equals("")) li.get(i).setCodigo(codigo);
           
           
           System.out.println("Descripción: " + li.get(i).getDescripcion());
           System.out.print("Nueva descripción: "); descripcion = sc.nextLine();
           if (!descripcion.equals(""))  li.get(i).setDescripcion(descripcion);
          
           
           System.out.println("Precio de compra: " + li.get(i).getPrecio_compra());
           System.out.print("Nuevo precio de compra: ");precio_compra = sc.nextLine();
           if (!precio_compra.equals("")) li.get(i).setPrecio_compra(Double.parseDouble(precio_compra));
           
           System.out.println("Precio de venta: " + li.get(i).getPrecio_venta());
           System.out.print("Nuevo precio de venta: ");precio_venta = sc.nextLine();
           if (!precio_venta.equals("")) li.get(i).setPrecio_venta(Double.parseDouble(precio_venta));

           System.out.println("Stock: " + li.get(i).getStock());
           System.out.print("Nuevo stock: ");stock = sc.nextLine();
           if (!stock.equals("")) li.get(i).setStock(Integer.parseInt(stock));
		
	}
	/*********************************************************************************************************/
	public static void entrada_mercancia(ArrayList<Articulo> li) {
		String codigo=null;
		int i=0;
		
		while(true) {
			System.out.print("Dime el codigo ");codigo=sc.nextLine();
			i=existe(li,codigo);
			if (i>-1)break;
			System.out.println("El "+codigo+" no existe.");
		};

         System.out.print("Introduzca el número de unidades que entran: ");
         int stock = Integer.valueOf(sc.nextLine());
         li.get(i).setStock(stock + li.get(i).getStock());
         System.out.println("La mercancía ha entrado en el almacén.");  
		
	}
	/*********************************************************************************************************/
	public static void salida_mercancia(ArrayList<Articulo> li) {
		String codigo=null;
		int i=0;
		
		while(true) {
			System.out.print("Dime el codigo ");codigo=sc.nextLine();
			i=existe(li,codigo);
			if (i>-1)break;
			System.out.println("El "+codigo+" no existe.");
		};

         System.out.print("Introduzca el número de unidades que salen: "+li.get(i).getStock());
         int stock = Integer.valueOf(sc.nextLine());
         if ( li.get(i).getStock()-stock>0) {
        	 li.get(i).setStock( li.get(i).getStock()-stock);
         }else {
        	  System.out.println("Lo siento, no se pueden sacar tantas unidades.");
         }
		
	}
	/**
	 * @throws IOException 
	 * @throws InterruptedException *******************************************************************************************************/
	
	public static void main(String[] args) throws InterruptedException, IOException {
		ArrayList<Articulo> lista=new ArrayList<Articulo>();
		int op;
		String basura=null;
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
