package JuegoRuletaRusa;

public class Jugador {
   private static int siguienteId=1;	
	
   private int id;
   private String nombre;
   private boolean vivo;
   
   public Jugador() {
	   this.id=this.siguienteId++;
	   this.nombre="Jugador "+this.id;
	   this.vivo=true;
   }
   public void disparar(Revolver r) {
	   if (r.disparar()) {
		   this.vivo=false;
		   System.out.println("Jugador "+this.nombre+" muerto.");
	   }else {
		   System.out.println("Jugador "+this.nombre+" se ha librado.");
	   }
   }
public boolean isVivo() {
	return vivo;
}

   
}
