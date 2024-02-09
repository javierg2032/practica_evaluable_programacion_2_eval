import java.util.*;

public class Ejercicio_A2 {

	public static void main(String[] args) {
		/*
		 * Escribe una funcion que cambia de forma aleatoria los elementos contenidos en la
		 * tabla t, si la tabla estuviera ordenada, dejaría de estarlo
		 */

		int t[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		desordenar(t);
	}

	public static void desordenar(int t[]) {

		for (int i = t.length - 1; i > 0; i--) {
			int indiceAleatorio = (int) (Math.random() * (i + 1));

			int temporal = t[i]; // temporal tiene el valor de lo que hay en el indice i del array
			t[i] = t[indiceAleatorio]; // igualamos el indice original al indice aleatorio
			t[indiceAleatorio] = temporal; // asignamos al indice aleatorio el valor de la variable temporal
		}
		System.out.println(Arrays.toString(t));
	}
}