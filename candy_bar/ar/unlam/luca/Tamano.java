package ar.unlam.luca;

public enum Tamano {

	    PEQUENO(0.85),
	    MEDIANO(1.0),
	    GRANDE(1.20);

	    private final double valor; // atributo numérico

	    // Constructor del enum
	    Tamano(double valor) {
	        this.valor = valor;
	    }

	    // Getter para obtener el valor numérico
	    public double getValor() {
	        return valor;
	    }
	
}
