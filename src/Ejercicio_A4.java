import java.util.*;

public class Ejercicio_A4 {
	/*
	 * crea una función que encuentre el primer elemento no consecutivo de un array
	 * de números enteros. Si el array entero es consecutivo entonces debe devolver
	 * null. El array debe tener al menos 2 números enteros Los números deben ser
	 * únicos en el array, y deben estar ordenados en orden ascendente Los números
	 * pueden ser positivos o negativos
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce la longitud del array: ");
		int longitud = sc.nextInt();
		int n = 0;
		boolean esConsecutivo = false;

		while (longitud < 2) { // longitud array
			System.out.println("La longitud del array no es válida, como mínimo debe almacenar 2 numeros enteros: ");
			longitud = sc.nextInt();
		}

		int t[] = new int[longitud];

		for (int i = 0; i < t.length; i++) { // no dejar repetidos
			boolean repetido;

			do {
				repetido = false;
				System.out.println("Introduce un numero entero en el array");
				n = sc.nextInt();

				for (int j = 0; j < i; j++) {
					if (t[j] == n) {
						repetido = true;
						System.out.println("Este número ya ha sido introducido. Introduce otro número: ");
						break;
					}
				}
			} while (repetido == true);

			t[i] = n;
		}

		Arrays.sort(t);// ordenar array
		System.out.println(consecutivos(t));
	}

	public static Integer consecutivos(int t[]) {
		boolean esConsecutivo = true;
		int n = 0;

		for (int i = 1; i < t.length; i++) {
			if (t[i] - t[i - 1] != 1) {
				n = t[i];
				esConsecutivo = false;
				break; // termino el bucle en cuanto haya un numero no consecutivo
			}
		}

		if (esConsecutivo == true) {
			return null;
		} else {
			return n;
		}
	}
}