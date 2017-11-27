package topicos.avz;

public class juego {
	int tiro1;
	int tiro2;
	int suma;
	public void tirar(int i, int j) {
		// TODO Auto-generated method stub
		tiro1=i;
		tiro2=j;
		sumarTiros();
	}
	public void sumarTiros() {
		suma=tiro1+tiro2;
	}
}
