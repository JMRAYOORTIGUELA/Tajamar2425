package ClasesCine;

public class Cine {
    private Asiento asientos[][];
    private double precio;
    private Pelicula pelicula;
    
    public Cine(int filas,int columns,double precio,Pelicula pelicula) {
    	asientos=new Asiento[filas][columns];
    	this.precio=precio;
    	this.pelicula=pelicula;
    	rellenaButacas();
    }
    public int getFilas() {   	return asientos.length;    }
    public int getColumnas() { return asientos[0].length; }
    
    public Asiento[][] getAsientos() {
		return asientos;
	}

	public void setAsientos(Asiento[][] asientos) {
		this.asientos = asientos;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public Pelicula getPelicula() {
		return pelicula;
	}

	public void setPelicula(Pelicula pelicula) {
		this.pelicula = pelicula;
	}

	private void rellenaButacas() {
    	int fila=asientos.length;
    	
    	for(int i=0;i<asientos.length;i++) {
    		for(int j=0;j<asientos[i].length;j++) {
    			asientos[i][j]=new Asiento( (char)('A'+j)    ,fila );
    		}
    		fila--;
    	}
    }
    public boolean haySitio() {
    	for(int i=0;i<asientos.length;i++) {
    		for(int j=0;j<asientos[i].length;j++) {
    			
    	        if (!asientos[i][j].ocupado())return true;		
    		}
    	}
    	return false;
    }
    public boolean haySitioButaca(int fila,char letra) {
    	return getAsiento(fila,letra).ocupado();
    }
    public Asiento getAsiento(int fila,char letra) {
    	return asientos[asientos.length-fila-1][letra-'A'];
    }
    public void sentar(int fila,char letra,Espectador e) {
    	getAsiento(fila,letra).setEspectador(e);
    }
    public boolean sePuedeSentar(Espectador e) {
    	return e.tieneDinero(precio) && e.tieneEdad(pelicula.getEdadMinima());
    }
	@Override
	public String toString() {
		String cadena= "Cine [precio=" + precio + ", pelicula=" + pelicula + "]\n";
		
		for(int i=0;i<asientos.length;i++) {
    		for(int j=0;j<asientos[i].length;j++) {
    			cadena =cadena+asientos[i][j];
    		}
    		cadena +='\n';
		}
    	return cadena;
	}
    
}
