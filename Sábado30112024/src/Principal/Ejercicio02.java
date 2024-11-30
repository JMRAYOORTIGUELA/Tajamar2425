package Principal;

import java.util.Scanner;

public class Ejercicio02 {

	static Scanner sc=new Scanner(System.in);
	
	public static int alea(int li,int ls) {
		
		return (int)(Math.random()*(ls-li+1))+li;
	}
	public static void rellenar(int m[]) {
		
		for (int i = 0; i < m.length; i++) {
		      m[i]=alea(0,20);	
		}
	}
	public static void imprimir(int m[]) {
		System.out.println();
		for (int i = 0; i < m.length; i++) {
		      System.out.printf("%3d", m[i]);	
		}
		System.out.println();
		for (int i = 0; i < m.length; i++) {
		      System.out.printf("%3d", i);	
		}
		System.out.println();

	}
	public static void maxmin(int m[]) {
		int maximo=m[0],minimo=m[0],cmaximo=1,cminimo=1;
		String maxdonde="0",mindonde="0";
		
		for (int i = 1; i < m.length; i++) {
			
			if (m[i]>maximo) {
				maximo=m[i];
			    cmaximo=1;	
			    maxdonde=String.valueOf(i);
			}else if(m[i]==maximo) {
				cmaximo++;
				maxdonde  =maxdonde+" "+String.valueOf(i);
			}
			
			if (m[i]<minimo) {
				minimo=m[i];
				cminimo=1;
				mindonde=String.valueOf(i);
			}else if(m[i]==minimo) {
				cminimo++;
				mindonde  =mindonde+" "+String.valueOf(i);
			}
			
		}
		
		System.out.printf("\nmaximo=%d %d veces %s",maximo,cmaximo,maxdonde);
		System.out.printf("\nminimo=%d %d veces %s",minimo,cminimo,mindonde);
		
		
		
		
	}
	
	public static void main(String[] args) {
		System.out.print("Indique el tamaño del vector ");
		int n=Integer.valueOf(sc.nextLine());
		int tb[]=new int[n];
		rellenar(tb);
		imprimir(tb);
		maxmin(tb);

	}

}
