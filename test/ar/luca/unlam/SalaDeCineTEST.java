package ar.luca.unlam;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.luca.unlam1.SalaCine;
import ar.luca.unlam1.Butaca;
import ar.luca.unlam1.Pelicula;
import ar.luca.unlam1.PeliculaAccion;
import ar.luca.unlam1.PeliculaComedia;
import ar.luca.unlam1.PeliculaDrama;
import ar.luca.unlam1.PeliculaInfantil;
import ar.luca.unlam1.PeliculaTerror;

class SalaDeCineTEST {

	
	@BeforeEach
	void antes() {
		
	}

	@Test
	void crearSala() {
		
		Pelicula peli1 = new PeliculaComedia("muchachos de barrio", 100, 16);
		Pelicula peli2 = new PeliculaComedia("muchachos de barrio", 100, 16);
		SalaCine sala = new SalaCine(2, 2);
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
		Pelicula peli1 = new PeliculaTerror("muchachos de barrio", 100, 16);
		sala.agregar_pelicula(peli1);

		assertFalse(sala.venderBoleto(1, 1, "luca", 15));
	}
	
	@Test
	void vaciarAsientoVendido() {
		SalaCine sala = new SalaCine(2, 2);
		Pelicula peli1 = new PeliculaInfantil("muchachos de barrio", 100, 10);
		sala.agregar_pelicula(peli1);

		sala.venderBoleto(1, 1, "luca", 15);
		assertTrue(sala.liberarAsiento(1, 1));
		
		
		
		
	}
	
	@Test
	void vaciarTodosLosAsientoVendido() {
		SalaCine sala = new SalaCine(2, 2);
		Pelicula peli1 = new PeliculaDrama("muchachos de barrio", 100, 10);
		sala.agregar_pelicula(peli1);

		sala.venderBoleto(1, 1, "luca", 15);
		sala.venderBoleto(0, 0, "jorge", 75);
		
		sala.reiniciarSala();
		
		assertEquals(Integer.valueOf(0),sala.contarAsientosOcupados());
	}
	
	
	@Test
	void contarAsientosOcupados() {
		SalaCine sala = new SalaCine(2, 2);
		Pelicula peli1 = new PeliculaAccion("muchachos de barrio", 100, 10);
		sala.agregar_pelicula(peli1);

		sala.venderBoleto(1, 1, "luca", 15);
		sala.venderBoleto(0, 0, "jorge", 75);
		sala.venderBoleto(1, 0, "rober", 15);
		sala.venderBoleto(0, 1, "manuel", 75);
		
		
		assertEquals(Integer.valueOf(4),sala.contarAsientosOcupados());
	}
	
	@Test
	void TestGeters() {
		SalaCine sala = new SalaCine(2, 2);
		Pelicula peli1 = new PeliculaComedia("muchachos de barrio", 100, 10);
		sala.agregar_pelicula(peli1);

		assertEquals(100,sala.getpelicula().getDuracion());
		assertEquals(10,sala.getpelicula().getEdad_minima());
		assertEquals("muchachos de barrio",sala.getpelicula().getTitulo());
	}
	
	@Test
	void TestPeliculaEquals() {
		SalaCine sala = new SalaCine(2, 2);
		Pelicula peli1 = new PeliculaComedia("muchachos de barrio", 100, 10);
		Pelicula peli2 = new PeliculaComedia("muchachos de barrio", 100, 10);
		sala.agregar_pelicula(peli1);

		assertEquals(peli2,sala.getpelicula());
		
	}
	
	@Test
    public void testGetMatriz() {
	
	}
	
	
	
	
	
	
	
	
	
	
	

}
