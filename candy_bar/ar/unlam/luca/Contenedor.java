package ar.unlam.luca;

public enum Contenedor {

	VASO(1.0),BOTELLA(1.10);

	private final double valor;

	Contenedor(Double valor) {
		 this.valor = valor;
	}

	public double getValor() {
        return valor;
    }

	
}
