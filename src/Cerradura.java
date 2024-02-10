import java.util.Arrays;

public class Cerradura {
	// ATRIBUTOS
	private int id = 0;
	private String combinacion = "";
	private boolean estaAbierto = false;

	// CONSTRUCTORES
	public Cerradura(int id, boolean estaAbierto) {
		this.id = id;
		this.estaAbierto = estaAbierto;
	}

	// GETTERS Y SETTERS
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCombinacion() {
		return combinacion;
	}

	public void setCombinacion(String combinacion) {
		this.combinacion = combinacion;
	}

	public boolean isEstaAbierto() {
		return estaAbierto;
	}

	public void setEstaAbierto(boolean estaAbierto) {
		this.estaAbierto = estaAbierto;
	}

	// METODOS DE LA CLASE
	public void muestraInfo() {
		System.out.println(
				"Identificador: " + id + "\n" + "Combinacion: " + combinacion + "\n" + "Estado: " + estaAbierto);
	}

	public String generaCombinacion() {
		this.combinacion = "";
		char t[] = new char[64];
		String alfanumericos = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
		char caracteres[] = alfanumericos.toCharArray();
		int longitudCaracteres = caracteres.length;

		for (int i = 0; i < 64; i++) {
			int indiceAleatorio = (int) (Math.random() * longitudCaracteres);
			t[i] = caracteres[indiceAleatorio];
		}
		combinacion = Arrays.toString(t);
		return combinacion;
	}
}
