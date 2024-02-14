import java.util.Scanner;

public class Ejercicio_B3 { // Escribe una función que analice una cadena y devuelva true si todos los
							// caracteres de la cadena están ordenados, y false en caso contrario.

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce la frase: ");
		String cadena = sc.nextLine();

		System.out.println(estaOrdenada(cadena));

	}

	public static boolean estaOrdenada(String cadena) {
		boolean ordenada = true;
		if (!cadena.isEmpty()) {

			char frase[] = cadena.toCharArray(); // convierte la cadena en un array de chars
			for (int i = 1; i < frase.length; i++) {
				if (frase[i] < frase[i - 1]) {
					ordenada = false;
				}
			}

		} else {
			ordenada = false;
		}
		return ordenada;
	}

}
