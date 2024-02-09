public class Ejercicio_A5 {

	public static void main(String[] args) {
		/*
		 * Supongamos un array bidimensional que representa las temperaturas máximas
		 * registradas en una ciudad durante un año (en grados Celsius). Cada fila del
		 * array representa un mes, y cada columna representa un día del mes (suponer
		 * todos los meses de 30 días) Escribe un programa en Java que procese el array
		 * y obtenga la siguiente información: Calcular la temperatura media de cada
		 * mes. Encontrar el día más caluroso del año y en qué mes ocurrió. Encontrar el
		 * día más frío del año y en qué mes ocurrió.
		 */

		int diaMasCaluroso = 1;
		int mesMasCaluroso = 1;
		int diaMasFrio = 1;
		int mesMasFrio = 1;
		int[][] temperaturas = {
				{ 7, 4, 9, 3, 6, 10, 2, 8, 5, 11, 3, 7, 4, 9, 6, 8, 12, 5, 10, 2, 11, 4, 9, 6, 8, 12, 5, 10, 2, 7 },
				{ 4, 7, 9, 6, 12, 5, 11, 8, 10, 13, 3, 14, 7, 4, 6, 9, 11, 5, 8, 10, 12, 4, 13, 6, 8, 5, 10, 9, 11, 7 },
				{ 14, 16, 18, 13, 17, 15, 14, 16, 13, 18, 14, 17, 16, 15, 13, 18, 14, 17, 15, 13, 16, 18, 13, 14, 15,
						17, 16, 13, 14, 18 },
				{ 15, 17, 16, 18, 14, 17, 16, 15, 18, 14, 16, 17, 15, 18, 14, 16, 17, 15, 18, 14, 17, 16, 15, 18, 14,
						16, 17, 15, 18, 14 },
				{ 20, 22, 23, 24, 21, 22, 25, 23, 22, 24, 21, 20, 23, 22, 24, 21, 22, 25, 23, 22, 24, 21, 20, 23, 22,
						24, 21, 22, 25, 23 },
				{ 25, 26, 28, 27, 26, 25, 27, 28, 26, 25, 27, 28, 26, 25, 27, 28, 26, 25, 27, 28, 26, 25, 27, 28, 26,
						25, 27, 28, 26, 25 },
				{ 30, 32, 31, 33, 30, 32, 31, 33, 30, 32, 31, 33, 30, 32, 31, 33, 30, 32, 31, 33, 30, 32, 31, 33, 30,
						32, 31, 33, 30, 32 },
				{ 33, 35, 34, 36, 33, 35, 34, 36, 33, 35, 34, 36, 33, 35, 34, 36, 33, 35, 34, 36, 33, 35, 34, 36, 33,
						35, 34, 36, 33, 35 },
				{ 28, 27, 26, 25, 28, 27, 26, 25, 28, 27, 26, 25, 28, 27, 26, 25, 28, 27, 26, 25, 28, 27, 26, 25, 28,
						27, 26, 25, 28, 27 },
				{ 23, 22, 21, 20, 23, 22, 21, 20, 23, 22, 21, 20, 23, 22, 21, 20, 23, 22, 21, 20, 23, 22, 21, 20, 23,
						22, 21, 20, 23, 22 },
				{ 18, 17, 16, 15, 18, 17, 16, 15, 18, 17, 16, 15, 18, 17, 16, 15, 18, 17, 16, 15, 18, 17, 16, 15, 18,
						17, 16, 15, 18, 17 },
				{ 14, 13, 15, 14, 13, 15, 14, 13, 15, 14, 13, 15, 14, 13, 15, 14, 13, 15, 14, 13, 15, 14, 13, 15, 14,
						13, 15, 14, 13, 15 } };

		for (int i = 0; i < temperaturas.length; i++) {
			int suma = 0;
			for (int j = 0; j < temperaturas[0].length; j++) {
				suma += temperaturas[i][j];
			}
			double media = suma / temperaturas[0].length;
			System.out.println(media);
		}

		int temperaturaMaxima = temperaturas[0][0];

		for (int i = 0; i < temperaturas.length; i++) {
			for (int j = 0; j < temperaturas[0].length; j++) {
				if (temperaturas[i][j] > temperaturaMaxima) {
					temperaturaMaxima = temperaturas[i][j];
					mesMasCaluroso = i + 1;
					diaMasCaluroso = j + 1;
				}
			}
		}
		System.out.println("El dia mas caluroso del año fue el " + diaMasCaluroso + " del mes " + mesMasCaluroso);

		int temperaturaMinima = temperaturas[0][0];

		for (int i = 0; i < temperaturas.length; i++) {
			for (int j = 0; j < temperaturas[0].length; j++) {
				if (temperaturas[i][j] < temperaturaMinima) {
					temperaturaMinima = temperaturas[i][j];
					mesMasFrio = i + 1;
					diaMasFrio = j + 1;
				}
			}
		}
		System.out.println("El dia mas frio del año fue el " + diaMasFrio + " del mes " + mesMasFrio);
	}
}