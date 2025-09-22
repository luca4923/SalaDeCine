package ar.luca.unlam1;

public class SalaCine {

	Pelicula[] peliculas;
	Butaca[][] Butacas;

	public SalaCine(int filas, int columnas) {
		Butacas = new Butaca[filas][columnas];
		peliculas = new Pelicula[100];
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

	public boolean venderBoleto(int fila, int columna, String nombre, int edad) {
		if (edad < peliculas[0].getEdad_minima()) {
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
				
				grafico += i + "X" + j + Butacas[i][j].toString()+ '\n' ;

			}
		}
		return grafico;
	}

	////// HACER!!!!
	public void cambiarPelicula(Pelicula peliculaSeleccionada) {

	}

	public boolean liberarAsiento(int fila, int columna) {
		for (int i = 0; i < Butacas.length; i++) {
			for (int j = 0; j < Butacas[i].length; j++) {
				if(Butacas[i][j].estadoDeLaButaca() == false) {
					Butacas[i][j].liberarButaca();
					return true;
				}
			}
		}
		return false;
	}

	public void reiniciarSala() {
		for(int i = 0; i<Butacas.length;i++) {
			for(int j = 0;j<Butacas[i].length;j++) {
				Butacas[i][j].liberarButaca();
			}
		}
		
	}

}
