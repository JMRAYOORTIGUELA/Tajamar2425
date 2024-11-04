package Principal;

public class InicioMatrices {
	/*******************************************************************************/
	public static void primero() {
	String tb[]= {"maria","juan","andres","jose Manuel"};
		
		System.out.println("El nº de posiciones es "+tb.length);
		tb[1]="juan pedro";

		for (int i = 0; i < tb.length; i++) System.out.println(i+" "+tb[i]);
	}
	/*******************************************************************************/
	public static int alea(int li,int ls) {
		return (int)(Math.random()*(ls-li+1))+li;
	}
	/*******************************************************************************/
	public static void main(String[] args) {
	    //primero();
		int tb[]=new int[10];
		for (int i = 0; i < tb.length; i++)tb[i]=alea(100,200);
		
		for (int i = 0; i < tb.length; i++) System.out.println(i+" "+tb[i]);
		
		String meses[]=new String[12];
		meses[0]="Enero";
		meses[1]="Febrero";
		meses[2]="Marzo";
		meses[3]="Abril";
		meses[4]="Mayo";
		meses[5]="Junio";
		meses[6]="Julio";
		meses[7]="Agosto";
		meses[8]="Septiembre";
		meses[9]="Octubre";
		meses[10]="Noviembre";
		meses[11]="Diciembre";
		
		for (int i = 0; i < meses.length; i++) System.out.println(i+" "+meses[i]);
		
		String me[]= {"Enero","Febrero"};
		
	}

}
