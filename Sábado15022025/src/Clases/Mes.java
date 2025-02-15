package Clases;

public enum Mes {
	ENERO(31),
	FEBRERO(28),
	MARZO(31),
	ABRIL(30),
	MAYO(31),
	JUNIO(30),
	JULIO(31),
	AGOSTO(31), 
	SEPTIEMBRE(30),
	OCTUBRE(31),
	NOVIEMBRE(30),
	DICIEMBRE(31);
	
	private int dias;
	
	Mes(int n){this.dias=n;}
	
	public int getDias() {return this.dias;}
	
	public static Mes[] obtenerVerano() {
		return new Mes[]{JUNIO,JULIO,AGOSTO};
	}
	public static Mes[] obtenerInvierno() {
		return new Mes[]{NOVIEMBRE,DICIEMBRE,ENERO};
	}
}
