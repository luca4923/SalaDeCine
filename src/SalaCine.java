
public class SalaCine {


	Pelicula[] peliculas;
	Butaca[][] Butacas;

	public SalaCine(int filas, int columnas) {
		Butacas = new Butaca[filas][columnas];
		peliculas = new Pelicula[10];
	}

	public void llenarButacas() {
		for (int i = 0; i < Butacas.length; i++) {
			for (int j = 0; j < Butacas[i].length; j++) {
				Butacas[i][j] = new Butaca();
			}
		}
	}

	public boolean agregar_pelicula(Pelicula pelicula) {
		for (int i = 0; i < peliculas.length; i++) {
			if (peliculas[i] == null) {
				peliculas[i] = pelicula;
				return true;
			}
		}
		return false;
	}

	public Pelicula getpelicula() {
		for (int i = 0; i < peliculas.length; i++) {
			if (peliculas[i] != null) {
				return peliculas[i];
			}
		}
		return null;
	}

	public boolean ocupar_butaca(int fila, int columna, String nombre, int edad) {
		if (edad < peliculas[0].getEdad_minima()) {
			return false;
		}

		return Butacas[fila][columna].ocupar_Butaca(nombre);
	}

	public Butaca getButaca(int fila, int columna) {
		return Butacas[fila][columna];
	}

	public String grafica_De_Butacas() {

		for (int i = 0; i < Butacas.length; i++) {
			for (int j = 0; j < Butacas[i].length; j++) {
				// Butacas[i][j].;

			}
		}
		return null;
	}


}
