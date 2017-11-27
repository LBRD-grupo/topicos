package topicos.avz;

public class juego {
	int tiro1;
	int tiro2;
	int suma;
	boolean pleno=false;
	public void tirar(int i, int j) {
		// TODO Auto-generated method stub
		tiro1=i;
		
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
			return 0;
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
		if(t10.pleno=false) {
			extra.tiro1=0;
			extra.tiro2=0;
			extra.suma=0;
		}
		return t1.suma+t2.suma+t3.suma+t4.suma+t5.suma+t6.suma+t7.suma+t8.suma+t9.suma+t10.suma+extra.suma;
	}
	
	public int juegoDefinidoTotalPlenos(juego t1,juego t2,juego t3,juego t4,juego t5,juego t6,juego t7,juego t8,juego t9,juego t10) {
	int total=0;
	if(t1.pleno) {
		total=total+t1.suma;
	}
	if(t2.pleno) {
		total=total+t2.suma;
	}
	if(t3.pleno) {
		total=total+t3.suma;
	}
	if(t4.pleno) {
		total=total+t4.suma;
	}
	if(t5.pleno) {
		total=total+t5.suma;
	}
	if(t6.pleno) {
		total=total+t6.suma;
	}
	if(t7.pleno) {
		total=total+t7.suma;
	}
	if(t8.pleno) {
		total=total+t8.suma;
	}
	if(t9.pleno) {
		total=total+t9.suma;
	}
	if(t10.pleno) {
		total=total+t10.suma;
	}
	return total;
	}
	
	public int contabilizarConPlenos(juego t1,juego t2,juego t3,juego t4,juego t5,juego t6,juego t7,juego t8,juego t9,juego t10,juego extra) {
		int total=0;
		total=total+t1.suma;
		if(t1.pleno) {
			total=total+t2.suma+10;
		}else {
			total=total+t2.suma;
		}
		if(t2.pleno) {
			total=total+t3.suma+10;
		}else{total=total+t3.suma;
		}
		if(t3.pleno) {
			total=total+t4.suma+10;
		}
		else {
			total=total+t4.suma;
		}
		if(t4.pleno) {
			total=total+t5.suma+10;
		}
		else {
			total=total+t5.suma;
		}
		if(t5.pleno) {
			total=total+t6.suma+10;
		}
		else {
			total=total+t6.suma;
		}
		if(t6.pleno) {
			total=total+t7.suma+10;
		}
		else {
			total=total+t7.suma;
		}
		if(t7.pleno) {
			total=total+t8.suma+10;
		}
		else {
			total=total+t8.suma;
		}
		
		if(t8.pleno) {
			total=total+t9.suma+10;
		}
		else {
			total=total+t9.suma;
		}
		if(t9.pleno) {
			total=total+t10.suma+10;
		}
		else {
			total=total+t10.suma;
		}
		total=extra.tiro1+extra.tiro2+total;
		return total;
	}
	
	
}