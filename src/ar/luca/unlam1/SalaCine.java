package ar.luca.unlam1;

public class SalaCine {

	Pelicula peliculas = null;
	Butaca[][] Butacas;

	public SalaCine(int filas, int columnas) {
		Butacas = new Butaca[filas][columnas];

		for (int i = 0; i < Butacas.length; i++) {
			for (int j = 0; j < Butacas[i].length; j++) {
				Butacas[i][j] = new Butaca();
			}
		}
	}

	public boolean agregar_pelicula(Pelicula pelicula) {
		if(peliculas == null) {
			peliculas = pelicula;
			return true;
		}
		
		return false;
	}

	public Pelicula getpelicula() {
		if (peliculas != null) {
			return peliculas;
		}
		return null;
	}

	public boolean venderBoleto(int fila, int columna, String nombre, int edad) {
		if (edad < peliculas.getEdad_minima()) {
			return false;
		} 
		if(Butacas[fila][columna].estadoDeLaButaca()) {
			return false;
		}

		return Butacas[fila][columna].ocupar_Butaca(nombre);
	}

	public Butaca getButaca(int fila, int columna) {
		return Butacas[fila][columna];
	}

	public String mostrarButacas() {
		String grafico = "";

		for (int i = 0; i < Butacas.length; i++) {
			for (int j = 0; j < Butacas[i].length; j++) {

				grafico += i + "X" + j + Butacas[i][j].toString() + '\n';

			}
		}
		return grafico;
	}

	////// HACER!!!!
	public boolean cambiarPelicula(Pelicula peliculaSeleccionada) {
		if(peliculas != null) {
			peliculas = peliculaSeleccionada; 
			return true;
		}
		return false;
	}

	public boolean liberarAsiento(int fila, int columna) {
		for (int i = 0; i < Butacas.length; i++) {
			for (int j = 0; j < Butacas[i].length; j++) {
				if (Butacas[i][j].estadoDeLaButaca() == false) {
					Butacas[i][j].liberarButaca();
					return true;
				}
			}
		}
		return false;
	}

	public void reiniciarSala() {
		for (int i = 0; i < Butacas.length; i++) {
			for (int j = 0; j < Butacas[i].length; j++) {
				Butacas[i][j].liberarButaca();
			}
		}

	}

}
