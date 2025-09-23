package ar.luca.unlam1;

public class SalaCine {

	Pelicula peliculas;
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
		if (peliculas == null) {
			peliculas = pelicula;
			return true;
		}

		return false;
	}

	public Pelicula getpelicula() {
			return peliculas;

	}

	public boolean venderBoleto(int fila, int columna, String nombre, int edad) {
		if (edad < peliculas.getEdad_minima()) {
			return false;
		}
		if (Butacas[fila][columna].estadoDeLaButaca()) {
			return false;
		}

		return Butacas[fila][columna].ocupar_Butaca(nombre);
	}

	public Butaca getButaca(int fila, int columna) {
		return Butacas[fila][columna];
	}
	
	public Butaca[][] getButacas() {
		return Butacas;
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

	public boolean cambiarPelicula(Pelicula peliculaSeleccionada) {
		if(peliculaSeleccionada != null) {
			peliculas = peliculaSeleccionada;
			return true;
		}
		return false;
	}
	
	public int contarAsientosOcupados() {
		int contador = 0;
		for (int i = 0; i < Butacas.length; i++) {
			for (int j = 0; j < Butacas[i].length; j++) {
				if(this.Butacas[i][j].estadoDeLaButaca())
					contador++;
				
			}
		}
		return contador;
	}

	public boolean liberarAsiento(int fila, int columna) {
		if(Butacas[fila][columna] != null) {
					Butacas[fila][columna].liberarButaca();
					return true;
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
