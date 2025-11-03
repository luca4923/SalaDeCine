package ar.luca.unlam1;

public class Butaca {

	private Boolean ocupada;
	private String nombre_del_ocupante;

	public Butaca(String nombre) {
		nombre_del_ocupante =  nombre;
		ocupada = false;
	}

	public boolean ocupar_Butaca(String nombre) {
		if(ocupada == false) {
			nombre_del_ocupante = nombre;
			ocupada = true;
			return ocupada;
		}
		return false;
	}
	

	@Override
	public String toString() {
		return "Butaca [ocupada=" + ocupada + "]";
	}

	public void liberarButaca() {
		nombre_del_ocupante = null;
		ocupada = false ;
		
	}
	
	
}
