package principal;

public class ejer01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String saludo="Hola mundo";
		int numero=345;
		double salario=3500.50,comision=350.67;
		
		System.out.println(saludo);
		System.out.println(numero);
		System.out.println(salario+" "+comision);
		
		numero=numero+1000;   //numero +=1000; ---->1345
		numero=numero-1000;   //numero -=1000; ---->345
		numero=numero*(5000+200);  //numero *=5000+200
		numero=numero/10;    //numero /=10;  ------>34.5 ---->34

		
		salario *=1.10;           //salario=salario*1.10;   
		
		salario /=10;             //salario /=10;  
		

	} //fin de main

}//fin de la clase ejer01
