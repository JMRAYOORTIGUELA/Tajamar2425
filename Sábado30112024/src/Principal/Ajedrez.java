package Principal;

public class Ajedrez {

	public static void main(String[] args) {
		String columnas="abcdefgh";
		String filas="87654321";

		String posicion="g5";
		
		String columna=String.valueOf(posicion.charAt(0));
		String fila=String.valueOf(posicion.charAt(1));
		
		
		System.out.println(columnas.indexOf(columna));
		System.out.println(filas.indexOf(fila));
		
		
		System.out.println("hola como estais".indexOf("z"));
	}

}
