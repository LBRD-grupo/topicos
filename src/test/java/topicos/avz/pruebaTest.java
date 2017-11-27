package topicos.avz;

import static org.junit.Assert.*;

import org.junit.Test;

public class pruebaTest {

	@Test
	public void test() {
		calculadora var = new calculadora();
		int result = var.suma(2,3);
		assertEquals(5, result);
	}

}
