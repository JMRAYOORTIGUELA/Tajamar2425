package Principal;

public class Ejer02 {

	public static void main(String[] args) {
		String v[]= {"Suspensos","Aprobados","Bienes","Notables","Sobresalientes"};
		int n[]= {1,2,3};
		
		//for (int i = 0; i < v.length; i++) System.out.println(v[i]);
		
		int c=0;
		for( String item : v ) {
			System.out.println(c+" "+item);
			c++;
		}
		
		for(int item: n) {
			System.out.println(item);
		}
		
		
		
		
	}

}
