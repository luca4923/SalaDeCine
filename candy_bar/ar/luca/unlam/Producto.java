package ar.luca.unlam;

import java.util.Comparator;
import java.util.Objects;

import ar.unlam.luca.Tamano;

public class Producto implements Comparable<Producto> {

	String nombre;
	Double precio;
	Integer stock;
	
	public Producto(String nombre, Double precio, Integer stock) {
		this.nombre = nombre ;
		this.precio = precio ;
		this.stock = stock ;
	}

	public String getNombre() {
		return nombre;
	}

	public Double getPrecio() {
		return precio;
	}

	@Override
	public int compareTo(Producto o) {
		return this.stock.compareTo(o.stock);
	}

	@Override
	public int hashCode() {
		return Objects.hash(stock);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Producto other = (Producto) obj;
		return Objects.equals(stock, other.stock);
	}
	
	public boolean esSnack() {
		return false;
	}
	
	
	
}
