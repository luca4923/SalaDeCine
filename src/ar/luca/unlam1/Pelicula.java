package ar.luca.unlam1;

import java.util.Objects;

public abstract class Pelicula {


	String titulo;
	int duracion;
	int edad_minima;
	
	public Pelicula(String titulo,int duracion,int edad_minima) {
		this.titulo = titulo;
		this.duracion = duracion;
		this.edad_minima = edad_minima;
	}
	
	
	
	public int getEdad_minima() {
		return edad_minima;
	}



	public abstract String get_sinopsis();
	
	public abstract String get_descripcion();



	protected String getTitulo() {
		return titulo;
	}


	protected int getEdadMinima() {
		return edad_minima;
	}



	@Override
	public int hashCode() {
		return Objects.hash(duracion, edad_minima, titulo);
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pelicula other = (Pelicula) obj;
		return duracion == other.duracion && edad_minima == other.edad_minima && Objects.equals(titulo, other.titulo);
	}
	

	
	
}
