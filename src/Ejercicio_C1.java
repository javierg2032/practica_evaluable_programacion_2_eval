
public class Ejercicio_C1 {

	public static void main(String[] args) {

		Cerradura cerradura1 = new Cerradura(1, false);

		Llave llave1 = new Llave(47);
		Llave llave2 = new Llave(95);

		cerradura1.muestraInfo();
		llave1.muestraInfo();
		llave2.muestraInfo();
		llave1.abrirCerradura(cerradura1);
		llave2.abrirCerradura(cerradura1);
		llave1.cerrarCerradura(cerradura1);
		llave2.cerrarCerradura(cerradura1);
	}

}
