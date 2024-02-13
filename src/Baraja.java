import java.util.Arrays;

public class Baraja {
	// ATRIBUTOS
	private Carta mazo[];
	private int id;

	// CONSTRUCTORES
	public Baraja(int id) {
		this.id = id;
		mazo = new Carta[40];

		for (int i = 0; i < 7; i++) {
			mazo[i] = new Carta(i + 1, "oros");
		}
		mazo[7] = new Carta(10, "oros");
		mazo[8] = new Carta(11, "oros");
		mazo[9] = new Carta(12, "oros");

		for (int i = 10; i < 17; i++) {
			mazo[i] = new Carta(i + 1 - 10, "copas");
		}
		mazo[17] = new Carta(10, "copas");
		mazo[18] = new Carta(11, "copas");
		mazo[19] = new Carta(12, "copas");

		for (int i = 20; i < 27; i++) {
			mazo[i] = new Carta(i + 1 - 20, "espadas");
		}
		mazo[27] = new Carta(10, "espadas");
		mazo[28] = new Carta(11, "espadas");
		mazo[29] = new Carta(12, "espadas");

		for (int i = 30; i < 37; i++) {
			mazo[i] = new Carta(i + 1 - 30, "bastos");
		}
		mazo[37] = new Carta(10, "bastos");
		mazo[38] = new Carta(11, "bastos");
		mazo[39] = new Carta(12, "bastos");

	}

	// GETTERS Y SETTERS

	// METODOS DE LA CLASE
	public void muestraBaraja() {
		for (int i = 0; i < mazo.length; i++) {
			System.out.print(mazo[i].muestraCarta());
		}

	}
}
