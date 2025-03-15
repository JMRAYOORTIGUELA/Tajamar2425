package JuegoRuletaRusa;

public class Revolver {
  private int posicionActual;
  private int posicionBala;
  
  public Revolver() {
	  posicionActual=Biblioteca.General.alea(1, 6);
	  posicionBala=Biblioteca.General.alea(1, 6);
  }
  public boolean disparar() {
	  boolean coinciden=this.posicionActual==this.posicionBala ? true :false;
	  
	  siguienteBala();
	  
	  return coinciden;
  }
  private void siguienteBala() {
	  this.posicionActual= this.posicionActual==6 ? 1 :++this.posicionActual;  
  }
@Override
public String toString() {
	return "Revolver [posicionActual=" + posicionActual + ", posicionBala=" + posicionBala + "]";
}
  
}
