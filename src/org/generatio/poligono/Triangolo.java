package org.generatio.poligono;

public class Triangolo implements Poligono {
	double base;
	double lato2;
	double lato3;
	double altezza;

	public Triangolo(double base, double lato2, double lato3, double altezza) {
		super();
		validaDato(base);
		validaDato(altezza);
		validaDato(lato2);
		validaDato(lato3);

		this.base = base;
		this.lato2 = lato2;
		this.lato3 = lato3;
		this.altezza = altezza;
	}

	private void validaDato(double dato) throws IllegalArgumentException {
		if (dato < 0)
			throw new IllegalArgumentException("Il numero inserito non puo essere minore di 0");
	}

	@Override
	public double calcolaPerimetro() {
		return base + lato2 + lato3;

	}

	@Override
	public double calcolaArea() {
		return (base * altezza) / 2;

	}

}
