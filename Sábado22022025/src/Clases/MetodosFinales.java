package Clases;

//Un metodo declarado final cuando se hereda no se pude sobreescribir.
class A{
	
	final public int alea() {
		return 10;
	}
	
}


public class MetodosFinales extends A {

	
	public int alea() {
		return 33;
	}
	
	
}
