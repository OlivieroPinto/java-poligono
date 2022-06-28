package org.generatio.poligono;

public class Quadrato implements Poligono {
	double lato;

	public Quadrato(double lato) {
		super();
		validaDato(lato);

		this.lato = lato;
	}

	private void validaDato(double dato) throws IllegalArgumentException {
		if (dato < 0)
			throw new IllegalArgumentException("Il numero inserito non puo essere minore di 0");
	}

	@Override
	public String calcolaPerimetro() {
		return "Il perimetro é: " + lato * 4;
	}

	@Override
	public String calcolaArea() {
		return "l area é: " + (lato * lato);
	}

	@Override
	public String toString() {
		return "Quadrato [calcolaPerimetro()=" + calcolaPerimetro() + ", calcolaArea()=" + calcolaArea() + "]";
	}

}
