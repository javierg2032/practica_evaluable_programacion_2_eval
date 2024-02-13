
public class Carta {
	// ATRIBUTOS
	private int numero;
	private int valor;
	private String palo;
	private boolean esMuestra;

	// CONSTRUCORES
	public Carta(int numero, String palo) {
		this.numero = numero;
		this.palo = palo;
	}

	// GETTERS Y SETTERS

	public void setValor(int valor) {
		this.valor = valor;
	}

	public int getValor() {
		return valor;
	}

	public void setEsMuestra(boolean esMuestra) {
		this.esMuestra = esMuestra;
	}

	public boolean getEsMuestra() {
		return esMuestra;
	}

	// METODOS DE LA CLASE
	public String muestraCarta() {
		return "El " + numero + " de " + palo + ", valor: " + valor + ", es muestra: " + esMuestra + "\n";
	}
}
