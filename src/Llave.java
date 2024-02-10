import java.util.Arrays;

public class Llave {
	// ATRIBUTOS
	private int id;
	private String combinacion;

	// CONSTRUCTORES
	public Llave(int idUnico) {
		this.id = id;
	}

	// GETTERS Y SETTERS
	public int getIdUnico() {
		return id;
	}

	public void setIdUnico(int id) {
		this.id = id;
	}

	public String getCombinacion() {
		return combinacion;
	}

	public void setCombinacion(String combinacion) {
		this.combinacion = combinacion;
	}

	// METODOS DE LA CLASE
	public void muestraInfo() {
		System.out.println(
				"Identificador: " + id + "\n" + "Combinacion: " + combinacion );
	}

	public void abrirCerradura(Cerradura cerradura) {
		if (cerradura.getCombinacion().equals(combinacion) && !cerradura.isEstaAbierto()) {
			cerradura.setEstaAbierto(true);
			System.out.println("¡La cerradura ha sido abierta!");
		} else {
			System.out.println("La llave no coincide con la cerradura o ya esta abierta.");
		}
	}

	public void cerrarCerradura(Cerradura cerradura) {
		if (cerradura.getCombinacion().equals(combinacion) && cerradura.isEstaAbierto()) {
			cerradura.setEstaAbierto(false);
			System.out.println("¡La cerradura ha sido cerrada!");
		} else {
			System.out.println("La llave no coincide con la cerradura o  ya esta cerrada.");
		}
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