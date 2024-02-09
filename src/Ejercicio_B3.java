import java.util.Scanner;

public class Ejercicio_B3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce la frase: ");
		String cadena = sc.nextLine();

		System.out.println(estaOrdenada(cadena));

	}
	
	public static boolean estaOrdenada(String cadena) {
		boolean ordenada=true;
		
		char frase[] = cadena.toCharArray();
		for(int i=1;i<frase.length;i++) {
			if(frase[i]<frase[i-1]) {
				ordenada=false;
			}
		}
		
		return ordenada;
	}

}
