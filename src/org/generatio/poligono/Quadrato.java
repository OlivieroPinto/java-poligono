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
	public void calcolaPerimetro() {
		System.out.println("Il perimetro é: " + lato * 4);
	}

	@Override
	public void calcolaArea() {
		System.out.println("l area é: " + lato * lato);
	}

}
