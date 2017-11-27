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
	@Test
	public void testSumaPleno() {
		juego t1=new juego();
		t1.tirar(10,7);
		assertEquals(10, t1.contabilizarPleno());
	}
	@Test
	public void testContabilizarFrames() {
		juego t1=new juego();
		t1.tirar(1,1);
		juego t2=new juego();
		t2.tirar(1,1);
		juego t3=new juego();
		t3.tirar(1,1);
		juego t4=new juego();
		t4.tirar(1,1);
		juego t5=new juego();
		t5.tirar(1,1);
		juego t6=new juego();
		t6.tirar(1,1);
		juego t7=new juego();
		t7.tirar(1,1);
		juego t8=new juego();
		t8.tirar(1,1);
		juego t9=new juego();
		t9.tirar(1,1);
		juego t10=new juego();
		t10.tirar(1,1);
		juego extra=new juego();
		
		extra.tiroExtra(1,1);
		
		assertEquals(20, t1.juegoDefinidoTotal(t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, extra));
	}
	@Test
	public void testContabilizarJuegoSoloPleno() {
		juego t1=new juego();
		t1.tirar(3,7);
		juego t2=new juego();
		t2.tirar(6,7);
		juego t3=new juego();
		t3.tirar(10,7);
		juego t4=new juego();
		t4.tirar(2,7);
		juego t5=new juego();
		t5.tirar(10,7);
		juego t6=new juego();
		t6.tirar(10,7);
		juego t7=new juego();
		t7.tirar(1,7);
		juego t8=new juego();
		t8.tirar(10,7);
		juego t9=new juego();
		t9.tirar(1,7);
		juego t10=new juego();
		t10.tirar(10,7);
		assertEquals(50,t1.juegoDefinidoTotalPlenos(t1, t2, t3, t4, t5, t6, t7, t8, t9, t10));
	}
	@Test
	public void testContabilizarJuegoPlenos() {
		juego t1=new juego();
		t1.tirar(0,0);
		juego t2=new juego();
		t2.tirar(0,0);
		juego t3=new juego();
		t3.tirar(0,0);
		juego t4=new juego();
		t4.tirar(0,0);
		juego t5=new juego();
		t5.tirar(0,0);
		juego t6=new juego();
		t6.tirar(0,0);
		juego t7=new juego();
		t7.tirar(0,0);
		juego t8=new juego();
		t8.tirar(0,0);
		juego t9=new juego();
		t9.tirar(10,0);
		juego t10=new juego();
		t10.tirar(10,7);
		juego extra=new juego();
		if(t10.pleno) {
			extra.tiroExtra(1,1);
			}else {
				extra.tiroExtra(0,0);
			}
		assertEquals(32, t1.contabilizarConPlenos(t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, extra));
	}
	
	
}
