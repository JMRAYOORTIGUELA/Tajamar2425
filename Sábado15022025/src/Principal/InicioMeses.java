package Principal;

import java.util.Iterator;

import Clases.Mes;

public class InicioMeses {

	public static Mes comprobar(String cade) {
        Mes b=null;

        try {
        	
		   b=Mes.valueOf(cade);
		   
		}catch(Exception e) {
            b=Mes.AGOSTO;			
		}
        
		return b;
		
	}
	
	
	public static void main(String[] args) {
		

		for(Mes a:Mes.obtenerVerano())
			System.out.println(a+" "+a.getDias()+" "+a.ordinal());
		
		
		

	}
}
