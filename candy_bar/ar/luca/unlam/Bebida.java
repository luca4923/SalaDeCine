package ar.luca.unlam;

import ar.unlam.luca.Contenedor;
import ar.unlam.luca.Tamano;

public class Bebida extends Producto  {
	
	Contenedor contenedor;

	public Bebida(String nombre, double d, Contenedor contenedor, int i) {
		super(nombre, d, i);
		this.contenedor = contenedor;
	}

	public double calcularPrecioFinal() {
		return precio * contenedor.getValor();
	}

	


}
