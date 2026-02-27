package Strings;

public class Ejercicio3Strings {
	final static int LONGITUD_CADENA = 3;

	public static void main(String[] args) {
		String[] palabras = generarArrayStringsAleatorios(1000);
		imprimirArray(palabras);
		for (int i = 0; i < palabras.length; i++) {
			int contador = contarPalabra(palabras, palabras[i]);
			if (contador > 1) {
			
				boolean imprimo = true;
				for (int j = i - 1; j > 0; j--) {
					if (palabras[j].equals(palabras[i])) {
						imprimo=false;
					}
				}
				if (imprimo==true) {
					System.out.println(palabras[i] + ": " + contador);
				}
			}

		}

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

	private static int contarPalabra(String palabras[], String palabra) {
		int contador = 0;
		for (int i = 0; i < palabras.length; i++) {

			if (palabra.equals(palabras[i])) {
				contador++;
			}
		}
		return contador;

	}
}
