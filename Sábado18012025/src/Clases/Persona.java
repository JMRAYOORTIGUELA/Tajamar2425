package Clases;

public class Persona {
    
	
	private String Nombre;
	private int Edad;
	private String DniNie;
	private String Sexo;
	private double peso;
	private double altura;
	

	public Persona() {}
	
	public Persona(String nombre, int edad,String s) {
		super();
		Nombre = nombre;
		Edad = edad;
		Sexo =comprobarSexo(s);
		String a=ochocifras();
		DniNie=a+letra(a);
	}

	public Persona(String nombre, int edad, String dniNie, String sexo, double peso, double altura) {
		super();
		Nombre = nombre;
		Edad = edad;
		DniNie = dniNie;
		Sexo = comprobarSexo(sexo);
		this.peso = peso;
		this.altura = altura;
	};
	
	private String comprobarSexo(String s) {
	    if (s.compareToIgnoreCase("H")==0 ||s.compareToIgnoreCase("M")==0) return s;
	    return "H";
	}
	
	public int calcularIMC() {
		double c=this.peso/(Math.pow(this.altura,2));
		int n=1;
		
		if (c<20) {
			n=-1;
		}else if (c>=20 && c<=25) {
			n=0;
		}
		
        return n;
	}
	
	public boolean esMayorDeEdad() {
		return this.Edad>18;
	}
	private int alea(int li,int ls) {
		return (int)(Math.random()*(ls-li+1))+li;
	}
	
	private String  ochocifras() {
		String cadena="";
		
		for(int i=1;i<=8;i++) {
		   cadena +=String.valueOf(alea(0,9));
		}		
		return cadena;
	}
	
	private String    letra(String n) {
		String cadena="TRWAGMYFPDXBNJZSQVHLCKE";
		
		int numero;
		
		int v="XYZ".indexOf(n.substring(0,1));
		
		if (v>-1) {
		    
			numero=Integer.valueOf(String.valueOf(v)+n.substring(1));
				
		}else {
			numero=Integer.valueOf(n);
			
		}
		
		int c=numero%23;
		return cadena.substring(c,c+1);
		
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public void setEdad(int edad) {
		Edad = edad;
	}

	public void setSexo(String sexo) {
		Sexo = comprobarSexo(sexo);
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	@Override
	public String toString() {
		return "Persona [Nombre=" + Nombre + ", Edad=" + Edad + ", DniNie=" + DniNie + ", Sexo=" + Sexo + ", peso="
				+ peso + ", altura=" + altura + "]";
	}
	
	

}
