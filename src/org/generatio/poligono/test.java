package org.generatio.poligono;

public class test {

	public static void main(String[] args) {
		try {
			Triangolo triangolo = new Triangolo(-4, 2.4, 9.1, 8.4);
			triangolo.calcolaArea();
			triangolo.calcolaPerimetro();
			Quadrato quadrato = new Quadrato(9.5);
			quadrato.calcolaArea();
			quadrato.calcolaArea();
		} catch (Exception e) {
			System.out.println("\nQualcosa è andato storto:");
			System.out.println(e.getMessage());
		}
	}

}
