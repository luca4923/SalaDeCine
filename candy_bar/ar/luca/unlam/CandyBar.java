package ar.luca.unlam;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import ar.unlam.luca.ProductoDuplicadoException;
import ar.unlam.luca.ProductoNoEncontradoException;

public class CandyBar {

	static Set<Producto> productos;
	List<Snack> listaOrdenandaSnack;
	List<Bebida> listaOrdenandaBebidas;

	public CandyBar() {
		productos = new TreeSet<Producto>();
		listaOrdenandaSnack = new ArrayList<Snack>();
		listaOrdenandaBebidas = new ArrayList<Bebida>();
	}

	public Boolean agregarProducto(Producto producto) throws ProductoDuplicadoException {

		if (productos.contains(producto)) {
			throw new ProductoDuplicadoException("La edad no puede ser negativa");
		}

		if (producto.esSnack()) {
			listaOrdenandaSnack.add((Snack) producto);
		}
		return productos.add(producto);
	}

	public static int contarProductosEnInventario() {
		return productos.size();
	}

	public boolean eliminarProducto(Integer stock) throws ProductoNoEncontradoException {

		if (!productos.remove(new Producto("stock", 0.0, stock))) {
			throw new ProductoNoEncontradoException("el producto que se quiere eliminar no existe");
		}

		productos.remove(new Producto("stock", 0.0, stock));
		return true;
	}

	// String nombre, Double precio, Integer stock

	public Producto[] obtenerInventario() {
		return productos.toArray(new Producto[0]);
	}

	public List<Bebida> listaDeBebidasOrdenadaPorPrecio() {
		for (Producto p : productos) {
			if (p instanceof Bebida) {
				listaOrdenandaBebidas.add((Bebida) p);
			}
		}
		listaOrdenandaBebidas.sort(new bebidasOrdenadasPorPrecioBase());
		return listaOrdenandaBebidas;
	}

	public List<Snack> listadoDeSnackOrdenadoPorNombre() {
		listaOrdenandaSnack.sort(new snackOrdenadasPorPrecioBase());
		return listaOrdenandaSnack;
	}

}
