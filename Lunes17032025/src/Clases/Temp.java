package Clases;



public class Temp implements TempI {

	@Override
	public void multi(int a, int b) {
		System.out.println("Utilizacion metodo abstracto");
		System.out.println(a+b);
	}

}
