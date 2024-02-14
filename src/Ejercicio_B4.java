import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio_B4 { // Escribe una función que tome como parámetro una cadena y devuelva la cadena
							// ordenada por la longitud de las palabras que la forman, desde la más corta a
							// la más larga. Si dos palabra tienen la misma longitud entonces se ordenarán
							// alfabéticamente
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce la frase: ");
		String cadena = sc.nextLine();

		System.out.println(ordenarPorLongitud(cadena));

	}

	public static String ordenarPorLongitud(String cadena) {
		int cantidad = 0;
		int letras = 0;
		char frase[] = cadena.toCharArray();

		for (int i = 0; i < frase.length; i++) {
			if (frase[i] != ' ') {
				letras++;
			}
			if (frase[i] == ' ' || i == frase.length - 1) {
				cantidad++;
				letras = 0;
			}
		}

		String arrayCadenaOrdenada[] = new String[cantidad];
		int indicePalabraActual = 0;

		for (int i = 0; i < frase.length; i++) {
			if (frase[i] != ' ') {
				arrayCadenaOrdenada[indicePalabraActual] = (arrayCadenaOrdenada[indicePalabraActual] == null ? ""
						: arrayCadenaOrdenada[indicePalabraActual]) + frase[i];
				letras++;
			}
			if (frase[i] == ' ' || i == frase.length - 1) {
				indicePalabraActual++;
				letras = 0;
			}
		}

		Arrays.sort(arrayCadenaOrdenada);
		String cadenaOrdenada = Arrays.toString(arrayCadenaOrdenada);
		return cadenaOrdenada;

	}
}
