package org.generatio.poligono;

public class test {

	public static void main(String[] args) {
		try {
			Triangolo triangolo = new Triangolo(4, 2.4, 9.1, 8.4);
			System.out.println(triangolo.calcolaArea());
			System.out.println(triangolo.calcolaPerimetro());
			Quadrato quadrato = new Quadrato(9.5);
			System.out.println(quadrato.calcolaPerimetro());
			System.out.println(quadrato.calcolaArea());
		} catch (Exception e) {
			System.out.println("\nQualcosa è andato storto:");
			System.out.println(e.getMessage());
		}
	}

}
