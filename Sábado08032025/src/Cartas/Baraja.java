package Cartas;

import Biblioteca.General;

public class Baraja {
   private Carta cartas[];
   private int siguienteCarta;
   
   public Baraja() {
	   cartas=new Carta[40];
	   siguienteCarta=0;
	   crearBaraja();
	   barajar();
   }
   private void crearBaraja() {
	   int k=0;
	   for(Palos p:  Palos.values()) {
		   for(Numeracion n :Numeracion.values()) {
			cartas[k++]=new Carta(n,p);   
		   }
	   }
   }
   private void barajar() {
	   int nc1,nc2;
	   Carta aux;
	   for(int i=1;i<=1000;i++) {
		   do {
			   nc1=General.alea(0, cartas.length-1);
			   nc2=General.alea(0, cartas.length-1);
		   }while(nc1==nc2);
		   
		   aux=cartas[nc1];
		   cartas[nc1]=cartas[nc2];
		   cartas[nc2]=aux;
	   }
   }
   /*
    * devuelve la siguiente carta que está en la baraja, 
    * cuando no haya más o se haya llegado al final, se indica 
    * al usuario que no hay más cartas.
    */
   public Carta msiguienteCarta() {
	   
	   if (siguienteCarta==cartas.length) {
		   System.out.println("Ya no hay mas cartas");
		   return null;
	   }	
		   return cartas[siguienteCarta++];
   }
   //indica el número de cartas que aún puede repartir
   public int cartasDisponibles() {  return cartas.length-siguienteCarta;  }
   
   /*
    *   dado   un   número   de   cartas   que   nos   pidan,   
    *   le devolveremos ese número de cartas (piensa que puedes devolver). 
    *   En caso de que haya menos cartas que las pedidas, no devolveremos 
    *   nada pero debemos indicárselo al usuario.
    */
   public Carta[] darCartas(int n) {
	   if (n>cartasDisponibles()) {
		   System.out.println("No tengo suficientes cartas");
		   return null;
	   }
	   Carta matriz[]=new Carta[n];
	   for(int i=0;i<matriz.length;i++) {
		   matriz[i]=msiguienteCarta();
	   }
	   return matriz;
   }


   /*cartasMonton: mostramos aquellas cartas que ya han salido, 
    * si no ha salido ninguna indicárselo al usuario
    */
   
   public void cartasMonton() {
	   if (siguienteCarta==0) {
		   System.out.println("No ha salido ninguna carta");
		   return; 
	   }
	   for(int i=0;i<=siguienteCarta-1;i++) System.out.println( cartas[i]);
   }
   /*
    * mostrarBaraja: muestra todas las cartas hasta el final. 
    * Es decir, si se saca una carta y luego se llama al método, 
    * este no mostrara esa primera carta.
    */
   public void mostrarBaraja() {
	   if (siguienteCarta==cartas.length) {
		   System.out.println("Ninguna carta");
            return;
	   }

	   for(int i=siguienteCarta;i<cartas.length;i++) 
		   System.out.println( cartas[i]);
	   

	   
   }
   
   
   

}
