package Clases;

public class Cuadrado {
   private double lado=12.50;
   
   public Cuadrado() {}
   
   public Cuadrado(double la) {
	   this.lado=la;
   }
   
   public void ModificarLado(double la) {
	   this.lado=la;
   }
   public double ObtenerLado() { return this.lado; }
   
   public double perimetro() { return 4*this.lado; }
   
   public double area() { return Math.pow(this.lado,2);
   
   
   }
@Override
public String toString() {
	return "Cuadrado [lado=" + lado + "] ";
}


}
