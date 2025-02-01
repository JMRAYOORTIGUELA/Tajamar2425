package Principal;

import java.util.ArrayList;
import java.util.Iterator;

import ClasesCine.Cine;
import ClasesCine.Espectador;
import ClasesCine.General;
import ClasesCine.Pelicula;

public class InicioCine {

	public static void main(String[] args) {
	   int fila,i=0;
	   char letra;
	   
	   Pelicula p1=new Pelicula("abcd",3,18,"Almodovar");
	   Cine cinema=new Cine(8,9,20,p1);
	   
	   ArrayList<Espectador> amigos=new ArrayList<Espectador>();
	   amigos.add(new Espectador("jose",15,26));
	   amigos.add(new Espectador("juan",3,260));
	   amigos.add(new Espectador("ana",35,1000));
		
       
       for (Espectador espectador : amigos) {
    	  if (!cinema.haySitio())break;
    	  
    	  
    	 while(true) { 
		  fila=General.alea(0, cinema.getFilas()-1);
		  letra=(char)General.alea('A','A'+(cinema.getColumnas()-1));
	   
          if ( cinema.haySitioButaca(fila,letra)) {
        	  amigos.get(i).paga(cinema.getPrecio());
    	      cinema.sentar(fila, letra,amigos.get(i++));
    	   break;
           }
    	 } 
       
       }   
       
       
       

	}

}
