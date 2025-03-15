package Bedidas;

public class Almacen {
	private Bebida[][] estanteria;

	public Almacen(int nfilas,int columnas) {
		estanteria=new Bebida[nfilas][columnas];
	}
	public Almacen() {
		estanteria=new Bebida[6][6];
	}
	//metodos
	public void agregarBebida(Bebida a) {
        boolean posicionado=false;
        
		for(int i=0;i<estanteria.length && !posicionado   ;i++) {
			for(int j=0;j<estanteria[i].length && !posicionado;j++) {
				if (estanteria[i][j]==null) {
					estanteria[i][j]=a;
					posicionado=true;
				}
				
		}
		if (posicionado) {
			System.out.println("Bebida añadida");
		}else {
			System.out.println("No tengo hueco.");
		}
	}
	}
	public void eliminarBebida(Bebida a) {
		
		boolean borrado=false;
		
		for(int i=0;i<estanteria.length && !borrado   ;i++) {
			for(int j=0;j<estanteria[i].length && !borrado;j++) {
				if (estanteria[i][j]!=null && estanteria[i][j].getId()==a.getId() ) {
					estanteria[i][j]=null;
					borrado=true;
				}
		}
			if (borrado) {
				System.out.println("Bebida borrada");
			}else {
				System.out.println("La bebida no esta dentro del almacen.");
			}
		
	}
	}
		public void eliminarBebida(int id) {
			
			boolean borrado=false;
			
			for(int i=0;i<estanteria.length && !borrado   ;i++) {
				for(int j=0;j<estanteria[i].length && !borrado;j++) {
					if (estanteria[i][j]!=null && estanteria[i][j].getId()==id ) {
						estanteria[i][j]=null;
						borrado=true;
					}
			}
				if (borrado) {
					System.out.println("Bebida borrada");
				}else {
					System.out.println("La bebida no esta dentro del almacen.");
				}
			}	
		}
		public void mostrarBebidas() {
			
			for(int i=0;i<estanteria.length   ;i++) {
				for(int j=0;j<estanteria[i].length ;j++) {
					if (estanteria[i][j]!=null) {
						System.out.printf("Fila=%d Columna=%d %s\n",i,j,estanteria[i][j]);
					}
				}
			}	
	
		}
		public double PrecioTotalBebidas() {
			double total=0;
			for(int i=0;i<estanteria.length   ;i++) {
				for(int j=0;j<estanteria[i].length ;j++) {
					if (estanteria[i][j]!=null) {
						total +=estanteria[i][j].getPrecio();
					}
				}
			}
			return total;
		}
		public double PrecioTotalBebidas(String marca) {
			double total=0;
			
			for(int i=0;i<estanteria.length   ;i++) {
				for(int j=0;j<estanteria[i].length ;j++) {
					if (estanteria[i][j]!=null && estanteria[i][j].getMarca().compareToIgnoreCase(marca)==0 ) {
						total +=estanteria[i][j].getPrecio();
					}
				}
			}
			return total;
		}
		public double PrecioTotalBebidas(int columna) {
			double total=0;
			
			for(int i=0;i<estanteria.length   ;i++) {
					if (estanteria[i][columna]!=null  ) {
						total +=estanteria[i][columna].getPrecio();
				}
			}
			return total;
		}
}
