package Principal;

import Clases.Rectangulo;

public class InicioRectangulo {
	
	public static void imprimir(Rectangulo a) {
		System.out.println(a+" perimetro="+a.perimetro()+" area="+a.area());
	}
	
	public static void main(String[] args) {
		Rectangulo r1=new Rectangulo();
		Rectangulo r2=new Rectangulo(100);
		Rectangulo r3=new Rectangulo(100,200);

		/*System.out.println(r1+" perimetro="+r1.perimetro()+" area="+r1.area());
		System.out.println(r2+" perimetro="+r2.perimetro()+" area="+r2.area());
		System.out.println(r3+" perimetro="+r3.perimetro()+" area="+r3.area());
		*/
		imprimir(r1);
		imprimir(r2);
		imprimir(r3);
	}
}
