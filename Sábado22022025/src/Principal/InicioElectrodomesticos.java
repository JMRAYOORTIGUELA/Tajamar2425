package Principal;

import ClasesElectrodomestico.*;


public class InicioElectrodomesticos {

	public static void imprimir(electrodomestico ma[]) {
		
		for (electrodomestico item : ma) {
		    System.out.println(item.precioFinal());	
		}
	}
	
	public static void totales(electrodomestico ma[]) {
		double sumalavadoras=0,sumatelevisiones=0,sumaeletrodomesticos=0;
		for (electrodomestico item : ma) {
		    
			if (item instanceof lavadora) {
				sumalavadoras += item.precioFinal(); 
			}else if(item instanceof television) {
				sumatelevisiones += item.precioFinal();
			}

			sumaeletrodomesticos += item.precioFinal();

			
		}
		System.out.println("la suma total de las lavadoras ="+sumalavadoras);
		System.out.println("la suma total de las televisiones ="+sumatelevisiones);
		System.out.println("la suma total de las lavadoras ="+sumaeletrodomesticos);
	}
	
	public static void main(String[] args) {

     electrodomestico matriz[]=new electrodomestico[10];
     
     matriz[0]=new lavadora(100, 30);
     matriz[1]=new television(100, 30);
     matriz[2]=new television(100, 30);
     matriz[3]=new television(100, 30);
     matriz[4]=new television(100, 30);
     matriz[5]=new television(100, 30);
     matriz[6]=new television(100, 30);
     matriz[7]=new television(100, 30);
     matriz[8]=new television(100, 30);
     matriz[9]=new television(100, 30);

     imprimir(matriz);
     totales(matriz);
     
	}

}
