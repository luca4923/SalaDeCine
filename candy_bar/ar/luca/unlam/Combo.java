package ar.luca.unlam;

public class Combo {
	
	String nombre;
	Snack snack;
	Bebida bebida;
	double descuento;
	
	public Combo(String nombre, Snack snack, Bebida bebida, double descuento, int i) {
		this.nombre = nombre;
		this.snack = snack;
		this.bebida = bebida;
		this.descuento = descuento;
	}

	public double calcularPrecioFinal() {
		double precioFinal = snack.calcularPrecioFinal() + bebida.calcularPrecioFinal();
		double descuentoFinal = (1 - descuento);
		return (precioFinal * descuentoFinal);
	}
	
	
	

}
