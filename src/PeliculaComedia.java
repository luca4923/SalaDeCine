
public class PeliculaComedia extends Pelicula {
	
	String descripcion;

	public PeliculaComedia(String titulo, int duracion, int edad_minima) {
		super(titulo, duracion, edad_minima);
	}

	@Override
	public String get_sinopsis() {
		return null;
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
