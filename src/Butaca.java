
public class Butaca {

	Boolean ocupada;
	String nombre_del_ocupante;

	public Butaca() {
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
	
	public boolean estadoDeLaButaca() {
		return ocupada;
	}

	@Override
	public String toString() {
		return "Butaca [ocupada=" + ocupada + "]";
	}

	public void liberarButaca() {
		nombre_del_ocupante = "";
		ocupada = false ;
		
	}
	
	
}
