package Aclaracion;

abstract class Vehiculo {
}

interface GPS {
	static boolean gpsActivado() {
		return true;
	}
}

public class Coche extends Vehiculo implements GPS {
	public static void main(String[] args) {
		System.out.println(GPS.gpsActivado());
		//System.out.println(new Coche().gpsActivado()); // Error en tiempo de compilacion
	}
}