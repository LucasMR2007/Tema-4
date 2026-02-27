package Strings;

public class Ejercicio2Strings {
	final static int LONGITUD_CADENA = 3;

	public static void main(String[] args) {

		String[] palabras = generarArrayStringsAleatorios(1000);
		imprimirArray(palabras);
		buscarPalabra(palabras);

	}

	private static String generarPalabraAleatoria() {
		String palabra = "";
		for (int i = 0; i < LONGITUD_CADENA; i++) {
			char letraAleatoria = (char) ((Math.random() * 26) + 'A');
			if ((int) (Math.random() * 2) == 1) {
				letraAleatoria = Character.toLowerCase(letraAleatoria);

			}
			palabra = palabra + letraAleatoria;
		}
		return palabra;
	}

	private static String[] generarArrayStringsAleatorios(int tamanno) {
		String[] palabras = new String[tamanno];

		for (int i = 0; i < tamanno; i++) {
			palabras[i] = generarPalabraAleatoria();
		}

		return palabras;
	}

	public static void imprimirArray(String[] palabras) {

		for (int i = 0; i < palabras.length; i++) {
			System.out.print(palabras[i] + " ");
		}
		System.out.println();
	}

	public static void buscarPalabra(String[] palabras) {
		int contador;

		for (int i = 0; i < palabras.length; i++) {
			contador = 1;

			for (int j = i + 1; j < palabras.length - 1; j++) {
				if (palabras[i].equals(palabras[j])) {

					contador++;
					System.out.println(palabras[i] + ": " + contador);
				}

			}

		}
	}
}
