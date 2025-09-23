package ar.luca.unlam1;

public class PeliculaAccion extends Pelicula {

	String descripcion = "";

	public PeliculaAccion(String titulo, int duracion, int edad_minima) {
		super(titulo, duracion, edad_minima);
		
	}

	@Override
	public String get_sinopsis() {
		String sinopsis = "Sinopsis de pelicula de accion"+ '\n';
		sinopsis += "Titulo: " + super.getTitulo() + '\n';
		sinopsis += "Duración en minutos: " + super.getDuracion() + '\n';
		sinopsis += "Edad Minima: " + super.getEdadMinima()  + '\n';
		sinopsis += "Las peliculas de accion se caracterizan por tener un alto grado de violancia, explosibos impresionantes y heroes que salvan al mundo.";
		return sinopsis;
		
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
