package ar.luca.unlam;

import java.util.Objects;

import ar.unlam.luca.Tamano;

public class Snack extends Producto {

	private Tamano tamano; // ahora es Tamano
	String nombre;

	public Snack(String nombre, double precio, Tamano tamano, int stock) {
		super(nombre, precio, stock);
		this.nombre = nombre;
		this.tamano = tamano;
	}

	public double calcularPrecioFinal() {
		return precio * tamano.getValor();
	}
	@Override
	public boolean esSnack() {
		return true;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(nombre);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Snack other = (Snack) obj;
		return Objects.equals(nombre, other.nombre);
	}
	
	
}
