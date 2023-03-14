package Es2;

public class Chiamata {
	private double durata;
	private int numeroContattato;

	public Chiamata(double a, int b) {
		this.durata = a;
		this.numeroContattato = b;
	}

	public double getDurate() {
		return durata;
	}

	public int getNumeroContattato() {
		return numeroContattato;
	}
}
