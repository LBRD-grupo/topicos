package topicos.avz;

public class juego {
	int tiro1;
	int tiro2;
	int suma;
	boolean pleno=false;
	public void tirar(int i, int j) {
		// TODO Auto-generated method stub
		tiro1=i;
		if(tiro1>10) {
			tiro1=10;
		}else {
			if(tiro1==10) {
				pleno=true;
				tiro2=0;
			}
		}
		if (tiro1<10) {
			tiro2=j;
			if(tiro2>(10-tiro1)) {
				tiro2=10-tiro1;
			}
		}
		sumarTiros();
	}
	public void sumarTiros() {
		suma=tiro1+tiro2;
	}
	public int contabilizarPleno() {
		if(pleno) {
			return tiro1;
		}else {
			return tiro2;
		}
	}
	public void tiroExtra(int i, int j) {
		tiro1=i;
		tiro2=j;
		if(tiro1>10) {
			tiro1=10;
		}
		if(tiro2>10) {
			tiro2=10;
		}
		suma=tiro1+tiro2;
	}
	public int juegoDefinidoTotal(juego t1,juego t2,juego t3,juego t4,juego t5,juego t6,juego t7,juego t8,juego t9,juego t10,juego extra) {
		return t1.suma+t2.suma+t3.suma+t4.suma+t5.suma+t6.suma+t7.suma+t8.suma+t9.suma+t10.suma+extra.suma;
	}
}