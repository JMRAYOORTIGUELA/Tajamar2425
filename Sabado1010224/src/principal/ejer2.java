package principal;

public class ejer2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

      int nota=5;
      
      /*
      nota<5 -----suspenso
      nota>=5 y nota<6 -------->aprobado
      nota>=6 y nota<7 -------->Bien
      nota>=7 y nota<9 -------->Notable
      nota>=9 y nota<=10 -------->sobresaliente
      */
      
      
      if(nota<5) {
    	  System.out.println("suspenso");
      }else if(nota<6 ) {
    	  System.out.println("Aprobado");
      }else if( nota<7) {
    	  System.out.println("Bien");
      }else if( nota<9) {
    	  System.out.println("Notable");
      }else {
    	  System.out.println("Sobresaliente");
      }
      
      System.out.println("Final");
      

	}// fin main

}// fin ejer01