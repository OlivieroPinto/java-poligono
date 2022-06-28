package org.generatio.poligono;

public class test {

	public static void main(String[] args) {
		try {
			Triangolo triangolo = new Triangolo(4, 2.4, 9.1, 8.4);
			System.out.println("l' area del triangolo �: " + triangolo.calcolaArea());
			System.out.println("il perimetro del triangolo � :" + triangolo.calcolaPerimetro());
			Quadrato quadrato = new Quadrato(9.5);
			System.out.println("il perimetro del quadrato �" + quadrato.calcolaPerimetro());
			System.out.println("l' area del quadrato �: " + quadrato.calcolaArea());
		} catch (Exception e) {
			System.out.println("\nQualcosa � andato storto:");
			System.out.println(e.getMessage());
		}
	}

}
