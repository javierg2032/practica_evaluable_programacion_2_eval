import java.util.Scanner;

public class Ejercicio_B2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce la duracion: ");
		String duracion = sc.nextLine();

		System.out.println(minutosASegundos(duracion));

	}

	public static int minutosASegundos(String duracion) {
		int totalSegundos = 0;
		int cantidadMinutos = 0;
		int sumaMinutos = 0;
		int sumaSegundos = 0;
		int convierteMinutos = 0;
		char t[] = duracion.toCharArray();
		for (int i = 0; i < t.length; i++) {
			if (t[i] != ':') {
				cantidadMinutos++;
			} else {
				break;
			}
		}

		int minutos[] = new int[cantidadMinutos];
		for (int i = 0; i < minutos.length; i++) {
			minutos[i] = t[i] - '0'; // al restar '0' lo convierte en int
		}
		for (int i = 0; i < minutos.length; i++) {
			minutos[i] = minutos[i] * (int) Math.pow(10, cantidadMinutos - 1);
			sumaMinutos = sumaMinutos + minutos[i];
			cantidadMinutos--;
		}

		convierteMinutos = sumaMinutos * 60;

		int segundos[] = new int[2];
		segundos[0] = (t[t.length - 2] - '0') * 10;
		segundos[1] = t[t.length - 1] - '0';

		sumaSegundos = segundos[0] + segundos[1];

		totalSegundos = convierteMinutos + sumaSegundos;

		return totalSegundos;
	}

}