package Clases;

import java.time.LocalDate;

public class Libro {
	private String Isbn;
	private String Titulo;
	private String Autor;
	private int AñoPublicacion;
	
	public Libro(String isbn, String titulo, String autor, int añoPublicacion) {
		super();
		Isbn = isbn;
		Titulo = titulo;
		Autor = autor;
		AñoPublicacion = añoPublicacion;
	}

	public Libro(String isbn, String titulo, String autor) {
		super();
		Isbn = isbn;
		Titulo = titulo;
		Autor = autor;
		AñoPublicacion = LocalDate.now().getYear();
	}

	public String getIsbn() {
		return Isbn;
	}

	public void setIsbn(String isbn) {
		Isbn = isbn;
	}

	public String getTitulo() {
		return Titulo;
	}

	public void setTitulo(String titulo) {
		Titulo = titulo;
	}

	public String getAutor() {
		return Autor;
	}

	public void setAutor(String autor) {
		Autor = autor;
	}

	public int getAñoPublicacion() {
		return AñoPublicacion;
	}

	public void setAñoPublicacion(int añoPublicacion) {
		AñoPublicacion = añoPublicacion;
	}

	@Override
	public String toString() {
		return "Libro [Isbn=" + Isbn + ", Titulo=" + Titulo + ", Autor=" + Autor + ", AñoPublicacion=" + AñoPublicacion
				+ "]";
	}

	
	
}
