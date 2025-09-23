package ar.luca.unlam1;

public class PeliculaInfantil extends Pelicula {

	public PeliculaInfantil(String titulo, int duracion, int edad_minima) {
		super(titulo, duracion, edad_minima);
		// TODO Auto-generated constructor stub
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
		// TODO Auto-generated method stub
		return null;
	}

	

}
