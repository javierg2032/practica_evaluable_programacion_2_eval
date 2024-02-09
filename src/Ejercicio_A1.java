import java.util.*;

public class Ejercicio_A1 {
	// crea una funcion que crea y devuelve una tabla con todos los índices de los
	// elementos donde se encuentra la clave de búsqueda. En el
	// caso de que la clave no se encuentre en la tabla t, la
	// función devolverá una tabla vacía.

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int t[] = { 1, 2, 2, 5, 6, 7, 4, 9, 8, 5, 2, 1, 5, 9, 7, 5, 3 };
		int clave = sc.nextInt();

		System.out.println(Arrays.toString(buscarTodos(t, clave)));

	}

	public static int[] buscarTodos(int t[], int clave) {
		int tablaClave[] = new int[0];
		for (int i = 0; i < t.length; i++) {
			if (t[i] == clave) {
				tablaClave = Arrays.copyOf(tablaClave, tablaClave.length + 1);
				tablaClave[tablaClave.length - 1] = i;
			}
		}
		return tablaClave;
	}

}
