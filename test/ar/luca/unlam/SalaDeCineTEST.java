package ar.luca.unlam;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.luca.unlam1.SalaCine;
import ar.luca.unlam1.Pelicula;
import ar.luca.unlam1.PeliculaComedia;

class SalaDeCineTEST {

	@BeforeEach
	void antes() {

	}

	@Test
	void crearSala() {
		SalaCine sala = new SalaCine(2, 2);
		Pelicula peli1 = new PeliculaComedia("muchachos de barrio", 100, 16);
		Pelicula peli2 = new PeliculaComedia("muchachos de barrio", 100, 16);

		assertTrue(sala.agregar_pelicula(peli1));
		assertFalse(sala.agregar_pelicula(peli1));
		assertTrue(sala.cambiarPelicula(peli2));

	}

	@Test
	void cambiarPelicula() {
		SalaCine sala = new SalaCine(2, 2);
		Pelicula peli1 = new PeliculaComedia("muchachos de barrio", 100, 16);
		Pelicula peli2 = new PeliculaComedia("TED", 160, 18);

		assertTrue(sala.agregar_pelicula(peli1));
		assertTrue(sala.cambiarPelicula(peli2));
		assertEquals(sala.getpelicula(), peli2);
	}

	@Test
	void compraDeTikets() {
		SalaCine sala = new SalaCine(2, 2);
		Pelicula peli1 = new PeliculaComedia("muchachos de barrio", 100, 16);
		sala.agregar_pelicula(peli1);

		assertTrue(sala.venderBoleto(1, 1, "luca", 22));
	}

	@Test
	void noSePuedeCoprarEnElMismoAsiento() {
		SalaCine sala = new SalaCine(2, 2);
		Pelicula peli1 = new PeliculaComedia("muchachos de barrio", 100, 16);
		sala.agregar_pelicula(peli1);

		assertTrue(sala.venderBoleto(1, 1, "luca", 22));
		assertFalse(sala.venderBoleto(1, 1, "luca", 22));
	}
	
	@Test
	void noEntraPorEdad() {
		SalaCine sala = new SalaCine(2, 2);
		Pelicula peli1 = new PeliculaComedia("muchachos de barrio", 100, 16);
		sala.agregar_pelicula(peli1);

		assertFalse(sala.venderBoleto(1, 1, "luca", 15));
	}
	
	

}
