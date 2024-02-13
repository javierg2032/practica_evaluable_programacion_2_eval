import java.util.Arrays;

public class Jugador {
	// ATRIBUTOS
	private String nombre;
	private Carta mano[];

	// CONSTRUCTORES
	public Jugador(String nombre, Carta mano[]) {
		this.nombre = nombre;
		this.mano = mano;
	}

	// GETTERS Y SETTERS

	// METODOS DE LA CLASE
	public void muestraJugador() {
		System.out.println("Nombre: " + nombre);
		System.out.println("Mano: ");
		for (int i = 0; i < mano.length; i++) {
			System.out.print(mano[i].muestraCarta());
		}
	}

	public void tirarCarta(int indice) {
		System.arraycopy(mano, indice + 1, mano, indice, mano.length - indice - 1);
		mano = Arrays.copyOf(mano, mano.length);
	}
}
