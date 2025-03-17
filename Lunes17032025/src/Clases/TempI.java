package Clases;

public interface TempI {
	 //Interface a partir de JAVA 9 
     //atributos que son Final static public
     //metodos abstract
	 //metodos public static
	 //metodos default
	 //metodos private
	 //metodos private static
	void multi(int a,int b); //metodo public abstract
	
	//ejemplo de metodo public  static
	public static void mod(int a,int b) {
		System.out.println(a%b);
	}
	//ejemplo de metodo private  static
	private static void div(int a,int b) {
		System.out.println(a/b);
	}
	
	private void sub(int a,int b) {
		System.out.println(a-b);
	}
	
	//ejemplo de modulo por defecto
	public default void add(int a,int b) {
		sub(a,b);
		div(a,b);
		System.out.println(a+b);
	}
	
	
}
