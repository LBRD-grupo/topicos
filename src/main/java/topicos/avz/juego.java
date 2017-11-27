package topicos.avz;

public class juego {
	int tiro1;
	int tiro2;
	int suma;
	public void tirar(int i, int j) {
		// TODO Auto-generated method stub
		tiro1=i;
		if(tiro1>10) {
			tiro1=10;
		}else {
			if(tiro1==10) {
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
}
