package topicos.avz;

import static org.junit.Assert.*;

import org.junit.Test;

public class bowling {

	@Test
	public void testPuntos() {
		juego t1=new juego();
		t1.tirar(10,3);
		assertEquals(10, t1.suma);
	}
	@Test
	public void testPleno() {
		juego t1=new juego();
		t1.tirar(10,7);
		assertEquals(true, t1.pleno);
	}
}
