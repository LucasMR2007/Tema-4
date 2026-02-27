package Strings;

public class Ejercicio9Strings {

	public static void main(String[] args) {
		String nombres[] = { "Luis", "Carlos", "Víctor", "María", "Alberto", "Alejandra", "Lucía", "Silvia", "Darío",
				"Nerea" };
		ordenarArray(nombres);
		System.out.println("Lista de palabras ordenadas");
		for(String nombre: nombres) {
			System.out.println(nombre);
		}

	}
	public static void ordenarArray(String nombres[]) {
		String[] arrays = new String[nombres.length];
		for (int i = 0; i < nombres.length; i++) {
			int menor = i;

			for (int j = i; j < arrays.length; j++) {
				if (nombres[j].compareTo(nombres[menor])<0) {
					menor = j;

				}

			}
			String aux = nombres[i];
			nombres[i] = nombres[menor];
			nombres[menor] = aux;

		}

	}
	

}
