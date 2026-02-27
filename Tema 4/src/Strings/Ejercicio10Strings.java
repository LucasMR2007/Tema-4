package Strings;

public class Ejercicio10Strings {

	public static void main(String[] args) {
		String nombres[] = { " luis", "Carlos ", "Víctor", "María", "alberto", "Alejandra", "Lucía", " Silvia", "darío",
				"Nerea" };

		System.out.println("Lista normal: ");
		imprimirCadena(nombres);
		System.out.println("Sin espacios y con mayusculas: ");
		quitarEspacios(nombres);
		ponerMayusculas(nombres);
		imprimirCadena(nombres);
		System.out.println("Sin espacios, con mayusculas y odrdenado: ");
		quitarEspacios(nombres);
		ponerMayusculas(nombres);
		ordenarArray(nombres);
		imprimirCadena(nombres);

	}

	public static void ordenarArray(String nombres[]) {
		String[] arrays = new String[nombres.length];
		for (int i = 0; i < nombres.length - 1; i++) {
			int menor = i;

			for (int j = i; j < arrays.length; j++) {
				if (nombres[j].compareTo(nombres[menor]) < 0) {
					menor = j;

				}

			}
			String aux = nombres[i];
			nombres[i] = nombres[menor];
			nombres[menor] = aux;

		}

	}

	public static void imprimirCadena(String nombres[]) {
		for (int i = 0; i < nombres.length; i++) {
			System.out.print(nombres[i].toUpperCase() + " ");
		}
		System.out.println();
	}

	public static void quitarEspacios(String nombres[]) {
		for (int i = 0; i < nombres.length; i++) {
			nombres[i]=nombres[i].strip();
		}


	}
	public static void ponerMayusculas(String nombres[]) {
		for (int i = 0; i < nombres.length; i++) {
			nombres[i]=nombres[i].toUpperCase();
		}
	}

}
