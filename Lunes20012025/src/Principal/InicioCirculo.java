package Principal;

import Clases.Circulo;

public class InicioCirculo {

	public static void main(String[] args) {
		Circulo c1=new Circulo(10);
		
		System.out.println(c1+" "+c1.perimetro()+" "+c1.area());
		
		
		
		Circulo c2=new Circulo();
		System.out.println(c2+" "+c2.perimetro()+" "+c2.area());

	}

}
