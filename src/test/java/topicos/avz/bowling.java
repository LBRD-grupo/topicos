package topicos.avz;

import static org.junit.Assert.*;

import org.junit.Test;

public class bowling {

	@Test
	public void test() {
		juego var1=new juego();
		var1.tirar(10,3);
		assertEquals(10, var1.suma);
	}

}
