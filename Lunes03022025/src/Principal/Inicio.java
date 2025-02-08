package Principal;

import java.util.ArrayList;

import Clases.*;

public class Inicio {
	
	
	public static void contar(ArrayList<FigurasGeometricas> li) {
	
		String fg[]= {"Cuadrados","Rectangulos","Circulos","Cubos"};
		int cfg[]= {0,0,0,0};
		for(FigurasGeometricas item  :li) {
			
			if (item instanceof Cubo) {
			    cfg[3]++;  //cfg[3]=cfg[3]+1     cfg[3] +=1
			}else if(item instanceof Cuadrado){
				cfg[0]++;
			}else if(item instanceof Rectangulo){
				cfg[1]++;
			}else if (item instanceof Circulo){
				cfg[2]++;
			}
		}
   
		for(int i=0;i<fg.length;i++) {
			System.out.println(fg[i]+" "+cfg[i]);
		}
	}
	
	public static void imprimir(ArrayList<FigurasGeometricas> li) {
		
		for(FigurasGeometricas item  :li) {
			System.out.println(item+" "+item.perimetro()+" "+item.area());
			
			if (item instanceof Cubo) {
				System.out.println("volumen="+(((Cubo) item).volumen()));
			}
			
		}
	}

	public static void main(String[] args) {
		ArrayList<FigurasGeometricas> lista=new ArrayList<>();
		
		lista.add(new Cuadrado(10));
		lista.add(new Cuadrado(10));
		lista.add(new Cuadrado(10));
		lista.add(new Cuadrado(10));
		lista.add(new Rectangulo(33,10));
		lista.add(new Rectangulo(33,10));
		lista.add(new Cubo(10));
		lista.add(new Cubo(10));
		lista.add(new Circulo(5));
		lista.add(new Circulo(5));
		lista.add(new Circulo(5));
		
		imprimir(lista);
		contar(lista);

	}

}
