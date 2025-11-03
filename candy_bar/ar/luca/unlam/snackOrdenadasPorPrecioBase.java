package ar.luca.unlam;

import java.util.Comparator;

public class snackOrdenadasPorPrecioBase implements Comparator<Snack> {

	@Override
	public int compare(Snack o1, Snack o2) {
		return o1.getNombre().compareTo(o2.getNombre());
	}

}
