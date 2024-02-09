import java.util.*;

public class Ejercicio_B1 {

	public static void main(String[] args) {
		/*
		 * Escribe una función que tome como parámetro una cadena y devuelva el número
		 * de palabras contenidas en la cadena
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce una frase: ");
		String cadena = sc.nextLine();

		System.out.println(cuentaPalabras(cadena));
	}

	public static int cuentaPalabras(String cadena) {
		int cantidad = 0;
		char frase[] = cadena.toCharArray();
		for (int i = 0; i < frase.length; i++) {
			if (frase[i] == ' ') {
				cantidad++;
			}
			if (i == frase.length - 1) { // cuenta la ultima palabra de la frase
				cantidad++;
			}
		}
		return cantidad;

	}

}
