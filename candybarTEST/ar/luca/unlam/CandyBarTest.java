package ar.luca.unlam;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.Before;
import org.junit.jupiter.api.Test;

import ar.unlam.luca.Contenedor;
import ar.unlam.luca.Tamano;

class CandyBarTest {


    private CandyBar candyBar;
    private Snack palomitas;
    private Bebida refresco;

    // Se ejecuta antes de cada test para inicializar el objeto CandyBar
    
    @Before
    public void setUp() {
        
    }

    @Test
    public void testAgregarProducto() {
    	candyBar = new CandyBar(); 
        palomitas = new Snack("Palomitas", 5.0, Tamano.MEDIANO, 10);
        refresco = new Bebida("Refresco", 3.0, Contenedor.VASO, 15);
    	
        assertTrue(candyBar.agregarProducto(palomitas));
        assertEquals(1, contarProductosEnInventario());

        assertTrue(candyBar.agregarProducto(refresco));
        assertEquals(2, contarProductosEnInventario());

    }
    
    @Test
    public void testNoSePuedeAgregarElMismoObjeto() {
    	candyBar = new CandyBar(); 
        palomitas = new Snack("Palomitas", 5.0, Tamano.MEDIANO, 10);
    	
        assertTrue(candyBar.agregarProducto(palomitas));
        assertEquals(1, contarProductosEnInventario());

        assertFalse(candyBar.agregarProducto(palomitas));
        assertEquals(1, contarProductosEnInventario());

    }

    @Test
    public void testEliminarProductoExistente() {
    	candyBar = new CandyBar(); 
        palomitas = new Snack("Palomitas", 5.0, Tamano.MEDIANO, 10);
        refresco = new Bebida("Refresco", 3.0, Contenedor.VASO, 15);
        
        candyBar.agregarProducto(palomitas);
        candyBar.agregarProducto(refresco);

        assertEquals(2, contarProductosEnInventario()); 
        
        candyBar.eliminarProducto(15);
        boolean eliminado = candyBar.eliminarProducto(10);
        
        assertTrue(eliminado);
        assertEquals(0, contarProductosEnInventario());
    }

    @Test
    public void testEliminarProductoNoExistente() {
    	candyBar = new CandyBar(); 

        boolean eliminado = candyBar.eliminarProducto(10);
        assertFalse(eliminado);
        assertEquals(0, contarProductosEnInventario());
    }
    
	private Integer contarProductosEnInventario() {
		return CandyBar.contarProductosEnInventario();
	}
	
	
	  @Test
	    public void testBebidasOrdenadasPorPrecio() {
			 candyBar = new CandyBar();
	    	 Bebida bebida1 = new Bebida("Agua", 100.0, Contenedor.VASO, 2);
	    	 Bebida bebida2 = new Bebida("Agua", 50.0, Contenedor.VASO, 1);
	    	 Bebida bebida3 = new Bebida("Agua", 150.0, Contenedor.VASO, 3);
	    	 
	    	 candyBar.agregarProducto(bebida3);
	    	 candyBar.agregarProducto(bebida1);
	    	 candyBar.agregarProducto(bebida2);
	    	 
	    	
	    	 List <Bebida> ordenada = candyBar.listaDeBebidasOrdenadaPorPrecio();
	    	 
	    	 assertEquals(ordenada.get(2),bebida3); ///150
	    	 assertEquals(ordenada.get(1),bebida1); ///100
	    	 assertEquals(ordenada.get(0),bebida2); ///50
	    }
	  

	  @Test
	    public void testSnackOrdenadasPorPrecio() {
			 candyBar = new CandyBar();
			 Snack palomitas1 = new Snack("Cnana", 5.0, Tamano.MEDIANO, 10);
			 Snack palomitas2 = new Snack("BOLAS", 5.0, Tamano.MEDIANO, 10);
			 Snack palomitas3 = new Snack("AACA", 5.0, Tamano.MEDIANO, 10);
	    	 
			 candyBar.agregarProducto(palomitas3);
			 candyBar.agregarProducto(palomitas2);
	    	 candyBar.agregarProducto(palomitas1);
	    	 
	    	
	    	 List <Snack> ordenada = candyBar.listadoDeSnackOrdenadoPorNombre();
	    	 
	    	 assertEquals(ordenada.get(2),palomitas1); //c
	    	 assertEquals(ordenada.get(1),palomitas2); //B
	    	 assertEquals(ordenada.get(0),palomitas3); //a
	    }
	  

}
