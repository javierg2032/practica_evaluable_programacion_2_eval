import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio_B5 {

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
