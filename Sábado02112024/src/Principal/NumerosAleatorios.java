package Principal;

public class NumerosAleatorios {

	public static int alea(int li, int ls) {
		// li limiteInferior ls limiteSuperior

		return (int) (Math.random() * (ls - li + 1)) + li;
	}

	public static void main(String[] args) {
		// cuantos han suspendido nota<5
		// cuanto han aprobado nota>=5 y nota<6
		// cuanto han bien nota>=6 y nota<7
		// cuanto han Notable nota>=7 y nota<9
		// cuanto han sobresaliente nota>=9 y nota<=10
		int suspensos = 0, aprobados = 0, bienes = 0, notables = 0, sobresalientes = 0;
		int nota,suma=0;

		for (int i = 1; i <= 10; i++) {
			nota = alea(0, 10); // [0,1)
			System.out.println(nota);
            suma +=nota;
            
			if (nota < 5) {
				suspensos++;
			} else if ( nota < 6) {
				aprobados++;
			} else if ( nota < 7) {
				bienes++;
			} else if ( nota < 9) {
				notables++;
			} else if ( nota <= 10)
				sobresalientes++;
		    }

		System.out.printf("suspensos=%d aprobados=%d bienes=%d notables=%d sobresalientes=%d\n",
				           suspensos,aprobados,bienes,notables,sobresalientes);
	    
		System.out.printf("La media aritmética=%.2f", (double)suma/10);
		
		
		
	}

}
