package ar.luca.unlam;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class bebidasOrdenadasPorPrecioBase implements Comparator<Bebida> {
	
	Set <Bebida> BebidasOrdenadasPorPrecioBase = new TreeSet <Bebida>();

	@Override
	public int compare(Bebida o1, Bebida o2) {
		return  o1.getPrecio().compareTo(o2.getPrecio());
	}

	
	
}
