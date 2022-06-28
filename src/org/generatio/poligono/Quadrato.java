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
	public double calcolaPerimetro() {
		return lato * 4;
	}

	@Override
	public double calcolaArea() {
		return lato * lato;
	}

}
