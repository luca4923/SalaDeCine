package ar.luca.unlam1;

public class PeliculaAccion extends Pelicula {

	String descripcion = "";

	public PeliculaAccion(String titulo, int duracion, int edad_minima) {
		super(titulo, duracion, edad_minima);
		
	}

	@Override
	public String get_sinopsis() {
		return "Una pareja que cree tener la vida bajo control descubre que convivir trae caos, enredos y visitas inesperadas, pero también muchas risas.";
	}

	@Override
	public String get_descripcion() {
		descripcion += "Titulo: " + titulo + '\n';
		descripcion += "Duracion: " + duracion + '\n';
		descripcion += "Edad minima: " + edad_minima + '\n';
		descripcion += "Genero: Accion";

		return descripcion;
	}

}
