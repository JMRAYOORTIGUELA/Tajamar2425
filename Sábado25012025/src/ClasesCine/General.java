package ClasesCine;

public class General {
	
	public static int alea(int li,int ls) {
		return ((int)(Math.random()*(ls-li+1)))+li;
		
	}
	
	public static double redondear(double n,int d) {
		//10.4567   2
		double p=Math.pow(10, d);  //p=100
		return Math.round(n*p)/p;  // 10.4567*100--->1045.67--->1046/100-->10.46
		
	}
	
}
