import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio_B5 {// Escribe una función que tome como parámetro una cadena y devuelva un array en
							// el que una letra mayúscula represente a una persona levantada. La cadena de
							// entrada debe estar en minúsculas. Si la letra es un espacio en blanco
							// entonces se pasa a la siguiente letra

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce la palabra: ");
		String cadena = sc.nextLine();

		System.out.println(Arrays.toString(ola(cadena)));
	}

	public static String[] ola(String cadena) {
		int n = cadena.length();
		String[] resultado = new String[n];

		for (int i = 0; i < n; i++) {
			char[] temp = cadena.toCharArray();

			if (temp[i] != ' ') {
				temp[i] = Character.toUpperCase(temp[i]);
				resultado[i] = new String(temp);
			} else {
				resultado[i] = cadena;
			}
		}

		return resultado;
	}

}
