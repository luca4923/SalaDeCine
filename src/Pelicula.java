
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

	

}
