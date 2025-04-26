package Ajedrez;

import java.util.ArrayList;
import java.util.HashMap;

public class Inicio {
	public static int alea(int li,int ls) {
		return (int)(Math.random()*(ls-li+1))+li;
	}
	public static void main(String[] args) {
		HashMap<String,Integer> lista=new HashMap<String,Integer>();
		lista.put("dama",9);
		lista.put("torre",5);
		lista.put("alfil",3);
		lista.put("caballo",2);
		lista.put("peon",1);
		
	ArrayList<String> piezas=new ArrayList<String>();
	//1 dama, 2 torres, 2 alfiles, 2 caballos y 8 peones
	piezas.add("dama");
	piezas.add("torre");
	piezas.add("torre");
	piezas.add("alfil");
	piezas.add("alfil");
	piezas.add("caballo");
	piezas.add("caballo");
	piezas.add("peon");
	piezas.add("peon");
	piezas.add("peon");
	piezas.add("peon");
	piezas.add("peon");
	piezas.add("peon");
	piezas.add("peon");
	piezas.add("peon");
	
	ArrayList<String> extraer=new ArrayList<String>();
	
	int capturas=alea(0,piezas.size()-1),pos;
	System.out.println("Numero de piezas a capturar "+capturas);
	
	for(int i=1;i<=capturas;i++) {
		pos=alea(0,piezas.size()-1);
		extraer.add(piezas.get(pos));
		piezas.remove(pos);
	}
	int suma=0;
	for (String item : extraer) {
		System.out.println(item+" "+lista.get(item)+" peones");
		suma +=lista.get(item);
	}
	System.out.println("Total="+suma);
		
	
	
	}

}
