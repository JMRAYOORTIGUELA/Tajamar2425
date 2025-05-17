package Biblioteca;

public class General {
	/******************************************************************************/
	public static int alea(int li,int ls) {
		return (int)(Math.random()*(ls-li+1))+li;
	}
	/******************************************************************************/
	public static int[][] generaArrayBiInt(int nf,int nc,int maximo,int minimo){
      int tb[][]=new int[nf][nc];		
		
      for(int i=0;i<nf;i++) {
    	  for(int j=0;j<nc;j++) {
    		  tb[i][j]=alea(minimo,maximo);
    	  }
      }
      
      return tb;
	}
	/******************************************************************************/
	public static void imprimirBiInt(int m[][]) {
		
	    for(int i=0;i<m.length;i++) {
	    	  for(int j=0;j<m[i].length;j++) {
	    		  System.out.printf("%5d",m[i][j]);
	    	  }
	    	  System.out.println();
	      }
	}
	/******************************************************************************/
	public static int[] filaDeArrayBiInt(int nf,int m[][]) {
		int tb[]=new int[m[nf].length];
		
		for(int j=0;j<m[nf].length;j++) {
  		  tb[j]=m[nf][j];
  	  }
		return tb;
	}
	/*****************************************************************************/
	public static int[] columnaDeArrayBiInt(int nc,int m[][]) {
		int tb[]=new int[m.length];
		
	    for(int i=0;i<m.length;i++) {
	    		  tb[i]=m[i][nc];
	      }
	    return tb;
	}
	/*****************************************************************************/
	public static int[] coordenadasEnArrayBiInt(int numero,int m[][]) {
		int tb[]= {-1,-1 };
		
		for(int i=0;i<m.length;i++) {
	    	  for(int j=0;j<m[i].length;j++) {
	    		  if (m[i][j]==numero) {
	    			  tb[0]=i;
	    			  tb[1]=j;
	    			  return tb;
	    		  }
	    	  }
	 
	      }
		return tb;
	}
	/*****************************************************************************/
	public static boolean esPuntoDeSilla(int numero,int m[][]) {
		int posicion[]=coordenadasEnArrayBiInt(numero,m);
		if (posicion[0]==-1 && posicion[1]==-1)return false;
		int fila=posicion[0];
		int columna=posicion[1];
		
		int minimo=m[fila][0];
		for(int j=1;j<m[fila].length;j++) if (m[fila][j]<minimo)minimo=m[fila][j];
		
		int maximo=m[0][columna];
		for(int i=1;i<m.length;i++) if (m[i][columna]>maximo)maximo=m[i][columna];
		
		if (numero==maximo && numero==minimo)return true;
		return false;
		
		
	
	}
	/*****************************************************************************/
	public static int[] diagonal(int m[][],int fila,int columna,String direccion) {
	int[] diagonalAux=new int[1000];
	int elementos=0,i,j;
		
		for(i=0;i<m.length;i++) {
	    	  for(j=0;j<m[i].length;j++) {
	    		  
	    		  if ( 
	    				  (direccion.equals("nose") &&  (columna-j)==(fila-i) )
	    				  || (direccion.equals("neso") &&  (columna-j)==(i-fila) )
	    		     ){
	    			  diagonalAux[elementos++]=m[i][j];       
	    		  
	    		  }
	    	  }
	 
	      }
		
		int diagonal[]=new int[elementos];
		for(int k=0;k<elementos;k++)diagonal[k]=diagonalAux[k];
		return diagonal;
		
		
	}
	
	
}

