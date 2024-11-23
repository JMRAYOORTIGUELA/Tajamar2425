package Principal;

public class Ejer01HojaMatrices {

	public static void imprimir(int m[][]) {
		for(int i=0;i<m.length;i++) {
			for(int j=0;j<m[i].length;j++) {
				System.out.printf("%3d",m[i][j]);
			}
			System.out.println();
			
		}
		
		
	}
	
	public static void main(String[] args) {
		int num[][]=new int[3][6];
		num[0][1]=30;
		num[0][2]=2;
		num[0][5]=5;
		
		num[1][0]=75;
		
		num[2][2]=-2;
		num[2][3]=9;
		num[2][5]=11;
		imprimir(num);

	}

}
