package Principal;

import java.util.Scanner;

public class Inicio {
	public static Scanner sc=new Scanner(System.in);
	public static final int NumColoresCombinacion = 4;        	  /* Número de colores de una combinación */ 
	public static final int NumColoresJuego = 6;      
	public static final String[] TablaColores={"R", "A","V", "Z", "M","B"};
	
	public static int alea(int li,int ls) {
		return (int)(Math.random()*(ls-li+1))+li;
	}
	
	public static void Combinacion(String[] Com) {


	     for(int i=0;i<NumColoresCombinacion;i++) {
	    	 Com[i]=TablaColores[alea(0,TablaColores.length-1)];
	     }

		}
	public static void rellenar(String[] usua) {
		boolean colocado=false;
	    for(int i=0;i<NumColoresCombinacion;i++) {
	    	colocado=false;
	    	do {
	    	 System.out.print("Dime el color "+String.valueOf(i)+" ");
	    	 
	    	 usua[i]=sc.nextLine();
	    	 for(int j=0;j<TablaColores.length && !colocado;j++) {
	    		 if (usua[i].equals(TablaColores[j])) colocado=true;
	    	 }
	    	}while(!colocado);
	    	 
	     }
	}
	public static boolean comprobacion(String[] Com,String[] usu) {
		int iguales=0,existentes=0;
		
		for(int i=0;i<Com.length;i++) {
			if (Com[i].equals(usu[i]) && Com[i] !="-" && usu[i] !="-") {
				iguales++;
				Com[i]="-";
				usu[i]="-";
			}
		}
		
		for(int i=0;i<Com.length;i++) {
			for(int j=0;j<usu.length;j++) {
				if (Com[i].equals(usu[j]) && Com[i] !="-" && usu[j] !="-") {
					existentes++;
					Com[i]="-";
					usu[j]="-";
					break;
				}
		}
		}
		System.out.printf("iguales=%d existentes=%d\n",iguales,existentes);
		return iguales==Com.length;
	}
	
public static void main(String[] args) {
	String colores="";
	for(int i=0;i<TablaColores.length;i++)colores +=TablaColores[i];
	
	boolean vfinal=false;
	String[] Combi=new String[NumColoresCombinacion];
	Combinacion(Combi);
	for (String item : Combi) System.out.print(item);
	System.out.println();
	String[] usuario=new String[NumColoresCombinacion];

	
	for(int i=1;i<=20;i++) {
		System.out.println("Intento numero "+i);
		System.out.println("Los colores posibles son "+colores);
		rellenar(usuario);
		vfinal=comprobacion(Combi.clone(),usuario.clone());
		if (vfinal) {
			System.out.println("Enhorabuena acerto la combinación en el intento "+i);
			break;
		}
	}
	if (!vfinal)System.out.println("El numero de intentos llego al tope");
	
	

}
}


