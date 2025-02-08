package Principal;

import java.util.ArrayList;

import Clases.CCuenta;
import Clases.CCuentaAhorro;

public class Inicio {
	public static void imprimir(ArrayList<CCuenta> li) {
		
		for (CCuenta item : li) {
		   System.out.println(item+" "+" "+item.intereses());
		}
	}
public static void main(String[] args) {
	
	ArrayList<CCuenta> lista=new ArrayList<CCuenta>();
	
	lista.add( new CCuentaAhorro("jose", "00l", 4000, 3, 20));
	

	
	
	
	
	
	
	
}
}
