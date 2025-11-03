package ar.luca.unlam1;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;



public class SalaCine {

	Pelicula peliculas;
	Map <String,Butaca> Butacas ;

	public SalaCine(int filas, int columnas) {
		Butacas = new HashMap<String,Butaca>();
	
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
		String nmrButaca = "" ;
		nmrButaca += fila ;
		nmrButaca += columna ;
		
		if(edad < peliculas.getEdad_minima()) {
			return false;
		}
		
		Butaca butaca = new Butaca(nombre);
		
		if(Butacas.get(nmrButaca) != null) {
			return false;
		} else {
			Butacas.put(nmrButaca, butaca);
			return true;
		}
	}

	public Butaca getButaca(int fila, int columna) {
		String nmrButaca = "" ;
		nmrButaca += fila ;
		nmrButaca += columna ;
		return Butacas.get(nmrButaca);
	}
	
	public List<Butaca> getButacas() {
		List <Butaca>Lista = new LinkedList<>(Butacas.values());
		return Lista;
	}

	public String mostrarButacas() {
		String grafico = "";
		
		List <Butaca>Lista = new LinkedList<>(Butacas.values());
		for(Butaca l : Lista) {
			grafico = grafico + l.toString() + "\n";
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
	
	public Integer contarAsientosOcupados() {
		Integer contador = Butacas.size();
		return contador;
	}

	public Boolean liberarAsiento(int fila, int columna) {
		String nmrButaca = "" ;
		nmrButaca += fila ;
		nmrButaca += columna ; 
		
		if(Butacas.containsKey(nmrButaca)) {
			Butacas.remove(nmrButaca);
			return true;
		}
		return false;	
	}

	public void reiniciarSala() {
		Butacas.clear();
	}
	
	
	
	

}
