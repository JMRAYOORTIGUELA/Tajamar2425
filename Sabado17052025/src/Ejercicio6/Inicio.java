package Ejercicio6;




public class Inicio {

	public static void main(String[] args) {
		int matriz[][]=Biblioteca.General.generaArrayBiInt(5,10,100,50);
		Biblioteca.General.imprimirBiInt(matriz);
				
		System.out.println();
		int vector1[]=Biblioteca.General.filaDeArrayBiInt(1, matriz);
		for (int i : vector1) System.out.printf("%5d",i);
		
		System.out.println();
		int vector2[]=Biblioteca.General.columnaDeArrayBiInt(1, matriz);
		for (int i : vector2) System.out.printf("%5d",i);
		
		System.out.println();
		int vector3[]=Biblioteca.General.coordenadasEnArrayBiInt(55,matriz);
		for (int i : vector3) System.out.printf("%5d",i);
		
		System.out.println();
		int matriz2[][]= {{10,5,30},{12,2,20},{15,4,44}};
		System.out.println(Biblioteca.General.esPuntoDeSilla(30, matriz2));

		System.out.println();
		int vector4[]=Biblioteca.General.diagonal(matriz,4, 4, "neso");
		for (int i : vector4) System.out.printf("%5d",i);
}
}
