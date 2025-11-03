package ar.luca.unlam;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class CandyBar {

	static Set<Producto> productos;
	List<Snack> listaOrdenandaSnack ;
	List<Bebida> listaOrdenandaBebidas ;
	
	
	public CandyBar() {
		productos = new TreeSet<Producto>();
		listaOrdenandaSnack = new ArrayList<Snack>(); 
		listaOrdenandaBebidas = new ArrayList<Bebida>();
	}

	
	public Boolean agregarProducto(Producto producto) {
		if(producto.esSnack()) {
			listaOrdenandaSnack.add((Snack) producto);
		}
		return productos.add(producto);
	}

	public static int contarProductosEnInventario() {
		return productos.size();
	}

	public boolean eliminarProducto(Integer stock) {
		return productos.remove(new Producto("stock",0.0,stock));
	}

	//String nombre, Double precio, Integer stock
	
	public Producto[] obtenerInventario() {
		return productos.toArray(new Producto[0]);
	}
	
	public List<Bebida> listaDeBebidasOrdenadaPorPrecio() {
		for(Producto p : productos) {
			if(p instanceof Bebida) {
				listaOrdenandaBebidas.add((Bebida) p);
			}
		}
		listaOrdenandaBebidas.sort(new bebidasOrdenadasPorPrecioBase());
		return listaOrdenandaBebidas;
	}
	
	
	public List<Snack> listadoDeSnackOrdenadoPorNombre(){
		 listaOrdenandaSnack.sort(new snackOrdenadasPorPrecioBase());
		 return listaOrdenandaSnack;
	}
	
	
	
	
}
