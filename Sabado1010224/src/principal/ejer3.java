package principal;

public class ejer3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

      int mes=4;
      
      
      // 1,3,5,7,8,10,12------->31 dias
      // 2---->depende si es biesto(29) y sino 28
      //4,6,9,11----->30 dias

      if( mes==1 || mes==3 || mes==5|| mes==7||mes==8||mes==10||mes==12       ) {
    	  System.out.println("El mes tiene 31 dias");
      }else if(mes==2) {
    	  System.out.println("Depende si el año es bisiesto");
      }else {
    	  System.out.println("EL mes tiene 30 dias");
      }
      
      System.out.println("Final del programa");
      
	}// fin main

}// fin ejer01