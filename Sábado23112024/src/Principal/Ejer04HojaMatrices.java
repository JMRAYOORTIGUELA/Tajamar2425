package Principal;

import java.util.Scanner;

public class Ejer04HojaMatrices {
  
	static Scanner sc=new Scanner(System.in);
   
	
     public static int alea(int li,int ls) { return
	  (int)(Math.random()*(ls-li+1))+li; }
     
     
    public static void rellenar(int m[][]) {
    	boolean encontrado=false;
    	int c=0,aleatorio,f=0,cc=0;
    	for(int i=0;i<m.length;i++) {
    		for(int j=0;j<m[i].length;j++) {
    	      c++;
    
    	      while(true) {
	    	      aleatorio=alea(0,1000);
	    	      encontrado=false;
	    	      for(int z=1;z<c;z++) {
	    	    	  f=(int)((z-1)/m[0].length);
	    	    	  cc=((z-1)%m[0].length);
	    	    	  if (m[f][cc]==aleatorio) {
	    	    		  encontrado=true;
	    	    		  break;
	    	    	  }
    	      }
    	      if (!encontrado)break;
    	      }
    	      m[i][j]=aleatorio;
    		}
    	}
    }
    public static void rellenar2(int m[][]) {
    	int v[]=new int[m.length*m[0].length ];
    	int c=0,aleatorio=0;
    	boolean encontrado;
    	
    	for(int i=0;i<m.length;i++) {
    		for(int j=0;j<m[i].length;j++) {
    	

    			while (true) {
    				encontrado=false;
    			
	    			aleatorio=alea(0,1000);
	    			
	    			for(int z=0;z<c;z++) {
	    				if(v[z]==aleatorio) {
	    					encontrado=true;
	    					break;
	    				}
	    			}
	    		   if (!encontrado)break;	
    			}
    			
    			m[i][j]=aleatorio;
    			v[c++]=aleatorio;
    			
    			
    		}
    	}
    }
    public static void imprimir(int m[][]) {
    	for(int i=0;i<m.length;i++) {
    		for(int j=0;j<m[i].length;j++) {
    			System.out.printf("%6d",m[i][j]);
    		}
    		System.out.println();
    	}
    }
    public static void MaximoMinimo(int m[][]) {
    	int maximo=-1,minimo=1050;
    	int imaximo=0,jmaximo=0,iminimo=0,jminimo=0;
    	
    	for(int i=0;i<m.length;i++) {
    		for(int j=0;j<m[i].length;j++) {
    			
    			if (m[i][j]>maximo) {
    				maximo=m[i][j];
    				imaximo=i;
    				jmaximo=j;
    			}
    			if (m[i][j]<minimo) {
    				minimo=m[i][j];
    				iminimo=i;
    				jminimo=j;
    			}
    		}
    	}
    	System.out.printf("\nMaximo [%d,%d]=%d\n",imaximo,jmaximo,maximo);
    	System.out.printf("\nMinimo [%d,%d]=%d\n",iminimo,jminimo,minimo);
    }
	
	public static void main(String[] args) {
	int matriz[][]=new int[6][10];
    rellenar(matriz);
    imprimir(matriz);
    MaximoMinimo(matriz);
	
	}

}
